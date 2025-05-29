def sort_1d_array():
    print("------ 1D Array Sorting ------")
    arr = [5, 2, 9, 1, 3]

    # Sort in ascending order
    arr.sort()
    print("Ascending:", arr)

    # Sort in descending order
    arr_desc = [5, 2, 9, 1, 3]
    arr_desc.sort(reverse=True)
    print("Descending:", arr_desc)
    print()

def sort_2d_array_row_wise():
    print("------ 2D Array Row-wise Sorting ------")
    matrix = [
        [5, 1, 3],
        [8, 4, 2]
    ]

    # Sort each row individually
    for row in matrix:
        row.sort()

    print("After sorting each row:")
    for row in matrix:
        print(row)
    print()

def sort_2d_array_flattened():
    print("------ 2D Array Full Sorting (Flattened) ------")
    matrix = [
        [9, 7, 5],
        [4, 2, 8]
    ]

    # Flatten the 2D array
    flat = [val for row in matrix for val in row]

    # Sort the flattened array
    flat.sort()

    # Refill the 2D array with sorted values
    rows = len(matrix)
    cols = len(matrix[0])
    index = 0
    for i in range(rows):
        for j in range(cols):
            matrix[i][j] = flat[index]
            index += 1

    print("Entire matrix sorted:")
    for row in matrix:
        print(row)
    print()

def main():
    sort_1d_array()
    sort_2d_array_row_wise()
    sort_2d_array_flattened()

if __name__ == "__main__":
    main()
