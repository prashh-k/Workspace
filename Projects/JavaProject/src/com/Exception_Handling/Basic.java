package com.Exception_Handling;

import java.util.Scanner;

class ArithmeticExpression {
    public void arithmeticException() {
        try {
            // This will cause an ArithmeticException (division by zero)
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
            sc.close();
        } 
        
        catch (ArithmeticException e) {
            // Exception caught and handled here
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } 
        
        finally {
            // This block always executes, whether an exception is thrown or not
            System.out.println("Finally block executed.");
        }
    }
}

public class Basic {
    public static void main(String[] args) {
        ArithmeticExpression a1 = new ArithmeticExpression();
        a1.arithmeticException();
    }
}

