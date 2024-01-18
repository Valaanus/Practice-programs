package org.example.practice;
public class RecursionExample {

    public static void main(String[] args) {
        // Example: Calculating factorial using recursion
        int number = 5;
        long factorialResult = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }

    // Recursive method to calculate factorial
    private static long calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        else {
            return n * calculateFactorial(n - 1);
        }
    }
}
