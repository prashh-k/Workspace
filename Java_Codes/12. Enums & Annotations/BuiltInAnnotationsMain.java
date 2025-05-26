// Demonstrating built-in annotations
class BuiltInAnnotationsExample {

    // SuppressWarnings annotation to ignore compiler warnings
    @SuppressWarnings("unchecked")
    public void suppressWarningExample() {
        // Example usage of raw types (unchecked warning suppressed)
        @SuppressWarnings("rawtypes")
        java.util.ArrayList rawList = new java.util.ArrayList();
        rawList.add("This is a raw type example!");
        System.out.println(rawList.get(0));
    }

    // Deprecated annotation to mark deprecated methods
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated and may be removed in future versions.");
    }

    // Override annotation to ensure method overrides
    @Override
    public String toString() {
        return "BuiltInAnnotationsExample class demonstrating built-in annotations!";
    }
}

// Main class to test built-in annotations
public class BuiltInAnnotationsMain {
    public static void main(String[] args) {
        BuiltInAnnotationsExample example = new BuiltInAnnotationsExample();

        // Calling the deprecated method
        example.deprecatedMethod();

        // Suppressing warnings example
        example.suppressWarningExample();

        // Using the overridden toString method
        System.out.println(example.toString());
    }
}