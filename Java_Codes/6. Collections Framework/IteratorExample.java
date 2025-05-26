package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    // Function to demonstrate iterator operations
    public static void iteratorOperations() {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get the iterator
        Iterator<String> iterator = list.iterator();

        // Iterate through the list
        System.out.println("Iterating through the list:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Remove an element using iterator
        iterator = list.iterator(); // Reset the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Banana")) {
                iterator.remove();
            }
        }

        // Display the list after removal
        System.out.println("List after removal: " + list);
    }

    public static void main(String[] args) {
        // Call the function to demonstrate iterator operations
        iteratorOperations();
    }
}
