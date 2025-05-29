package com.IO_Streams;

//Storing and transferring objects over a network or saving game states in applications.

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class SerializationExample {
    public static void serializePerson(String filePath, Person person) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(person);
            System.out.println("Person object serialized!");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    public static void deserializePerson(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Person person = (Person) ois.readObject();
            System.out.println("Deserialized Person: " + person);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        serializePerson("person.ser", person);
        deserializePerson("person.ser");
    }
}