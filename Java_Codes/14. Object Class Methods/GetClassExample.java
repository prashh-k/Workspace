// Class representing a custom data type
class Person {
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Main class to demonstrate the getClass() method
public class GetClassExample {
    public static void main(String[] args) {
        // Create objects of different classes
        Person person = new Person("John Doe", 30);
        String stringObject = "Hello, World!";
        Integer integerObject = 42;

        // Retrieve and print the runtime class of each object
        System.out.println("Class of person object: " + person.getClass().getName());
        System.out.println("Class of stringObject: " + stringObject.getClass().getName());
        System.out.println("Class of integerObject: " + integerObject.getClass().getName());
    }
}