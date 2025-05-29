import bisect

def search_1d_array():
    print("------ 1D Array Searching ------")
    arr = [5, 2, 9, 1, 3]
    key = 9

    # 1. Linear Search
    found = False
    for i in range(len(arr)):
        if arr[i] == key:
            print(f"Linear Search: {key} found at index {i}")
            found = True
            break
    if not found:
        print(f"Linear Search: {key} not found.")

    # 2. Binary Search (requires sorted array)
    arr.sort()
    index = bisect.bisect_left(arr, key)
    if index < len(arr) and arr[index] == key:
        print(f"Binary Search: {key} found at index {index} (after sorting)")
    else:
        print(f"Binary Search: {key} not found.")
    print()

def search_2d_array():
    print("------ 2D Array Searching ------")
    matrix = [
        [10, 20, 30],
        [40, 50, 60],
        [70, 80, 90]
    ]
    key = 50

    found = False
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] == key:
                print(f"Found {key} at position [{i}][{j}]")
                found = True
                break
        if found:
            break

    if not found:
        print(f"{key} not found in 2D array.")
    print()

def main():
    search_1d_array()
    search_2d_array()

if __name__ == "__main__":
    main()
