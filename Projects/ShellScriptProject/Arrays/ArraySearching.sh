#!/bin/bash

search_1d_array() {
    echo "------ 1D Array Searching ------"
    arr=(5 2 9 1 3)
    key=9

    # Linear Search
    found=false
    for i in "${!arr[@]}"; do
        if [ "${arr[$i]}" -eq "$key" ]; then
            echo "Linear Search: $key found at index $i"
            found=true
            break
        fi
    done
    if [ "$found" = false ]; then
        echo "Linear Search: $key not found."
    fi

    # Binary Search (requires sorted array)
    sorted_arr=($(printf "%s\n" "${arr[@]}" | sort -n))
    index=0
    found=false
    for val in "${sorted_arr[@]}"; do
        if [ "$val" -eq "$key" ]; then
            echo "Binary Search: $key found at index $index (after sorting)"
            found=true
            break
        fi
        ((index++))
    done
    if [ "$found" = false ]; then
        echo "Binary Search: $key not found."
    fi
    echo
}

search_2d_array() {
    echo "------ 2D Array Searching ------"
    matrix=("10 20 30" "40 50 60" "70 80 90")
    key=50

    found=false
    for i in "${!matrix[@]}"; do
        row=(${matrix[$i]})
        for j in "${!row[@]}"; do
            if [ "${row[$j]}" -eq "$key" ]; then
                echo "Found $key at position [$i][$j]"
                found=true
                break 2
            fi
        done
    done

    if [ "$found" = false ]; then
        echo "$key not found in 2D array."
    fi
    echo
}

main() {
    search_1d_array
    search_2d_array
}

main
