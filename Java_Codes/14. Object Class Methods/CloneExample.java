// Class implementing Cloneable interface
class Person implements Cloneable {
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Call the clone method from Object class
    }

    // Method to display the details of the Person
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to demonstrate cloning
public class CloneExample {
    public static void main(String[] args) {
        try {
            // Create an object of Person
            Person person1 = new Person("John Doe", 30);

            // Clone the person1 object to create person2
            Person person2 = (Person) person1.clone();

            // Display details of both objects
            System.out.println("Original Object (person1):");
            person1.display();

            System.out.println("Cloned Object (person2):");
            person2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported for this object.");
        }
    }
}