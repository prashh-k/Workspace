package com.Basics_of_Java;

public class Variable {
    public static void main(String[] args) {

        /*
         * Java has three types of variables:
         * - Local Variables – Defined within a method and accessible only inside that method.
         * 
         * - Instance Variables (Non-Static Variables) – Belong to an instance of a class and are not 
         *   shared among objects.
         * 
         * - Static Variables (Class Variables) – Shared among all instances of a class, declared using    
         *   static.
        */

        Example obj = new Example();
        obj.display();
    }
}

class Example {
    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    void display() {
        // Local variable
        int localVar = 30;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}

