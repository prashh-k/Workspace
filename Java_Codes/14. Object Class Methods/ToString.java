// Class representing a Person
class Person {
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Main class to demonstrate the toString() method
public class ToString {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", 30);

        // Printing the object directly
        // The overridden toString() method is called automatically
        System.out.println(person);
    }
}