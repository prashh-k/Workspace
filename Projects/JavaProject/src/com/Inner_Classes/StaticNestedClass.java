package com.Inner_Classes;

class StaticNestedClassExample {

    // Outer class
    static class University {
        // Static variable of outer class
        static String universityName = "Global Tech University";

        // Static nested class (like a helper class that belongs to the outer class)
        static class Department {
            public void display() {
                // Can directly access static members of the outer class
                System.out.println("Welcome to the Computer Science Department at " + universityName);
            }
        }
    }

    // Method to demonstrate how to use the static nested class
    public void demonstrate() {
        // ✅ No outer class instance (University) is needed to create the inner class
        // (Department)
        // Because Department is declared as static, it's like a static method — tied to
        // the class, not the object

        // Using OuterClass.NestedClass syntax to create the static nested class object
        University.Department dept = new University.Department();

        /*
         * University uni = new University(); // ❌ Not needed
         * University.Department dept = uni.new Department(); // ❌ Incorrect for static
         * class
         */

        // Call method from static nested class
        dept.display();
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        // Create an object of this class to call the demonstrate method
        StaticNestedClassExample example = new StaticNestedClassExample();
        example.demonstrate();
    }
}

/*
 * No need to create a University object.
 * This is because Department is a static nested class, and it doesn't depend on
 * an instance of University.
 */

