package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    // Function to demonstrate deque operations
    public static void dequeOperations() {
        // Create a deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and back of the deque
        deque.addFirst("First");
        deque.addLast("Second");
        deque.addLast("Third");
        deque.addFirst("Zeroth");

        // Display the deque
        System.out.println("Deque: " + deque);

        // Remove elements from the front and back of the deque
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();
        System.out.println("Removed First Element: " + removedFirst);
        System.out.println("Removed Last Element: " + removedLast);

        // Display the deque after removals
        System.out.println("Deque after removals: " + deque);

        // Peek at the front and back of the deque
        String frontElement = deque.peekFirst();
        String backElement = deque.peekLast();
        System.out.println("Front Element: " + frontElement);
        System.out.println("Back Element: " + backElement);

        // Check if the deque is empty
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is the deque empty? " + isEmpty);
    }

    public static void main(String[] args) {
        // Call the function to demonstrate deque operations
        dequeOperations();
    }
}

