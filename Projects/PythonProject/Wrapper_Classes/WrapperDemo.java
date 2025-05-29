// Java program to demonstrate wrapping of primitive data types
// into their corresponding wrapper classes

public class WrapperDemo {
    public static void main(String[] args) {
        // Primitive data types and their wrapper classes

        // Example for Integer
        int primitiveInt = 357; // Primitive int
        Integer wrapperInt = primitiveInt; // Auto-boxing (int to Integer)
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);

        // Example for Float
        float primitiveFloat = 45.67f; // Primitive float
        Float wrapperFloat = primitiveFloat; // Auto-boxing (float to Float)
        System.out.println("\nPrimitive float: " + primitiveFloat);
        System.out.println("Wrapper Float: " + wrapperFloat);

        // Example for Double
        double primitiveDouble = 123.456; // Primitive double
        Double wrapperDouble = primitiveDouble; // Auto-boxing (double to Double)
        System.out.println("\nPrimitive double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);

        // Example for Character
        char primitiveChar = 'A'; // Primitive char
        Character wrapperChar = primitiveChar; // Auto-boxing (char to Character)
        System.out.println("\nPrimitive char: " + primitiveChar);
        System.out.println("Wrapper Character: " + wrapperChar);

        // Example for Boolean
        boolean primitiveBoolean = true; // Primitive boolean
        Boolean wrapperBoolean = primitiveBoolean; // Auto-boxing (boolean to Boolean)
        System.out.println("\nPrimitive boolean: " + primitiveBoolean);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);

        // Example for Long
        long primitiveLong = 9876543210L; // Primitive long
        Long wrapperLong = primitiveLong; // Auto-boxing (long to Long)
        System.out.println("\nPrimitive long: " + primitiveLong);
        System.out.println("Wrapper Long: " + wrapperLong);

        // Example for Short
        short primitiveShort = 123; // Primitive short
        Short wrapperShort = primitiveShort; // Auto-boxing (short to Short)
        System.out.println("\nPrimitive short: " + primitiveShort);
        System.out.println("Wrapper Short: " + wrapperShort);

        // Example for Byte
        byte primitiveByte = 10; // Primitive byte
        Byte wrapperByte = primitiveByte; // Auto-boxing (byte to Byte)
        System.out.println("\nPrimitive byte: " + primitiveByte);
        System.out.println("Wrapper Byte: " + wrapperByte);
    }
}