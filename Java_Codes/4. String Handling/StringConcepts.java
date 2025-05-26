import java.util.StringTokenizer;

public class StringConcepts {
    public static void main(String[] args) {
        // ********** 1. String & Common Methods (Immutable) **********
        System.out.println("\n----- String & Common Methods -----");
        String str1 = "Hello";  // Stored in String Pool
        String str2 = new String("World");  // Stored in Heap memory

        // Common String Methods
        System.out.println("Original String: " + str1);
        System.out.println("Length: " + str1.length()); // Returns length
        System.out.println("Character at index 1: " + str1.charAt(1)); // Returns character
        System.out.println("Concatenation: " + str1.concat(" Java")); // Returns new string
        System.out.println("Uppercase: " + str1.toUpperCase()); // Converts to uppercase
        System.out.println("Lowercase: " + str1.toLowerCase()); // Converts to lowercase
        System.out.println("Index of 'o': " + str1.indexOf('o')); // Finds position of character
        System.out.println("Substring (0, 4): " + str1.substring(0, 4)); // Extracts substring
        System.out.println("Replace 'H' with 'J': " + str1.replace('H', 'J')); // Replaces character
        System.out.println("Check if starts with 'He': " + str1.startsWith("He")); // Checks prefix
        System.out.println("Check if ends with 'o': " + str1.endsWith("o")); // Checks suffix
        System.out.println("Trim spaces: " + "   Hello Java   ".trim()); // Removes spaces
        System.out.println("Equals 'Hello'? " + str1.equals("Hello")); // Compares strings
        System.out.println("Ignore case equals 'hello'? " + str1.equalsIgnoreCase("hello")); // Ignores case



        // ********** 2. StringBuilder (Mutable, Not Thread-Safe) **********
        System.out.println("\n----- StringBuilder (Mutable) -----");
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb);

        sb.insert(5, " Java");
        System.out.println("StringBuilder after insert: " + sb);

        sb.replace(6, 10, "C++");
        System.out.println("StringBuilder after replace: " + sb);

        sb.delete(5, 9);
        System.out.println("StringBuilder after delete: " + sb);

        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb);



        // ********** 3. StringBuffer (Mutable & Thread-Safe) **********
        System.out.println("\n----- StringBuffer (Thread-Safe) -----");
        StringBuffer sbf = new StringBuffer("Hello");

        sbf.append(" World");
        System.out.println("StringBuffer after append: " + sbf);

        sbf.insert(5, " Java");
        System.out.println("StringBuffer after insert: " + sbf);

        sbf.replace(6, 10, "Python");
        System.out.println("StringBuffer after replace: " + sbf);

        sbf.delete(5, 11);
        System.out.println("StringBuffer after delete: " + sbf);

        sbf.reverse();
        System.out.println("StringBuffer after reverse: " + sbf);



        // ********** 4. Immutability of Strings **********
        System.out.println("\n----- Immutability -----");
        String immutableString = "Immutable";
        immutableString.concat(" Changed");  // This does NOT modify the original string
        System.out.println("Immutable String remains unchanged: " + immutableString); // "Immutable"



        // ********** 5. String Pool (Memory Optimization) **********
        System.out.println("\n----- String Pool Concept -----");
        String poolString1 = "Hello";
        String poolString2 = "Hello";  // Reuses existing object in the String Pool

        System.out.println("Comparing String Pool references: " + (poolString1 == poolString2)); // true


        
        // ********** 6. StringTokenizer **********
        System.out.println("\n----- StringTokenizer (Tokenizing String) -----");
        String sentence = "Java,Python,C++,JavaScript";
        StringTokenizer st = new StringTokenizer(sentence, ",");

        while (st.hasMoreTokens()) {
            System.out.println("Token: " + st.nextToken());
        }
    }
}