package com.Arrays;

public class traversal {

    public static void main(String[] args) {
        traverse1DArray();
        traverse2DArray();
    }

    // Function to demonstrate traversal of a 1D array
    public static void traverse1DArray() {
        System.out.println("------ Traversing 1D Array ------");

        int[] arr = {10, 20, 30, 40, 50};

        // 1. Using traditional for loop
        System.out.print("Using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2. Using enhanced for loop (for-each)
        System.out.print("Using for-each: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }

    // Function to demonstrate traversal of a 2D array
    public static void traverse2DArray() {
        System.out.println("------ Traversing 2D Array ------");

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 1. Using nested traditional for loops
        System.out.println("Using nested for loop:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 2. Using nested for-each loops
        System.out.println("Using nested for-each loop:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

