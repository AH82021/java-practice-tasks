package tasks;

/**
 * Task: Exception Handling Practice
 *
 * Title: **Exception Handling in Java**
 *
 * Goal:
 * - **Understand and implement exception handling** using try-catch, throws, and custom exceptions.
 * - **Practice writing method signatures** and handling various exception scenarios.
 *
 * Overview:
 * In this task, you will create methods that demonstrate different exception handling techniques.
 * Each method includes a method signature and a TODO comment where you will implement the logic.
 * This exercise will help you strengthen your ability to handle errors gracefully in Java.
 *
 * Instructions:
 * - Implement each method according to its description.
 * - Follow the TODO comments to guide your implementation.
 * - Test your methods in the `main` method by calling them with sample data.
 *
 * Note:
 * - Ensure proper handling of exceptions to prevent program crashes.
 * - Use appropriate exception types and custom exceptions where necessary.
 */
public class Task_Exception {

    public static void main(String[] args) {
        // TODO: Test each exception handling method here with sample data.
    }

    /**
     * Task 1: Handle Division by Zero
     *
     * Description:
     * - Perform division of two numbers and handle any division by zero exception.
     *
     * Method Signature:
     * - public static double safeDivide(int numerator, int denominator)
     *
     * TODO:
     * - Use try-catch to handle division by zero and return a suitable default value.
     */
    public static int safeDivide(int numerator, int denominator) {
        // TODO: Implement exception handling for division by zero.
        return 0; // Placeholder return value
    }

    /**
     * Task 2: Handle Array Index Out of Bounds
     *
     * Description:
     * - Retrieve an element from an array at the given index and handle out-of-bounds exceptions.
     *
     * Method Signature:
     * - public static int getElement(int[] array, int index)
     *
     * TODO:
     * - Use try-catch to handle array index out-of-bounds exceptions.
     */
    public static int getElement(int[] array, int index) {
        // TODO: Implement logic to handle array index out-of-bounds.
        return 0; // Placeholder return value
    }

    /**
     * Task 3: Handle Null Pointer Exception
     *
     * Description:
     * - Attempt to get the length of a string and handle potential null pointer exceptions.
     *
     * Method Signature:
     * - public static int getStringLength(String str)
     *
     * TODO:
     * - Use try-catch to handle null pointer exceptions.
     */
    public static int getStringLength(String str) {
        // TODO: Implement logic to handle null pointer exceptions.
        return 0; // Placeholder return value
    }

    /**
     * Task 4: Custom Exception Handling
     *
     * Description:
     * - Create a custom exception and throw it when a negative number is passed.
     *
     * Method Signature:
     * - public static void checkPositiveNumber(int number) throws NegativeNumberException
     *
     * TODO:
     * - Define a custom exception class named `NegativeNumberException`.
     * - Throw the exception if the number is negative.
     */
    public static void checkPositiveNumber(int number) throws NegativeNumberException {
        // TODO: Implement logic to throw a custom exception for negative numbers.
    }

    /**
     * Task 5: Handle Multiple Exceptions
     *
     * Description:
     * - Perform operations that might throw multiple types of exceptions.
     *
     * Method Signature:
     * - public static void handleMultipleExceptions(String str, int[] array, int index)
     *
     * TODO:
     * - Handle both NullPointerException and ArrayIndexOutOfBoundsException.
     */
    public static void handleMultipleExceptions(String str, int[] array, int index) {
        // TODO: Implement logic to handle multiple exceptions.
    }

    /**
     * Task 6: Propagate Exception Using Throws
     *
     * Description:
     * - Demonstrate exception propagation by using the `throws` keyword.
     *
     * Method Signature:
     * - public static void riskyMethod() throws Exception
     *
     * TODO:
     * - Define a method that throws a generic exception without handling it.
     */
    public static void riskyMethod() throws Exception {
        // TODO: Implement logic to demonstrate exception propagation.
    }

    /**
     * Custom Exception Class: NegativeNumberException
     *
     * Description:
     * - A custom exception to handle negative numbers.
     */

}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}