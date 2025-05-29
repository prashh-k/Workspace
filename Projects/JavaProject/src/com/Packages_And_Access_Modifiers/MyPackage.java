package com.Packages_And_Access_Modifiers;

import com.Packages_And_Access_Modifiers.mypackage.Employee; // Importing user-defined package
import java.util.ArrayList; // Built-in package
import java.time.LocalDate; // Importing LocalDate to fix the error

// Main class to manage employees
public class MyPackage {
    public static void main(String[] args) {
        // Using ArrayList to store employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, LocalDate.of(2020, 5, 20)));
        employees.add(new Employee("Bob", 25, LocalDate.of(2021, 8, 15)));
        employees.add(new Employee("Charlie", 28, LocalDate.of(2019, 3, 10)));

        // Displaying employee details
        System.out.println("Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp.getEmployeeDetails());
        }
    }
}
