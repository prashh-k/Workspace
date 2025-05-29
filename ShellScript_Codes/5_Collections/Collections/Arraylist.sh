#!/bin/bash

# Function to add a student to the list
add_student() {
    local student="$1"
    students+=("$student")
}

# Function to remove a student from the list
remove_student() {
    local student="$1"
    for i in "${!students[@]}"; do
        if [[ "${students[i]}" == "$student" ]]; then
            unset 'students[i]'
            break
        fi
    done
}

# Function to print the list of students
print_students() {
    echo "Student List: ${students[*]}"
}

# Main logic
students=()

# Add students
add_student "Alice"
add_student "Bob"
add_student "Charlie"

# Print students
print_students

# Remove a student
remove_student "Bob"

# Print students again
print_students
