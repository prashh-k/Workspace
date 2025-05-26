// Class representing a custom data type
class Person {
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the equals() method to define equality based on data
    @Override
    public boolean equals(Object obj) {
        // Check if the current object and the passed object are the same reference
        if (this == obj) {
            return true;
        }
        // Check if the passed object is null or not of the same class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the passed object to Person and compare data
        Person otherPerson = (Person) obj;
        return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
    }
}

// Main class to test the equals() method
public class Equals {
    public static void main(String[] args) {
        // Create two Person objects with the same data
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);

        // Compare the objects using the overridden equals() method
        System.out.println("Are person1 and person2 equal? " + person1.equals(person2));

        // Compare the objects using reference comparison
        System.out.println("Do person1 and person2 reference the same object? " + (person1 == person2));
    }
}