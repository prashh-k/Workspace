package com.Exception_Handling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    // The method validates the age and throws our custom exception if necessary
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not valid. Must be 18 or above.");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            // Test the custom exception by providing an invalid age
            validateAge(16);
        } 
        catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
    


