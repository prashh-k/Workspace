package mypackage; // User-defined package

import java.time.LocalDate; // Built-in package

// Employee class to store employee details
public class Employee {
    private String name;
    private int age;
    private LocalDate joiningDate;

    public Employee(String name, int age, LocalDate joiningDate) {
        this.name = name;
        this.age = age;
        this.joiningDate = joiningDate;
    }

    // Method to return employee details as a formatted string
    public String getEmployeeDetails() {
        return name + ", " + age + ", Joined on: " + joiningDate;
    }
}
