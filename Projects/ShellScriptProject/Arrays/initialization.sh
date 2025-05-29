#!/bin/bash

print_2d_array() {
    local -n matrix=$1
    for row in "${matrix[@]}"; do
        echo "$row"
    done
    echo
}

demonstrate_1d_array_initialization() {
    echo "------ 1D Array Initialization ------"

    # 1. Static Initialization
    static_arr=(1 2 3 4 5)
    echo "Static Init: ${static_arr[@]}"

    # 2. Dynamic Initialization (default zeros)
    dynamic_arr=(0 0 0 0 0)
    echo "Dynamic Init: ${dynamic_arr[@]}"

    # 3. Declared then initialized
    declared_arr=()
    declared_arr=(10 20 30)
    echo "Declared then Init: ${declared_arr[@]}"

    # 4. Initialization using loop
    loop_arr=()
    for ((i=0; i<5; i++)); do
        loop_arr+=($((i * 2)))
    done
    echo "Loop Init: ${loop_arr[@]}"

    # 5. Using range
    stream_arr=()
    for i in {0..4}; do
        stream_arr+=($i)
    done
    echo "Stream Init: ${stream_arr[@]}"
    echo
}

demonstrate_2d_array_initialization() {
    echo "------ 2D Array Initialization ------"

    # 1. Static Initialization
    static_matrix=("1 2 3" "4 5 6")
    echo "Static Init:"
    print_2d_array static_matrix

    # 2. Dynamic Initialization
    dynamic_matrix=()
    for ((i=0; i<2; i++)); do
        dynamic_matrix+=("0 0 0")
    done
    echo "Dynamic Init:"
    print_2d_array dynamic_matrix

    # 3. Jagged Array
    jagged_matrix=("0 0 0" "0 0")
    echo "Jagged Init:"
    print_2d_array jagged_matrix

    # 4. Using nested loops
    loop_matrix=()
    for ((i=0; i<2; i++)); do
        row=""
        for ((j=0; j<3; j++)); do
            row+="$((i + j)) "
        done
        loop_matrix+=("${row% }")
    done
    echo "Loop Init:"
    print_2d_array loop_matrix

    # 5. Using fill (simulate with 1s)
    fill_matrix=("1 1 1" "1 1 1")
    echo "Arrays.fill Init:"
    print_2d_array fill_matrix
}

main() {
    demonstrate_1d_array_initialization
    demonstrate_2d_array_initialization
}

main
