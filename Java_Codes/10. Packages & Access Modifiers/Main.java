import mypackage.Employee2; // Importing user-defined package
import java.util.ArrayList;
import java.time.LocalDate;

class Manager extends Employee2 {
    public Manager(String name, int age, LocalDate joiningDate, String department) {
        super(name, age, joiningDate, department);
    }

    // Method in a subclass to access protected members
    public void showJoiningDate() {
        System.out.println("Joining Date (Protected Access): " + joiningDate);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Alice", 30, LocalDate.of(2020, 5, 20), "HR");

        // Accessing public members
        System.out.println("Public Name: " + emp.name);

        // Accessing private members (NOT allowed)
        // System.out.println(emp.age); // Error! Private access level.

        // Accessing default members (Allowed within same package)
        // System.out.println("Default Department: " + emp.department);

        // Accessing protected members using subclass
        Manager mgr = new Manager("Bob", 40, LocalDate.of(2015, 3, 10), "Finance");
        mgr.showJoiningDate(); // Works due to inheritance!

        // Display full details (Allowed because showDetails() is public)
        emp.showDetails();
    }
}
