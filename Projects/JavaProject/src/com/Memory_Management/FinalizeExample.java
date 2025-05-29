package com.Memory_Management;

//Freeing resources like closing a file stream or releasing 
// database connections in server applications.

public class FinalizeExample {

    public static void demonstrateFinalize() {
        MyObject obj = new MyObject("Finalizing Object");
        //obj.finalize();
        obj = null; // Eligible for Garbage Collection
        
        System.gc(); // Suggest Garbage Collection
    }

    static class MyObject {
        private String name;

        public MyObject(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() {
            System.out.println(name + " is finalized and resources are released!");
        }
    }

    public static void main(String[] args) {
        demonstrateFinalize();
    }
}

