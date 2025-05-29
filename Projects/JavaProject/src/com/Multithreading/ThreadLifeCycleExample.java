package com.Multithreading;

///Managing user sessions in a web application.

class LifecycleDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is in the Running state");
    }
}

public class ThreadLifeCycleExample {
    public static void executeThreadLifecycleExample() throws InterruptedException {
        Thread thread = new Thread(new LifecycleDemo());
        System.out.println("Thread State: " + thread.getState()); // New
        thread.start();
        System.out.println("Thread State: " + thread.getState()); // Runnable
        thread.join(); // Wait for thread to finish
        System.out.println("Thread State: " + thread.getState()); // Terminated
    }

    public static void main(String[] args) throws InterruptedException {
        executeThreadLifecycleExample();
    }
}

