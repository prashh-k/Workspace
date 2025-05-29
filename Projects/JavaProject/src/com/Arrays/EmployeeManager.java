package com.Arrays;

import java.util.Arrays; // Used for copying arrays

class Employee {
    String name;
    int age;
    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Deep Copy Constructor
    public Employee(Employee other) {
        this.name = other.name;
        this.age = other.age;
        this.salary = other.salary;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: $" + salary);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        // 1️⃣ Array of Objects (Initializing Employee Array)
        Employee[] employees = new Employee[3]; // Array Length is 3
        employees[0] = new Employee("Alice", 30, 50000);
        employees[1] = new Employee("Bob", 25, 40000);
        employees[2] = new Employee("Charlie", 28, 45000);

        System.out.println("Original Employee List:");
        for (Employee emp : employees) {
            emp.showDetails();
        }

        // 2️⃣ Array Copying (Using Arrays.copyOf)
        Employee[] copiedEmployees = Arrays.copyOf(employees, employees.length);
        System.out.println("\nCopied Employee List:");
        for (Employee emp : copiedEmployees) {
            emp.showDetails();
        }

        // 3️⃣ Array Cloning (Using clone() - Shallow Copy)
        Employee[] shallowClonedEmployees = employees.clone();
        System.out.println("\nShallow Cloned Employee List:");
        for (Employee emp : shallowClonedEmployees) {
            emp.showDetails();
        }

        // 4️⃣ Deep Copy (Creating a new array with new objects)
        Employee[] deepCopiedEmployees = deepCopyArray(employees);
        System.out.println("\nDeep Copied Employee List:");
        for (Employee emp : deepCopiedEmployees) {
            emp.showDetails();
        }

        // 5️⃣ Array Length (Getting array size)
        System.out.println("\nTotal Employees: " + employees.length);

        // 6️⃣ Default Values (Array with uninitialized objects)
        Employee[] newEmployees = new Employee[2]; // Default values will be NULL
        System.out.println("\nDefault Values in Uninitialized Employee Array:");
        System.out.println(newEmployees[0]); // Prints 'null'
        System.out.println(newEmployees[1]); // Prints 'null'

        // 7️⃣ Handling OutOfBounds Exception
        try {
            System.out.println("\nAccessing Out of Bound Index:");
            employees[5].showDetails(); // Error! Index 5 does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ Error: Trying to access an invalid index!");
        }
    }

    // Method to perform Deep Copy of Employee Array
    public static Employee[] deepCopyArray(Employee[] original) {
        Employee[] deepCopiedArray = new Employee[original.length];
        for (int i = 0; i < original.length; i++) {
            deepCopiedArray[i] = new Employee(original[i]); // Calls Deep Copy Constructor
        }
        return deepCopiedArray;
    }
}

