import numpy as np

def demonstrate_1d_array_initialization():
    print("------ 1D Array Initialization ------")

    # 1. Static Initialization
    static_arr = [1, 2, 3, 4, 5]
    print("Static Init:", static_arr)

    # 2. Dynamic Initialization (default zeros)
    dynamic_arr = [0] * 5
    print("Dynamic Init:", dynamic_arr)

    # 3. Declared then initialized
    declared_arr = None
    declared_arr = [10, 20, 30]
    print("Declared then Init:", declared_arr)

    # 4. Initialization using loop
    loop_arr = [i * 2 for i in range(5)]
    print("Loop Init:", loop_arr)

    # 5. Using range (similar to Java Streams)
    stream_arr = list(range(5))
    print("Stream Init:", stream_arr)

    print()

def demonstrate_2d_array_initialization():
    print("------ 2D Array Initialization ------")

    # 1. Static Initialization
    static_matrix = [
        [1, 2, 3],
        [4, 5, 6]
    ]
    print("Static Init:")
    print_2d_array(static_matrix)

    # 2. Dynamic Initialization
    dynamic_matrix = [[0 for _ in range(3)] for _ in range(2)]
    print("Dynamic Init:")
    print_2d_array(dynamic_matrix)

    # 3. Jagged Array
    jagged_matrix = [None] * 2
    jagged_matrix[0] = [0] * 3
    jagged_matrix[1] = [0] * 2
    print("Jagged Init:")
    print_2d_array(jagged_matrix)

    # 4. Using nested loops
    loop_matrix = [[i + j for j in range(3)] for i in range(2)]
    print("Loop Init:")
    print_2d_array(loop_matrix)

    # 5. Using fill (NumPy for simplicity)
    fill_matrix = np.full((2, 3), 1).tolist()
    print("Arrays.fill Init:")
    print_2d_array(fill_matrix)

def print_2d_array(matrix):
    for row in matrix:
        print(" ".join(map(str, row)))
    print()

def main():
    demonstrate_1d_array_initialization()
    demonstrate_2d_array_initialization()

if __name__ == "__main__":
    main()
