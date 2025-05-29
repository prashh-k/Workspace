package com.Memory_Management;

//In a gaming application, garbage collection ensures unused game objects 
//(e.g., expired power-ups) are removed from memory.
public class GarbageCollectionExample {

    public static void demonstrateGarbageCollection() {
        MyObject obj1 = new MyObject("Object1");
        obj1 = null; // Object1 eligible for garbage collection

        MyObject obj2 = new MyObject("Object2");
        
        obj2.finalize();

        System.gc(); // Suggest Garbage Collection
    }

    static class MyObject {
        private String name;

        public MyObject(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() {
            System.out.println(name + " is being collected!");
        }
    }

    public static void main(String[] args) {
        demonstrateGarbageCollection();
    }
}