import java.util.Arrays;
import java.util.Collections;

public class ArraySorting{

    public static void main(String[] args) {
        sort1DArray();
        sort2DArrayRowWise();
        sort2DArrayFlattened();
    }

    // Function to demonstrate sorting of 1D array
    public static void sort1DArray() {
        System.out.println("------ 1D Array Sorting ------");

        int[] arr = {5, 2, 9, 1, 3};

        // Sort in ascending order
        Arrays.sort(arr);
        System.out.print("Ascending: ");
        print1DArray(arr);

        // For descending order, use Integer[] with Collections.reverseOrder()
        Integer[] arrDesc = {5, 2, 9, 1, 3};
        Arrays.sort(arrDesc, Collections.reverseOrder());
        System.out.print("Descending: ");
        print1DArray(arrDesc);

        System.out.println();
    }

    // Function to demonstrate row-wise sorting of a 2D array
    public static void sort2DArrayRowWise() {
        System.out.println("------ 2D Array Row-wise Sorting ------");

        int[][] matrix = {
            {5, 1, 3},
            {8, 4, 2}
        };

        // Sort each row individually
        for (int[] row : matrix) {
            Arrays.sort(row);
        }

        System.out.println("After sorting each row:");
        print2DArray(matrix);
    }

    // Function to demonstrate sorting the entire 2D array as a single array
    public static void sort2DArrayFlattened() {
        System.out.println("------ 2D Array Full Sorting (Flattened) ------");

        int[][] matrix = {
            {9, 7, 5},
            {4, 2, 8}
        };

        // Step 1: Flatten the 2D array
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flat = new int[rows * cols];
        int index = 0;

        for (int[] row : matrix) {
            for (int val : row) {
                flat[index++] = val;
            }
        }

        // Step 2: Sort the flattened array
        Arrays.sort(flat);

        // Step 3: Refill the 2D array with sorted values
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = flat[index++];
            }
        }

        System.out.println("Entire matrix sorted:");
        print2DArray(matrix);
    }

    // Helper method to print 1D array (int[])
    public static void print1DArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Overloaded helper method to print 1D array (Integer[])
    public static void print1DArray(Integer[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Helper method to print 2D array
    public static void print2DArray(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
