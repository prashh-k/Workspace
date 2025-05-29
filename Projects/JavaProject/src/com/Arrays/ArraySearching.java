package com.Arrays;

import java.util.Arrays;

public class ArraySearching {

    public static void main(String[] args) {
        search1DArray();
        search2DArray();
    }

    // Function to demonstrate searching in 1D array
    public static void search1DArray() {
        System.out.println("------ 1D Array Searching ------");

        int[] arr = {5, 2, 9, 1, 3};
        int key = 9;

        // 1. Linear Search
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Linear Search: " + key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Linear Search: " + key + " not found.");
        }

        // 2. Binary Search (Only works on sorted arrays)
        Arrays.sort(arr); // Must sort before binary search
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Binary Search: " + key + " found at index " + index + " (after sorting)");
        } else {
            System.out.println("Binary Search: " + key + " not found.");
        }

        System.out.println();
    }

    // Function to demonstrate searching in 2D array
    public static void search2DArray() {
        System.out.println("------ 2D Array Searching ------");

        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int key = 50;

        // 1. Linear Search in 2D array
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found " + key + " at position [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println(key + " not found in 2D array.");
        }

        System.out.println();
    }
}

