// 1. Class & Object
class Animal {
    String name;

    // 2. Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method for polymorphism
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// 3. Inheritance
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Using 'super' to call parent constructor
        this.breed = breed;
    }

    // 4. Overriding (Polymorphism)
    @Override
    void makeSound() {
        System.out.println(name + " barks!");
    }

    // 5. Overloading (Same method name, different parameters)
    void makeSound(String intensity) {
        System.out.println(name + " barks " + intensity + "!");
    }
}

// 6. Abstraction using Abstract Class
abstract class Bird {
    abstract void fly(); // Abstract method (no body)

    void sleep() { // Non-abstract method
        System.out.println("Bird sleeps peacefully.");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies gracefully.");
    }
}

// 7. Interface
interface Vehicle {
    void start(); // Abstract method
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with ignition.");
    }
}

// 8. Encapsulation (Private variables with getters/setters)
class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() { // Getter
        return balance;
    }

    public void setBalance(double balance) { // Setter
        this.balance = balance;
    }
}

// MAIN CLASS
public class OOPConcepts {
    public static void main(String[] args) {
        // Class & Object + Constructor
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.makeSound();

        // Inheritance & Overriding
        Dog myDog = new Dog("Buddy", "Labrador");
        myDog.makeSound();
        myDog.makeSound("loudly"); // Overloaded method

        // Abstraction
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.sleep();

        // Interface Implementation
        Car myCar = new Car();
        myCar.start();

        // Encapsulation
        BankAccount myAccount = new BankAccount(1000.50);
        System.out.println("Initial Balance: $" + myAccount.getBalance());
        myAccount.setBalance(2000.75);
        System.out.println("Updated Balance: $" + myAccount.getBalance());

        /*
         * Explanation of OOP Concepts
         * ✅ 1. Class & Object
         * - A Class is a blueprint for creating objects.
         * - An Object is an instance of a class.
         * 
         * ✅ 2. Constructor
         * - A Constructor initializes objects when they are created.
         * 
         * ✅ 3. this and super
         * - this refers to the current class object.
         * - super calls a method or constructor from the parent class.
         * 
         * ✅ 4. Inheritance
         * - Inheritance allows a class to acquire properties and behaviors of another.
         * 
         * ✅ 5. Polymorphism
         * - Method Overriding: Parent method is modified in the child class.
         * - Method Overloading: Same method name but different parameters.
         * 
         * ✅ 6. Abstraction
         * - Abstract classes partially implement a blueprint.
         * - Interfaces completely define a blueprint.
         * 
         * ✅ 7. Encapsulation
         * - Encapsulation hides data using private variables.
         * - Uses getters and setters for controlled access.
         */
    }
}
