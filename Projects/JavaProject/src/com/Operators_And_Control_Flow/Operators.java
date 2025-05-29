package com.Operators_And_Control_Flow;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("-----------------------------------");

        // Unary Operators
        System.out.println("Unary Operators:");
        int x = 5;
        System.out.println("Post-increment: " + (x++));
        System.out.println("Pre-increment: " + (++x));
        System.out.println("Post-decrement: " + (x--));
        System.out.println("Pre-decrement: " + (--x));
        System.out.println("Negation: " + (-x));
        System.out.println("-----------------------------------");

        // Assignment Operators
        System.out.println("Assignment Operators:");
        int y = 10;
        y += 5;
        y -= 3;
        y *= 2;
        y /= 4;
        y %= 3;
        System.out.println("Final value of y: " + y);
        System.out.println("-----------------------------------");

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Less Than: " + (a < b));
        System.out.println("Greater or Equal: " + (a >= b));
        System.out.println("Less or Equal: " + (a <= b));
        System.out.println("-----------------------------------");

        // Logical Operators
        System.out.println("Logical Operators:");
        boolean p = true, q = false;
        System.out.println("AND: " + (p && q));
        System.out.println("OR: " + (p || q));
        System.out.println("NOT: " + (!p));
        System.out.println("-----------------------------------");

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("Minimum value: " + min);
        System.out.println("-----------------------------------");

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        int bit1 = 5, bit2 = 3;
        System.out.println("AND: " + (bit1 & bit2));
        System.out.println("OR: " + (bit1 | bit2));
        System.out.println("XOR: " + (bit1 ^ bit2));
        System.out.println("NOT: " + (~bit1));
        System.out.println("-----------------------------------");

        // Shift Operators
        System.out.println("Shift Operators:");
        System.out.println("Left Shift: " + (a << 2));
        System.out.println("Right Shift: " + (a >> 2));
        System.out.println("-----------------------------------");

        // instanceof Operator
        System.out.println("instanceof Operator:");
        Animal animal = new Dog();
        System.out.println("Is Dog an instance of Animal? " + (animal instanceof Animal));
        System.out.println("Is Dog an instance of Dog? " + (animal instanceof Dog));
    }
}

// Defining classes for instanceof operator example
class Animal {
}

class Dog extends Animal {
}

