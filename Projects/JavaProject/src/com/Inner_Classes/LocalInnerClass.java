package com.Inner_Classes;

class LocalInnerClassExample {

    // Outer class method
    public void admitPatient(String name) {
        System.out.println("Admitting patient: " + name);

        // ✅ Local Inner Class defined inside the method
        // This class is accessible ONLY within this method
        class AdmissionSlip {
            // Method inside the local inner class
            public void printSlip() {
                System.out.println("---- Admission Slip ----");
                System.out.println("Patient Name: " + name); // Can access method parameter
                System.out.println("Ward: General");
                System.out.println("------------------------");
            }
        }

        // ✅ Create object of the local inner class
        AdmissionSlip slip = new AdmissionSlip();

        // ✅ Call method of the local inner class
        slip.printSlip();
    }

}

public class LocalInnerClass {
    public static void main(String[] args) {
        // Create an instance of the outer class
        LocalInnerClassExample hospital = new LocalInnerClassExample();

        // Call method that uses local inner class
        hospital.admitPatient("Alice Johnson");
    }
}

