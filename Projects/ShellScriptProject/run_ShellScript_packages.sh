#!/bin/bash

SRC_DIR="/c/Workspace/ShellScriptProject"

# Run a shell script and log output
run_shell_script() {
    local sh_file=$1
    local log_file="/c/Workspace/logs/ShellScriptProject.log"

    log() {
        local message="$1"
        local timestamp
        timestamp=$(date "+%Y-%m-%d %H:%M:%S")
        echo "[$timestamp] $message" | tee -a "$log_file"
    }

    log "Running: $sh_file"
    bash "$sh_file" 2>&1 | while IFS= read -r line; do log "$line"; done
}

# Run all .sh files in a directory
collect_and_run_shell_scripts() {
    local dir=$1

    for sh_file in "$dir"/*.sh; do
        [[ -f "$sh_file" ]] && run_shell_script "$sh_file"
    done
}

# Run all packages
scan_and_run_all() {
    find "$SRC_DIR" -type f -name "*.sh" | while read -r sh_file; do
        dir=$(dirname "$sh_file")
        collect_and_run_shell_scripts "$dir"
    done
}

# Run a specific package
run_specific_package() {
    echo "Available packages:"
    mapfile -t package_dirs < <(find "$SRC_DIR" -type f -name "*.sh" -exec dirname {} \; | sort -u)

    for i in "${!package_dirs[@]}"; do
        relative_path="${package_dirs[$i]#$SRC_DIR/}"
        echo "$((i+1)). $relative_path"
    done

    echo -n "Select a package number: "
    read choice

    if [[ $choice -ge 1 && $choice -le ${#package_dirs[@]} ]]; then
        selected_dir="${package_dirs[$((choice-1))]}"
        collect_and_run_shell_scripts "$selected_dir"
    else
        echo "Invalid choice."
    fi
}

# Menu
while true; do
    echo "=== Shell Script Runner Menu ==="
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
