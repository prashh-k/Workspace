package com.Collections_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    // Function to demonstrate queue operations
    public static void queueOperations() {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peek at the front of the queue
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }

    public static void main(String[] args) {
        // Call the function to demonstrate queue operations
        queueOperations();
    }
}

