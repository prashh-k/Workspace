package com.Inner_Classes;

class AnonymousInnerClassExample {

    // Interface that defines a task
    interface Task {
        void perform(); // Task that needs to be performed
    }

    // Method to demonstrate the use of an anonymous inner class
    public void executeTask() {
        // ✅ Anonymous Inner Class implementation of Task
        Task task = new Task() {
            // Implementing the perform method of the Task interface
            @Override
            public void perform() {
                System.out.println("Performing a simple task...");
            }
        };

        // Execute the task
        task.perform();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Create an instance of the class to invoke the executeTask method
        AnonymousInnerClassExample example = new AnonymousInnerClassExample();
        example.executeTask();
    }
}
