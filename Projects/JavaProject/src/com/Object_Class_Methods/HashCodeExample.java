package com.Object_Class_Methods;

// Class representing a custom data type
class Person {
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the hashCode() method
    @Override
    public int hashCode() {
        // Compute hash code based on the object's data
        int result = name.hashCode(); // Hash code of the name field
        result = 31 * result + age;   // Combine with the age field using a prime number
        return result;
    }

    // Overriding equals() method for proper comparison (to maintain contract between equals() and hashCode())
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) {
    //         return true;
    //     }
    //     if (obj == null || getClass() != obj.getClass()) {
    //         return false;
    //     }
    //     Person otherPerson = (Person) obj;
    //     return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
    // }
}

// Main class to demonstrate the hashCode() method
public class HashCodeExample {
    public static void main(String[] args) {
        // Creating two Person objects with the same data
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);

        // Default and overridden hashCode() behavior
        System.out.println("Hash code of person1: " + person1.hashCode());
        System.out.println("Hash code of person2: " + person2.hashCode());
        System.out.println("Are person1 and person2 equal? " + person1.equals(person2));
        System.out.println(person1);
        System.out.println(person2);
    }
}
