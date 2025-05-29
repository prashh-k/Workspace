#!/bin/bash

echo "------ Traversing 1D Array ------"

arr=(10 20 30 40 50)

# 1. Using traditional for loop with index
echo -n "Using for loop: "
for ((i=0; i<${#arr[@]}; i++)); do
    echo -n "${arr[i]} "
done
echo

# 2. Using for-each style loop
echo -n "Using for-each: "
for value in "${arr[@]}"; do
    echo -n "$value "
done
echo -e "\n"

echo "------ Traversing 2D Array ------"

# Define 2D array as a flat array with manual indexing
matrix=(1 2 3 4 5 6)
rows=2
cols=3

# 1. Using nested loops with indices
echo "Using nested for loop:"
for ((i=0; i<rows; i++)); do
    for ((j=0; j<cols; j++)); do
        index=$((i * cols + j))
        echo -n "${matrix[index]} "
    done
    echo
done

# 2. Using nested for-each style (simulated)
echo "Using nested for-each loop:"
count=0
for value in "${matrix[@]}"; do
    echo -n "$value "
    ((count++))
    if ((count % cols == 0)); then
        echo
    fi
done
echo
