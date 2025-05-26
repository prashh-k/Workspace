package mypackage;

import java.time.LocalDate;

// Employee class with different access levels
public class Employee2 {
    public String name; // Public - Accessible everywhere
    private int age; // Private - Accessible only inside this class
    protected LocalDate joiningDate; // Protected - Accessible within the package and subclasses
    String department; // Default - Accessible within the package only

    // Constructor
    public Employee2(String name, int age, LocalDate joiningDate, String department) {
        this.name = name;
        this.age = age;
        this.joiningDate = joiningDate;
        this.department = department;
    }

    // Public method (accessible everywhere)
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); // Allowed because it's inside the same class
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Department: " + department);
    }
}
