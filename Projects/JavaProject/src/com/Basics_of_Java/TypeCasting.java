package com.Basics_of_Java;

public class TypeCasting {
    public static void main(String[] args) {
        /*
         * Implicit Type Casting (Widening Casting)
         * Happens automatically when converting a smaller data type into a larger one
         * (e.g., int to double).
         * 
         * byte → short → int → long → float → double
         * 
         */
        int num = 10;
        double doubleNum = num; // Implicit casting (Widening)

        System.out.println("Integer: " + num);
        System.out.println("Converted to Double: " + doubleNum);

        /*
         * Explicit Type Casting (Narrowing Casting)
         * Requires manual conversion when converting a larger data type into a smaller one
         * (e.g., double to int).
         * 
         * double → float → long → int → short → byte
         * 
         */

        double doubleNum1 = 10.75;
        int num1 = (int) doubleNum1; // Explicit casting (Narrowing)

        System.out.println("Double: " + doubleNum1);
        System.out.println("Converted to Integer: " + num1);

    }
}

