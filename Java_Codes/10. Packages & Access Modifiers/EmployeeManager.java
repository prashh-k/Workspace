import java.util.ArrayList;
import java.time.LocalDate;

// Employee class to store employee details
class Employee {
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

// Main class to manage employees
public class EmployeeManager {
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
