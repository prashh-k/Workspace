public class initialization{

    public static void main(String[] args) {
        // Call either or both of these based on what you want to test
        demonstrate1DArrayInitialization();
        demonstrate2DArrayInitialization();
    }

    // Function to demonstrate all 1D array initialization methods
    public static void demonstrate1DArrayInitialization() {
        System.out.println("------ 1D Array Initialization ------");

        // 1. Static Initialization
        int[] staticArr = {1, 2, 3, 4, 5};
        System.out.print("Static Init: ");
        print1DArray(staticArr);

        // 2. Dynamic Initialization
        int[] dynamicArr = new int[5];
        System.out.print("Dynamic Init: ");
        print1DArray(dynamicArr);

        // 3. Declared then initialized
        int[] declaredArr;
        declaredArr = new int[]{10, 20, 30};
        System.out.print("Declared then Init: ");
        print1DArray(declaredArr);

        // 4. Initialization using loop
        int[] loopArr = new int[5];
        for (int i = 0; i < loopArr.length; i++) {
            loopArr[i] = i * 2;
        }
        System.out.print("Loop Init: ");
        print1DArray(loopArr);

        // 5. Using Java 8 Streams
        int[] streamArr = java.util.stream.IntStream.range(0, 5).toArray();
        System.out.print("Stream Init: ");
        print1DArray(streamArr);

        System.out.println(); // spacing
    }

    // Function to demonstrate all 2D array initialization methods
    public static void demonstrate2DArrayInitialization() {
        System.out.println("------ 2D Array Initialization ------");

        // 1. Static Initialization
        int[][] staticMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Static Init:");
        print2DArray(staticMatrix);

        // 2. Dynamic Initialization
        int[][] dynamicMatrix = new int[2][3];
        System.out.println("Dynamic Init:");
        print2DArray(dynamicMatrix);

        // 3. Jagged Array
        int[][] jaggedMatrix = new int[2][];
        jaggedMatrix[0] = new int[3];
        jaggedMatrix[1] = new int[2];
        System.out.println("Jagged Init:");
        print2DArray(jaggedMatrix);

        // 4. Using nested loops
        int[][] loopMatrix = new int[2][3];
        for (int i = 0; i < loopMatrix.length; i++) {
            for (int j = 0; j < loopMatrix[i].length; j++) {
                loopMatrix[i][j] = i + j;
            }
        }
        System.out.println("Loop Init:");
        print2DArray(loopMatrix);

        // 5. Using Arrays.fill for each row
        int[][] fillMatrix = new int[2][3];
        for (int[] row : fillMatrix) {
            java.util.Arrays.fill(row, 1);
        }
        System.out.println("Arrays.fill Init:");
        print2DArray(fillMatrix);
    }

    // Helper method to print 1D arrays
    public static void print1DArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Helper method to print 2D arrays
    public static void print2DArray(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println(); // spacing
    }
}
