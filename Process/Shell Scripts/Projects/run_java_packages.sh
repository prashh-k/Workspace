#!/bin/bash

SRC_DIR="/c/Workspace/JavaProject/src"

# Compile and run a Java file
compile_and_run() {
    local java_file=$1
    local package_path=$2
    local log_file="/c/Workspace/logs/JavaProject.logs"

    log() {
        local message="$1"
        local timestamp
        timestamp=$(date "+%Y-%m-%d %H:%M:%S")
        echo "[$timestamp] $message" | tee -a "$log_file"
    }

    log "Compiling: $java_file"
    javac -d "$SRC_DIR" "$java_file" 2>&1 | while IFS= read -r line; do log "$line"; done

    class_name=$(basename "$java_file" .java)
    full_class_name="${package_path//\//.}.$class_name"

    log "Running: $full_class_name"
    java -cp "$SRC_DIR" "$full_class_name" 2>&1 | while IFS= read -r line; do log "$line"; done
}

# Run all Java files in a directory
collect_and_run_java_files() {
    local dir=$1
    local package_path=${dir#$SRC_DIR/}

    for java_file in "$dir"/*.java; do
        [[ -f "$java_file" ]] && compile_and_run "$java_file" "$package_path"
    done
}

# Run all packages
scan_and_run_all() {
    find "$SRC_DIR" -type f -name "*.java" | while read -r java_file; do
        dir=$(dirname "$java_file")
        collect_and_run_java_files "$dir"
    done
}

# Run a specific package
run_specific_package() {
    echo "Available packages:"
    mapfile -t package_dirs < <(find "$SRC_DIR" -type f -name "*.java" -exec dirname {} \; | sort -u)

    for i in "${!package_dirs[@]}"; do
        relative_path="${package_dirs[$i]#$SRC_DIR/}"
        echo "$((i+1)). $relative_path"
    done

    echo -n "Select a package number: "
    read choice

    if [[ $choice -ge 1 && $choice -le ${#package_dirs[@]} ]]; then
        selected_dir="${package_dirs[$((choice-1))]}"
        selected_package="${selected_dir#$SRC_DIR/}"
        collect_and_run_java_files "$selected_dir" "$selected_package"
    else
        echo "Invalid choice."
    fi
}

# Menu
while true; do
    echo "=== Java Package Runner Menu ==="
    echo "1. Run specific package"
    echo "2. Run all packages"
    echo "3. Exit"
    echo -n "Enter your choice: "
    read choice

    case $choice in
        1) run_specific_package ;;
        2) scan_and_run_all ;;
        3) echo "Exiting..."; exit 0 ;;
        *) echo "Invalid choice. Try again." ;;
    esac
done
