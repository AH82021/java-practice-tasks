package tasks;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Task: Basic Array Operations
 *
 * Title: **Array Operations Practice**
 *
 * Goal:
 * - **Understand and implement basic array operations** in Java.
 * - **Practice writing method signatures** and outlining logic for common array tasks.
 *
 * Overview:
 * In this task, you will create a series of methods that perform various operations on arrays. Each method includes a method signature and a TODO comment where you will implement the logic. This exercise will help you familiarize yourself with array manipulation and reinforce your understanding of method creation in Java.
 *
 * Instructions:
 * - Implement each method according to its description.
 * - Follow the TODO comments to guide your implementation.
 * - Test your methods in the `main` method by calling them with sample data.
 *
 * Note:
 * - Ensure proper handling of edge cases, such as empty arrays or invalid inputs.
 * - Use appropriate access modifiers and make methods `static` if necessary.
 */
public class Task_Arrays {

    public static void main(String[] args) {
        // TODO: Create sample arrays and test each array operation method here.

        int[] sampleArray = {5, 3, 8, 4, 2,2};
        System.out.println("2-Print Array Elements");
        printArray(sampleArray);

        System.out.println("3-Find Maximum Element");
        System.out.println(findMax(sampleArray));

        System.out.println("4-Find Minimum Element");
        System.out.println(findMin(sampleArray));

        System.out.println("5-Calculate Sum of Elements");
        System.out.println(calculateSum(sampleArray));

        System.out.println("6-Calculate Average of Elements");
        System.out.println(calculateAverage(sampleArray));


        System.out.println("7-Reverse the Array");
        reverseArray(sampleArray);
        printArray(sampleArray);

        System.out.println("8-Sort the Array");
        sortArray(sampleArray);
        printArray(sampleArray);

        System.out.println("9-Search for an Element");
        System.out.println(searchElement(sampleArray,7));

        System.out.println("10-Remove Duplicates from Array");
        System.out.println(removeDuplicates(sampleArray));
        printArray(sampleArray);
        /*
        // Example Usage:
        int[] sampleArray = {5, 3, 8, 4, 2};

        initializeArray(sampleArray);
        printArray(sampleArray);
        int max = findMax(sampleArray);
        int min = findMin(sampleArray);
        double sum = calculateSum(sampleArray);
        double average = calculateAverage(sampleArray);
        reverseArray(sampleArray);
        sortArray(sampleArray);
        boolean found = searchElement(sampleArray, 8);
        int[] uniqueArray = removeDuplicates(sampleArray);
        int frequency = countFrequency(sampleArray, 3);
        int[] mergedArray = mergeArrays(sampleArray, new int[]{1, 2, 3});
        int[] copiedArray = copyArray(sampleArray);
        fillArray(sampleArray, 10);
        boolean isEqual = compareArrays(sampleArray, copiedArray);
        rotateArray(sampleArray, 2);
        int secondLargest = findSecondLargest(sampleArray);
        */
    }

    /**
     * Task 1: Initialize an Array
     *
     * Description:
     * - Initialize all elements of the given array with a specific value.
     *
     * Method Signature:
     * - public static void initializeArray(int[] array, int value)
     *
     * TODO:
     * - Loop through the array and assign the specified value to each element.
     */
    public static void initializeArray(int[] array, int value) {
        // TODO: Implement logic to initialize the array with the given value.
         array[0] = 2;
         array[1] = 5;
         array[2] = 8;
         array[3] = 6;
         array[4] = 3;
    }

    /**
     * Task 2: Print Array Elements
     *
     * Description:
     * - Print all elements of the given array to the console.
     *
     * Method Signature:
     * - public static void printArray(int[] array)
     *
     * TODO:
     * - Iterate through the array and print each element, separated by spaces.
     */
    public static void printArray(int[] array) {
        // TODO: Implement logic to print array elements.
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Task 3: Find Maximum Element
     *
     * Description:
     * - Find and return the maximum element in the given array.
     *
     * Method Signature:
     * - public static int findMax(int[] array)
     *
     * TODO:
     * - Traverse the array to identify and return the largest element.
     */
    public static int findMax(int[] array) {
        // TODO: Implement logic to find the maximum element.
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max; // Placeholder return value
    }

    /**
     * Task 4: Find Minimum Element
     *
     * Description:
     * - Find and return the minimum element in the given array.
     *
     * Method Signature:
     * - public static int findMin(int[] array)
     *
     * TODO:
     * - Traverse the array to identify and return the smallest element.
     */
    public static int findMin(int[] array) {
        // TODO: Implement logic to find the minimum element.
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min; // Placeholder return value
    }

    /**
     * Task 5: Calculate Sum of Elements
     *
     * Description:
     * - Calculate and return the sum of all elements in the given array.
     *
     * Method Signature:
     * - public static double calculateSum(int[] array)
     *
     * TODO:
     * - Iterate through the array, summing up each element, and return the total.
     */
    public static double calculateSum(int[] array) {
        // TODO: Implement logic to calculate the sum of array elements.
        double sum = 0.0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum; // Placeholder return value
    }

    /**
     * Task 6: Calculate Average of Elements
     *
     * Description:
     * - Calculate and return the average of all elements in the given array.
     *
     * Method Signature:
     * - public static double calculateAverage(int[] array)
     *
     * TODO:
     * - Use the sum of elements divided by the number of elements to find the average.
     */
    public static double calculateAverage(int[] array) {
        // TODO: Implement logic to calculate the average of array elements.
        double avarage = 0.0;
        double sum = 0.0;
        for(int i =0; i<array.length; i++){
            sum += array[i];
        }
        avarage = sum/array.length;
        return avarage; // Placeholder return value
    }

    /**
     * Task 7: Reverse the Array
     *
     * Description:
     * - Reverse the order of elements in the given array.
     *
     * Method Signature:
     * - public static void reverseArray(int[] array)
     *
     * TODO:
     * - Swap elements from both ends moving towards the center of the array.
     */
    public static void reverseArray(int[] array) {
        // TODO: Implement logic to reverse the array.
        for(int i = 0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    /**
     * Task 8: Sort the Array in Ascending Order
     *
     * Description:
     * - Sort the elements of the given array in ascending order.
     *
     * Method Signature:
     * - public static void sortArray(int[] array)
     *
     * TODO:
     * - Implement a sorting algorithm (e.g., Bubble Sort, Selection Sort) to sort the array.
     */
    public static void sortArray(int[] array) {
        // TODO: Implement logic to sort the array in ascending order.

        for(int i = 0; i<array.length; i++){
            int temp = 0;
            for(int j=i+1; j< array.length; j++){
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Task 9: Search for an Element
     *
     * Description:
     * - Search for a specific element in the array and return true if found, else false.
     *
     * Method Signature:
     * - public static boolean searchElement(int[] array, int target)
     *
     * TODO:
     * - Iterate through the array to check if any element matches the target.
     */
    public static boolean searchElement(int[] array, int target) {
        // TODO: Implement logic to search for the target element.
        for(int i = 0; i<array.length; i++){
            if(target == array[i]){
                return true;
            }
        }
        return false; // Placeholder return value
    }

    /**
     * Task 10: Remove Duplicates from Array
     *
     * Description:
     * - Remove duplicate elements from the array and return a new array with unique elements.
     *
     * Method Signature:
     * - public static int[] removeDuplicates(int[] array)
     *
     * TODO:
     * - Use a temporary array or data structure to store unique elements and return the result.
     */
    public static int[] removeDuplicates(int[] array) {
        // TODO: Implement logic to remove duplicate elements.
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< array.length; i++){
            set.add(array[i]);
        }
        int[] newArray = Arrays.stream(array).distinct().toArray();
        for(int j = 0; j<newArray.length; j++){
            System.out.println(newArray[j]);
        }
        return newArray;
       // return new int[0]; // Placeholder return value
    }

    /**
     * Task 11: Count Frequency of an Element
     *
     * Description:
     * - Count how many times a specific element appears in the array.
     *
     * Method Signature:
     * - public static int countFrequency(int[] array, int element)
     *
     * TODO:
     * - Traverse the array and increment a counter each time the element is found.
     */
    public static int countFrequency(int[] array, int element) {
        // TODO: Implement logic to count the frequency of the element.
        return 0; // Placeholder return value
    }

    /**
     * Task 12: Merge Two Arrays
     *
     * Description:
     * - Merge two arrays into a single array.
     *
     * Method Signature:
     * - public static int[] mergeArrays(int[] array1, int[] array2)
     *
     * TODO:
     * - Create a new array with a length equal to the sum of both arrays and copy elements accordingly.
     */
    public static int[] mergeArrays(int[] array1, int[] array2) {
        // TODO: Implement logic to merge two arrays.
        return new int[0]; // Placeholder return value
    }

    /**
     * Task 13: Copy an Array
     *
     * Description:
     * - Create a copy of the given array.
     *
     * Method Signature:
     * - public static int[] copyArray(int[] array)
     *
     * TODO:
     * - Initialize a new array of the same length and copy each element from the original array.
     */
    public static int[] copyArray(int[] array) {
        // TODO: Implement logic to copy the array.
        return new int[0]; // Placeholder return value
    }

    /**
     * Task 14: Fill an Array with a Specific Value
     *
     * Description:
     * - Fill all elements of the array with a specified value.
     *
     * Method Signature:
     * - public static void fillArray(int[] array, int value)
     *
     * TODO:
     * - Iterate through the array and assign the specified value to each element.
     */
    public static void fillArray(int[] array, int value) {
        // TODO: Implement logic to fill the array with the given value.
    }

    /**
     * Task 15: Compare Two Arrays for Equality
     *
     * Description:
     * - Compare two arrays to determine if they are equal (same length and same elements in order).
     *
     * Method Signature:
     * - public static boolean compareArrays(int[] array1, int[] array2)
     *
     * TODO:
     * - Check if both arrays have the same length. If not, return false.
     * - Compare each corresponding element for equality.
     */
    public static boolean compareArrays(int[] array1, int[] array2) {
        // TODO: Implement logic to compare two arrays for equality.
        return false; // Placeholder return value
    }

    /**
     * Task 16: Rotate Array Elements
     *
     * Description:
     * - Rotate the elements of the array to the right by a specified number of positions.
     *
     * Method Signature:
     * - public static void rotateArray(int[] array, int positions)
     *
     * TODO:
     * - Handle cases where positions > array length.
     * - Perform the rotation by shifting elements accordingly.
     */
    public static void rotateArray(int[] array, int positions) {
        // TODO: Implement logic to rotate the array elements.
    }

    /**
     * Task 17: Find the Second Largest Element
     *
     * Description:
     * - Find and return the second largest element in the array.
     *
     * Method Signature:
     * - public static int findSecondLargest(int[] array)
     *
     * TODO:
     * - Traverse the array to identify the largest and second largest elements.
     * - Handle cases where the array has fewer than two unique elements.
     */
    public static int findSecondLargest(int[] array) {
        // TODO: Implement logic to find the second largest element.
        return 0; // Placeholder return value
    }

    /**
     * Task 18: Find the Missing Number in a Sequence
     *
     * Description:
     * - Given an array containing a sequence of numbers with exactly one number missing, find the missing number.
     *
     * Method Signature:
     * - public static int findMissingNumber(int[] array, int start, int end)
     *
     * TODO:
     * - Calculate the expected sum of the sequence from start to end.
     * - Subtract the actual sum of the array elements to find the missing number.
     */
    public static int findMissingNumber(int[] array, int start, int end) {
        // TODO: Implement logic to find the missing number in the sequence.
        return 0; // Placeholder return value
    }

    /**
     * Task 19: Find Common Elements Between Two Arrays
     *
     * Description:
     * - Identify and return the common elements between two arrays.
     *
     * Method Signature:
     * - public static int[] findCommonElements(int[] array1, int[] array2)
     *
     * TODO:
     * - Compare elements of both arrays and collect those that appear in both.
     * - Avoid duplicates in the result.
     */
    public static int[] findCommonElements(int[] array1, int[] array2) {
        // TODO: Implement logic to find common elements between two arrays.
        return new int[0]; // Placeholder return value
    }

    /**
     * Task 20: Find Unique Elements in an Array
     *
     * Description:
     * - Identify and return the elements that appear only once in the array.
     *
     * Method Signature:
     * - public static int[] findUniqueElements(int[] array)
     *
     * TODO:
     * - Traverse the array and count the frequency of each element.
     * - Collect elements with a frequency of one.
     */
    public static int[] findUniqueElements(int[] array) {
        // TODO: Implement logic to find unique elements in the array.
        return new int[0]; // Placeholder return value
    }
}
