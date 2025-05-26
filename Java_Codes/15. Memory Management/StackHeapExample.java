//Stack memory manages method execution while heap memory stores large 
//data sets such as user information in a web application.
public class StackHeapExample {

    public static void demonstrateStackHeap() {
        // Stack allocation
        int localVariable = 42;
        System.out.println("Local variable (Stack): " + localVariable);

        // Heap allocation
        MyObject myObject = new MyObject("Heap Object");
        System.out.println("Object stored in Heap: " + myObject.getName());
    }

    static class MyObject {
        private String name;

        public MyObject(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        demonstrateStackHeap();
    }
}
