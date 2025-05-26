package Collections;

import java.util.LinkedList;

public class Linkedlist {
    // Method to add a task to the list
    public void addTask(LinkedList<String> tasks, String task) {
        tasks.add(task);
    }

    // Method to remove a task from the list
    public void removeTask(LinkedList<String> tasks, String task) {
        tasks.remove(task);
    }

    // Method to print the list of tasks
    public void printTasks(LinkedList<String> tasks) {
        System.out.println("Task List: " + tasks);
    }

    public static void main(String[] args) {
        Linkedlist taskList = new Linkedlist();

        // Create a LinkedList to store tasks
        LinkedList<String> tasks = new LinkedList<>();

        // Add tasks to the list
        taskList.addTask(tasks, "Buy groceries");
        taskList.addTask(tasks, "Pay bills");
        taskList.addTask(tasks, "Complete project");

        // Print the list of tasks
        taskList.printTasks(tasks);

        // Remove a task from the list
        taskList.removeTask(tasks, "Pay bills");

        // Print the list of tasks after removal
        taskList.printTasks(tasks);
    }
}
