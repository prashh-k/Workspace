#!/bin/bash

sort_1d_array() {
    echo "------ 1D Array Sorting ------"
    arr=(5 2 9 1 3)

    # Sort in ascending order
    sorted_asc=($(printf "%s\n" "${arr[@]}" | sort -n))
    echo "Ascending: ${sorted_asc[@]}"

    # Sort in descending order
    sorted_desc=($(printf "%s\n" "${arr[@]}" | sort -nr))
    echo "Descending: ${sorted_desc[@]}"
    echo
}

sort_2d_array_row_wise() {
    echo "------ 2D Array Row-wise Sorting ------"
    matrix=("5 1 3" "8 4 2")

    echo "After sorting each row:"
    for row in "${matrix[@]}"; do
        sorted_row=($(echo $row | tr ' ' '\n' | sort -n))
        echo "${sorted_row[@]}"
    done
    echo
}

sort_2d_array_flattened() {
    echo "------ 2D Array Full Sorting (Flattened) ------"
    matrix=("9 7 5" "4 2 8")

    # Flatten the matrix
    flat=()
    for row in "${matrix[@]}"; do
        for val in $row; do
            flat+=($val)
        done
    done

    # Sort the flattened array
    sorted_flat=($(printf "%s\n" "${flat[@]}" | sort -n))

    # Refill the matrix (2x3)
    echo "Entire matrix sorted:"
    index=0
    for i in {0..1}; do
        row=()
        for j in {0..2}; do
            row+=(${sorted_flat[$index]})
            ((index++))
        done
        echo "${row[@]}"
    done
    echo
}

main() {
    sort_1d_array
    sort_2d_array_row_wise
    sort_2d_array_flattened
}

main
