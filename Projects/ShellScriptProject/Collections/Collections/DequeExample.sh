#!/bin/bash

# Initialize an empty deque (array)
deque=()

# Function to add to the front
append_left() {
    deque=("$1" "${deque[@]}")
}

# Function to add to the back
append() {
    deque+=("$1")
}

# Function to remove from the front
pop_left() {
    local removed="${deque[0]}"
    deque=("${deque[@]:1}")
    echo "$removed"
}

# Function to remove from the back
pop() {
    local last_index=$((${#deque[@]} - 1))
    local removed="${deque[$last_index]}"
    unset 'deque[last_index]'
    echo "$removed"
}

# Function to print the deque
print_deque() {
    echo "Deque: ${deque[*]}"
}

# Main logic
append_left "First"
append "Second"
append "Third"
append_left "Zeroth"

print_deque

removed_first=$(pop_left)
removed_last=$(pop)

echo "Removed First Element: $removed_first"
echo "Removed Last Element: $removed_last"

print_deque

# Peek front and back
front_element="${deque[0]}"
back_element="${deque[-1]}"
echo "Front Element: $front_element"
echo "Back Element: $back_element"

# Check if deque is empty
if [ ${#deque[@]} -eq 0 ]; then
    echo "Is the deque empty? true"
else
    echo "Is the deque empty? false"
fi
