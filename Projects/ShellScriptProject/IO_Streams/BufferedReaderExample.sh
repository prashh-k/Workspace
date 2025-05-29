#!/bin/bash

read_file_line_by_line() {
    local file_path="$1"

    if [[ -f "$file_path" ]]; then
        while IFS= read -r line; do
            echo "$line"
        done < "$file_path"
    else
        echo "Error reading file: '$file_path' does not exist or is not a regular file."
    fi
}

# Main logic
read_file_line_by_line "C:/WorkSpace/ShellScript_Codes/8. IO Streams/example2.txt"
