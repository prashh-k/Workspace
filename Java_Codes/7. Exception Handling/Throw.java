class Sample{
    public static void checkNumber(int number) throws IllegalArgumentException {
        if (number < 0) {
            // Manually throw an exception using 'throw'
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        System.out.println("Number is valid: " + number);
    }

    public void Sample1(){
        try {
            // The method call may throw an exception
            checkNumber(-5);
        } 
        catch (IllegalArgumentException e) {
            // The thrown exception is caught here
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}


public class Throw {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.Sample1();
    }
}
