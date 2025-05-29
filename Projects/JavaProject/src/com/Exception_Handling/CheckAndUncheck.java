package com.Exception_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckAndUncheck {

    public static void demonstrateCheckedException() {
        try {
            // Attempt to open a file that may not exist.
            // FileReader throws FileNotFoundException, which is a checked exception.
            FileReader file = new FileReader("nonexistent.txt");
            BufferedReader br = new BufferedReader(file);

            // Read the first line of the file
            String line = br.readLine();
            System.out.println("File content: " + line);
            // Clean up - Always close the stream
            br.close();
        } catch (FileNotFoundException e) {
            // Handle the checked FileNotFoundException
            System.out.println("Checked Exception - File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle other potential IOExceptions
            System.out.println("Checked Exception - I/O error: " + e.getMessage());
        }
    }
    
    public static void demonstrateUncheckedException() {
        int[] numbers = {1, 2, 3};

        try {
            // This line will throw an ArrayIndexOutOfBoundsException because
            // we are trying to access index 5 (valid indices are 0, 1, and 2)
            System.out.println("Accessing element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the unchecked exception
            System.out.println("Unchecked Exception - " + e.getClass().getSimpleName() 
                               + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Checked Exception Demo ===");
        demonstrateCheckedException();

        System.out.println("\n=== Unchecked Exception Demo ===");
        demonstrateUncheckedException();
    }
}
    


