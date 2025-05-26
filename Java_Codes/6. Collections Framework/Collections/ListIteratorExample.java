package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

    // Function to demonstrate ListIterator operations
    public static void listIteratorOperations() {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get the ListIterator
        ListIterator<String> listIterator = list.listIterator();

        // Iterate forward through the list
        System.out.println("Iterating forward through the list:");
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }

        // Iterate backward through the list
        System.out.println("Iterating backward through the list:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }

        // Modify elements during iteration
        listIterator = list.listIterator(); // Reset the iterator
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("Banana")) {
                listIterator.set("Blueberry");
            }
        }

        // Display the list after modification
        System.out.println("List after modification: " + list);
    }

    public static void main(String[] args) {
        // Call the function to demonstrate ListIterator operations
        listIteratorOperations();
    }
}
