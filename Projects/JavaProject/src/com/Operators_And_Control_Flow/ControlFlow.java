package com.Operators_And_Control_Flow;

public class ControlFlow {
    public static void main(String[] args) {

        /*
         * Types of Control Flow Statements
         * Java supports three main types of control flow:
         * - Decision-Making Statements (if-else, switch)
         * - Looping Statements (for, while, do-while)
         * - Jump Statements (break, continue, return)
         */

        // 1. Decision-Making Statements (if-else)
        System.out.println("Decision-Making (if-else):");
        int num = 10;
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else {
            System.out.println(num + " is negative.");
        }
        System.out.println("-----------------------------------");

        // 2. Switch Statement
        System.out.println("Switch Statement:");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println("-----------------------------------");

        // 3. Looping: For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
        System.out.println("-----------------------------------");

        // 4. Looping: While Loop
        System.out.println("While Loop:");
        int count = 1;
        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("-----------------------------------");

        // 5. Looping: Do-While Loop
        System.out.println("Do-While Loop:");
        int doCount = 1;
        do {
            System.out.println("Do Count: " + doCount);
            doCount++;
        } while (doCount <= 2);
        System.out.println("-----------------------------------");

        // 6. Jump Statements: Break Example
        System.out.println("Break Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Loop stopped at: " + i);
                break; // Stops the loop when i reaches 3
            }
            System.out.println("Iteration: " + i);
        }
        System.out.println("-----------------------------------");

        // 7. Jump Statements: Continue Example
        System.out.println("Continue Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration: " + i);
                continue; // Skips iteration when i is 3
            }
            System.out.println("Iteration: " + i);
        }
        System.out.println("-----------------------------------");

        // 8. Return Statement (Example in a Method)
        System.out.println("Return Statement:");
        int result = addNumbers(5, 10);
        System.out.println("Sum: " + result);
        System.out.println("-----------------------------------");
    }

    // Method to demonstrate return statement
    public static int addNumbers(int a, int b) {
        return a + b; // Returns sum of a and b
    }
}
