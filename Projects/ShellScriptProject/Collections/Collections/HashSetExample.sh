#!/bin/bash

# Initialize an empty array to simulate a set
fruits=()

# Function to add an element to the set (if not already present)
add_to_set() {
    local item="$1"
    for fruit in "${fruits[@]}"; do
        if [[ "$fruit" == "$item" ]]; then
            return  # Already in set
        fi
    done
    fruits+=("$item")
}

# Function to remove an element from the set
remove_from_set() {
    local item="$1"
    local new_fruits=()
    for fruit in "${fruits[@]}"; do
        if [[ "$fruit" != "$item" ]]; then
            new_fruits+=("$fruit")
        fi
    done
    fruits=("${new_fruits[@]}")
}

# Function to print the set
print_set() {
    echo "Set: ${fruits[*]}"
}

# Main logic
add_to_set "Apple"
add_to_set "Banana"
add_to_set "Orange"
add_to_set "Mango"
add_to_set "Apple"  # Duplicate, will be ignored

print_set

# Check if "Banana" is in the set
for fruit in "${fruits[@]}"; do
    if [[ "$fruit" == "Banana" ]]; then
        echo "Banana is in the set."
        break
    fi
done

# Remove "Orange"
remove_from_set "Orange"

print_set
