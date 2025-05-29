#!/bin/bash

# Function to simulate return statement
add_numbers() {
    local a=$1
    local b=$2
    echo $((a + b))
}

main() {
    echo "=== Decision-Making (if-else) ==="
    num=10
    if [ "$num" -gt 0 ]; then
        echo "$num is positive."
    else
        echo "$num is negative."
    fi
    echo "-----------------------------------"

    # Match-case equivalent is not available in Bash directly

    echo "=== For Loop ==="
    for i in {1..5}; do
        echo "Iteration: $i"
    done
    echo "-----------------------------------"

    echo "=== While Loop ==="
    count=1
    while [ "$count" -le 3 ]; do
        echo "Count: $count"
        count=$((count + 1))
    done
    echo "-----------------------------------"

    echo "=== Do-While Loop (simulated) ==="
    do_count=1
    while true; do
        echo "Do Count: $do_count"
        do_count=$((do_count + 1))
        if [ "$do_count" -gt 2 ]; then
            break
        fi
    done
    echo "-----------------------------------"

    echo "=== Break Statement ==="
    for i in {1..5}; do
        if [ "$i" -eq 3 ]; then
            echo "Loop stopped at: $i"
            break
        fi
        echo "Iteration: $i"
    done
    echo "-----------------------------------"

    echo "=== Continue Statement ==="
    for i in {1..5}; do
        if [ "$i" -eq 3 ]; then
            echo "Skipping iteration: $i"
            continue
        fi
        echo "Iteration: $i"
    done
    echo "-----------------------------------"

    echo "=== Return Statement ==="
    result=$(add_numbers 5 10)
    echo "Sum: $result"
    echo "-----------------------------------"
}

# Run the main function
main
