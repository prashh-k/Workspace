//Commonly observed in applications that store large collections 
// (e.g., caching data) without proper cleanup mechanisms.

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {

    private static List<Object> memoryLeak = new ArrayList<>();

    public static void demonstrateMemoryLeak() {
        for (int i = 0; i < 100000; i++) {
            memoryLeak.add(new Object()); // Objects are never removed
        }
        System.out.println("Objects added without release. Potential memory leak!");
    }

    public static void main(String[] args) {
        demonstrateMemoryLeak();
    }
}

