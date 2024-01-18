package org.example.practice;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        // Example 1: ArithmeticException
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Example 3: CustomException
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Example method that may throw an ArithmeticException
    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    // Example method that throws a custom exception
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
