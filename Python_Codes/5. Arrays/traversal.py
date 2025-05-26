def traverse_1d_array():
    print("------ Traversing 1D Array ------")

    arr = [10, 20, 30, 40, 50]

    # 1. Using traditional for loop with index
    print("Using for loop: ", end="")
    for i in range(len(arr)):
        print(arr[i], end=" ")
    print()

    # 2. Using enhanced for loop (Python's for-each style)
    print("Using for-each: ", end="")
    for value in arr:
        print(value, end=" ")
    print("\n")


def traverse_2d_array():
    print("------ Traversing 2D Array ------")

    matrix = [
        [1, 2, 3],
        [4, 5, 6]
    ]

    # 1. Using nested traditional for loops with indices
    print("Using nested for loop:")
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            print(matrix[i][j], end=" ")
        print()

    # 2. Using nested for-each loops
    print("Using nested for-each loop:")
    for row in matrix:
        for val in row:
            print(val, end=" ")
        print()
    print()


# Main function equivalent
if __name__ == "__main__":
    traverse_1d_array()
    traverse_2d_array()
