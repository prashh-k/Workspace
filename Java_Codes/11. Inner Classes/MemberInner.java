class MemberInnerClass {

    // Outer class
    class Car {
        private String brand = "Toyota"; // Private field of outer class

        // Member inner class
        class Engine {
            public void start() {
                // Inner class accessing private member of outer class
                System.out.println("Starting engine of " + brand);
            }
        }
    }

    // Method to demonstrate member inner class instantiation explicitly
    public void demonstrate() {
        Car car = new Car(); // Create outer class instance

        // Using correct syntax to create inner class instance
        Car.Engine engine = car.new Engine();

        engine.start(); // Call inner class method
    }
}

public class MemberInner {
    // Main method to run the demo
    public static void main(String[] args) {
        MemberInnerClass example = new MemberInnerClass();
        example.demonstrate();
    }
}

/*
 * Car.Engine → Refers to the inner class Engine within the Car class.
 * car.new Engine() → You use the outer class instance (car) to create the inner
 * class instance.
 */
