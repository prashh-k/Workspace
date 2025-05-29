package com.Collections_Framework;

import java.util.TreeSet;

public class Treeset {
    // Method to add a student name to the set
    public void addStudentName(TreeSet<String> studentNames, String studentName) {
        if (studentNames.add(studentName)) {
            System.out.println("Student name " + studentName + " added.");
        } else {
            System.out.println("Student name " + studentName + " already exists.");
        }
    }

    // Method to remove a student name from the set
    public void removeStudentName(TreeSet<String> studentNames, String studentName) {
        if (studentNames.remove(studentName)) {
            System.out.println("Student name " + studentName + " removed.");
        } else {
            System.out.println("Student name " + studentName + " not found.");
        }
    }

    // Method to print the set of student names
    public void printStudentNames(TreeSet<String> studentNames) {
        System.out.println("Student Names: " + studentNames);
    }

    public static void main(String[] args) {
        Treeset manager = new Treeset();

        // Create a TreeSet to store student names
        TreeSet<String> studentNames = new TreeSet<>();

        // Add student names to the set
        manager.addStudentName(studentNames, "Alice");
        manager.addStudentName(studentNames, "Bob");
        manager.addStudentName(studentNames, "Charlie");
        manager.addStudentName(studentNames, "Alice"); // Duplicate name

        // Print the set of student names
        manager.printStudentNames(studentNames);

        // Remove a student name from the set
        manager.removeStudentName(studentNames, "Bob");

        // Print the set of student names after removal
        manager.printStudentNames(studentNames);
    }
}
