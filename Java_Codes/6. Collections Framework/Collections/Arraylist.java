package Collections;

import java.util.ArrayList;

public class Arraylist {
    // Method to add a student to the list
    public void addStudent(ArrayList<String> students, String student) {
        students.add(student);
    }

    // Method to remove a student from the list
    public void removeStudent(ArrayList<String> students, String student) {
        students.remove(student);
    }

    // Method to print the list of students
    public void printStudents(ArrayList<String> students) {
        System.out.println("Student List: " + students);
    }

    public static void main(String[] args) {
        Arraylist studentList = new Arraylist();

        // Create an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // Add students to the list
        studentList.addStudent(students, "Alice");
        studentList.addStudent(students, "Bob");
        studentList.addStudent(students, "Charlie");

        // Print the list of students
        studentList.printStudents(students);

        // Remove a student from the list
        studentList.removeStudent(students, "Bob");

        // Print the list of students after removal
        studentList.printStudents(students);
    }
}
