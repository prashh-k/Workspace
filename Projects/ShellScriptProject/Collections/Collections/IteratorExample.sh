#!/bin/bash

# Initialize the list
fruits=("Apple" "Banana" "Cherry")

# Simulate iteration
echo "Iterating through the list:"
for fruit in "${fruits[@]}"; do
    echo "$fruit"
done

# Remove "Banana" safely by creating a new list
filtered_fruits=()
for fruit in "${fruits[@]}"; do
    if [[ "$fruit" != "Banana" ]]; then
        filtered_fruits+=("$fruit")
    fi
done

# Update the original list
fruits=("${filtered_fruits[@]}")

# Display the list after removal
echo "List after removal: ${fruits[*]}"
