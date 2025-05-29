#!/bin/bash

# Declare associative arrays for names and grades
declare -A students
declare -a names

# Function to add a student
add_student() {
    local name="$1"
    local grade="$2"
    students["$name"]=$grade
    names+=("$name")
}

# Function to print students
print_students() {
    echo "$1"
    for name in "${names[@]}"; do
        echo "Student(name='$name', grade=${students[$name]})"
    done
}

# Function to sort students by grade
sort_students() {
    sorted_names=($(for name in "${names[@]}"; do
        echo "$name ${students[$name]}"
    done | sort -k2 -n | awk '{print $1}'))
    names=("${sorted_names[@]}")
}

# Main logic
add_student "Alice" 85
add_student "Bob" 92
add_student "Charlie" 78

print_students "Before sorting:"

sort_students

echo
print_students "After sorting:"
