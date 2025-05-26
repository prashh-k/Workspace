package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate element

        // Print the HashSet
        System.out.println("HashSet: " + fruits);

        // Check if an element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        }

        // Remove an element
        fruits.remove("Orange");
        System.out.println("HashSet after removal: " + fruits);
    }
}

