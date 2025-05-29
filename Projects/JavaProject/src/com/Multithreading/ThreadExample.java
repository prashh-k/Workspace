package com.Multithreading;

//Monitoring system health in the background, such as CPU usage or memory allocation.

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void executeThreadExample() {
        MyThread thread = new MyThread();
        thread.start(); // Starts the thread
    }

    public static void main(String[] args) {
        executeThreadExample();
    }
}

