package tasks;

/**
 * This class contains multiple string-related practice tasks.
 * Each task includes:
 *   - A brief description of the goal.
 *   - A method signature for you to implement.
 *   - Suggested basic logic for new Java students.
 *
 * You can test each task by calling its corresponding method inside the main() method
 * with various sample inputs.
 */
public class Tasks_MultipleStringChallenges {

    public static void main(String[] args) {

        // 1. Capitalize First Letter
        System.out.println("Task 1: Capitalize First Letter");
        String input1 = "ahmad";
        String output1 = capitalizeFirstLetter(input1);
        System.out.println("Input: " + input1 + " | Output: " + output1);
        System.out.println();

        // 2. Reverse a String
        System.out.println("Task 2: Reverse a String");
        String input2 = "Java";
        String output2 = reverseString(input2);
        System.out.println("Input: " + input2 + " | Output: " + output2);
        System.out.println();

        // 3. Count Vowels
        System.out.println("Task 3: Count Vowels");
        String input3 = "Hello World";
        int vowelCount = countVowels(input3);
        System.out.println("Input: " + input3 + " | Vowel Count: " + vowelCount);
        System.out.println();

        // 4. Check Palindrome
        System.out.println("Task 4: Check Palindrome");
        String input4 = "racecar";
        boolean isPal = isPalindrome(input4);
        System.out.println("Input: " + input4 + " | Is Palindrome? " + isPal);
        System.out.println();

        // 5. Remove Whitespace
        System.out.println("Task 5: Remove Whitespace");
        String input5 = "  Java   Programming  ";
        String output5 = removeWhitespace(input5);
        System.out.println("Original: [" + input5 + "]");
        System.out.println("Whitespace Removed: [" + output5 + "]");
        System.out.println();

        // 6. Convert to Uppercase
        System.out.println("Task 6: Convert to Uppercase");
        String input6 = "hello world";
        String output6 = toUpperCase(input6);
        System.out.println("Input: " + input6 + " | Output: " + output6);
        System.out.println();

        // 7. Convert to Lowercase
        System.out.println("Task 7: Convert to Lowercase");
        String input7 = "HELLO WORLD";
        String output7 = toLowerCase(input7);
        System.out.println("Input: " + input7 + " | Output: " + output7);
        System.out.println();

        // 8. Replace Substring
        System.out.println("Task 8: Replace Substring");
        String input8 = "Java is fun. Java is cool.";
        String output8 = replaceSubstring(input8, "Java", "Python");
        System.out.println("Original: " + input8);
        System.out.println("Replaced: " + output8);
        System.out.println();

        // 9. Extract Substring
        System.out.println("Task 9: Extract Substring");
        String input9 = "Hello, Java!";
        String output9 = extractSubstring(input9, 7, 11); // "Java" is between 7 (inclusive) and 11 (exclusive)
        System.out.println("Original: " + input9);
        System.out.println("Substring: " + output9);
        System.out.println();

        // 10. Count Occurrences of a Substring
        System.out.println("Task 10: Count Occurrences of a Substring");
        String input10 = "banana";
        int occurrences10 = countOccurrences(input10, "ana");
        System.out.println("Input: " + input10 + " | Substring: 'ana' | Occurrences: " + occurrences10);
        System.out.println();

        // 11. Split String by Delimiter
        System.out.println("Task 11: Split String by Delimiter");
        String input11 = "red,green,blue";
        String[] output11 = splitString(input11, ",");
        System.out.print("Original: " + input11 + " | Split by ',' => ");
        for (String s : output11) {
            System.out.print("[" + s + "] ");
        }
        System.out.println("\n");

        // 12. Compare Strings Ignoring Case
        System.out.println("Task 12: Compare Strings Ignoring Case");
        String input12a = "Hello";
        String input12b = "hello";
        boolean equalsIgnoreCase = compareIgnoreCase(input12a, input12b);
        System.out.println("Compare \"" + input12a + "\" and \"" + input12b + "\" ignoring case: " + equalsIgnoreCase);
        System.out.println();
    }

    /**
     * Task 1: Capitalize the First Letter
     *
     * Example:
     *   Input: "ahmad"
     *   Output: "Ahmad"
     *
     * Method Signature:
     *   public static String capitalizeFirstLetter(String input)
     *
     * Basic Logic:
     *   1. Check if input is null or empty -> return input as is.
     *   2. Convert first character to uppercase, then append the rest of the string.
     */
    public static String capitalizeFirstLetter(String input) {
        // TODO: Implement logic
        return null;
    }

    /**
     * Task 2: Reverse a String
     *
     * Example:
     *   Input: "Java"
     *   Output: "avaJ"
     *
     * Method Signature:
     *   public static String reverseString(String input)
     *
     * Basic Logic:
     *   1. Check if input is null or empty -> return input as is.
     *   2. Create a new empty String (e.g., reversed = "").
     *   3. Loop backwards from the last character to the first, appending each char to reversed.
     *   4. Return reversed.
     */
    public static String reverseString(String input) {
        // TODO: Implement logic
        return null;
    }

    /**
     * Task 3: Count Vowels
     *
     * Example:
     *   Input: "Hello World"
     *   Output: 3 (e, o, o)
     *
     * Method Signature:
     *   public static int countVowels(String input)
     *
     * Basic Logic:
     *   1. Check if input is null or empty -> return 0.
     *   2. Convert the string to lowercase.
     *   3. Initialize a counter to 0.
     *   4. Loop through each character; if it's 'a', 'e', 'i', 'o', or 'u', increment the counter.
     *   5. Return the counter.
     */
    public static int countVowels(String input) {
        // TODO: Implement logic
        return 0;
    }

    /**
     * Task 4: Check Palindrome
     *
     * Example:
     *   Input: "racecar"
     *   Output: true
     *
     * Method Signature:
     *   public static boolean isPalindrome(String input)
     *
     * Basic Logic:
     *   1. Check if input is null -> return false, or you can decide how to handle null.
     *   2. Reverse the string (or use two-pointer technique).
     *   3. Compare the reversed string to the original.
     *   4. If they are the same, return true; otherwise false.
     */
    public static boolean isPalindrome(String input) {
        // TODO: Implement logic
        return false;
    }

    /**
     * Task 5: Remove Whitespace
     *
     * Example:
     *   Input: "  Java   Programming  "
     *   Output: "JavaProgramming"
     *
     * Method Signature:
     *   public static String removeWhitespace(String input)
     *
     * Basic Logic:
     *   1. Check if input is null -> return input as is.
     *   2. Replace all whitespace characters using regex or manual approach.
     *      Example using regex: input.replaceAll("\\s+", "")
     *   3. Return the new string without spaces.
     */
    public static String removeWhitespace(String input) {
        // TODO: Implement logic
        return null;
    }

    /**
     * Task 6: Convert to Uppercase
     *
     * Example:
     *   Input: "hello world"
     *   Output: "HELLO WORLD"
     *
     * Method Signature:
     *   public static String toUpperCase(String input)
     *
     * Basic Logic:
     *   1. Check if input is null -> return input.
     *   2. Use input.toUpperCase() if allowed, or loop through each character and convert manually.
     */
    public static String toUpperCase(String input) {
        // TODO: Implement logic
        return null;
    }

    /**
     * Task 7: Convert to Lowercase
     *
     * Example:
     *   Input: "HELLO WORLD"
     *   Output: "hello world"
     *
     * Method Signature:
     *   public static String toLowerCase(String input)
     *
     * Basic Logic:
     *   1. Check if input is null -> return input.
     *   2. Use input.toLowerCase() if allowed, or loop through each character and convert manually.
     */
    public static String toLowerCase(String input) {
        // TODO: Implement logic
        return null;
    }

    /**
     * Task 8: Replace Substring
     *
     * Example:
     *   Input: "Java is fun. Java is cool.", target="Java", replacement="Python"
     *   Output: "Python is fun. Python is cool."
     *
     * Method Signature:
     *   public static String replaceSubstring(String input, String target, String replacement)
     *
     * Basic Logic:
     *   1. Check if any parameter is null -> handle accordingly.
     *   2. Use input.replace(...) or input.replaceAll(...), or manually build the result (advanced).
     */
    public static String replaceSubstring(String input, String target, String replacement) {
        // TODO: Implement logic
        return null;
    }

    /**
     * Task 9: Extract Substring
     *
     * Example:
     *   Input: "Hello, Java!", start=7, end=11
     *   Output: "Java"
     *
     * Method Signature:
     *   public static String extractSubstring(String input, int start, int end)
     *
     * Basic Logic:
     *   1. Check if input is null -> return input.
     *   2. Validate indices (start >= 0, end <= input.length(), start < end).
     *   3. Use input.substring(start, end).
     */
    public static String extractSubstring(String input, int start, int end) {
        // TODO: Implement logic
        return null;
    }

    /**
     * Task 10: Count Occurrences of a Substring
     *
     * Example:
     *   Input: "banana", sub="ana"
     *   Output: 2  (occurrences: "b[ana]na" and "ban[ana]")
     *
     * Method Signature:
     *   public static int countOccurrences(String input, String sub)
     *
     * Basic Logic:
     *   1. Check if input or sub is null or empty -> return 0.
     *   2. Loop or use indexOf in a while loop:
     *      - Find index of sub in input.
     *      - If found, increment count, and move the search index right after the found occurrence.
     *   3. Return the count.
     */
    public static int countOccurrences(String input, String sub) {
        // TODO: Implement logic
        return 0;
    }

    /**
     * Task 11: Split String by Delimiter
     *
     * Example:
     *   Input: "red,green,blue", delimiter=","
     *   Output: ["red", "green", "blue"]
     *
     * Method Signature:
     *   public static String[] splitString(String input, String delimiter)
     *
     * Basic Logic:
     *   1. Check if input or delimiter is null -> handle accordingly.
     *   2. Use input.split(delimiter) if allowed.
     *   3. Return the resulting array.
     */
    public static String[] splitString(String input, String delimiter) {
        // TODO: Implement logic
        return null;
    }

    /**
     * Task 12: Compare Two Strings Ignoring Case
     *
     * Example:
     *   Input: "Hello", "hello"
     *   Output: true
     *
     * Method Signature:
     *   public static boolean compareIgnoreCase(String s1, String s2)
     *
     * Basic Logic:
     *   1. Check if both s1 and s2 are not null.
     *   2. Use s1.equalsIgnoreCase(s2) if allowed, or convert both to lowercase and compare.
     */
    public static boolean compareIgnoreCase(String s1, String s2) {
        // TODO: Implement logic
        return false;
    }

}
