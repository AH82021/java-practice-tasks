package tasks;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Task: Basic String Operations
 *
 * Title: **String Operations Practice**
 *
 * Goal:
 * - **Understand and implement basic string operations** in Java.
 * - **Practice writing method signatures** and outlining logic for common string tasks.
 *
 * Overview:
 * In this task, you will create a series of methods that perform various operations on strings. Each method includes a method signature and a TODO comment where you will implement the logic. This exercise will help you familiarize yourself with string manipulation and reinforce your understanding of method creation in Java.
 *
 * Instructions:
 * - Implement each method according to its description.
 * - Follow the TODO comments to guide your implementation.
 * - Test your methods in the `main` method by calling them with sample data.
 *
 * Note:
 * - Ensure proper handling of edge cases, such as empty strings or null inputs.
 * - Use appropriate access modifiers and make methods `static` if necessary.
 */
public class Task_Strings {

    public static void main(String[] args) {
        // TODO: Create sample strings and test each string operation method here.

        String sample1 = "Hello World";
        String reversed = reverseString(sample1);
        System.out.println(reversed);
        System.out.println(countVowels("Jeena"));

        System.out.println(areAnagrams("Ajmal ","majal"));

        /*
        // Example Usage:
        String sample1 = "Hello World";
        String sample2 = "Java Programming";
        String sample3 = "madam";
        String sample4 = "OpenAI ChatGPT";
        String sample5 = "  Trim this string  ";

        String concatenated = concatenateStrings(sample1, sample2);
        printStringLength(sample1);
        String upper = convertToUpperCase(sample2);
        String lower = convertToLowerCase(sample1);
        String replaced = replaceSubstring(sample2, "Programming", "AI");
        boolean isPal = isPalindrome(sample3);
        String reversed = reverseString(sample1);
        int vowelCount = countVowels(sample1);
        int index = findIndexOfChar(sample1, 'W');
        String substring = extractSubstring(sample2, 5, 16);
        String[] split = splitString(sample1, " ");
        String trimmed = trimWhitespace(sample5);
        boolean equals = compareStrings(sample1, sample2);
        boolean contains = containsSubstring(sample4, "Chat");
        char[] charArray = convertToCharArray(sample1);
        String unique = removeDuplicates(sample1);
        String capitalized = capitalizeFirstLetter(sample3);
        int frequency = countFrequency(sample1, 'l');
        */
    }

    /**
     * Task 1: Concatenate Two Strings
     * <p>
     * Description:
     * - Concatenate two given strings and return the resulting string.
     * <p>
     * Method Signature:
     * - public static String concatenateStrings(String str1, String str2)
     * <p>
     * TODO:
     * - Combine str1 and str2 using the `+` operator or `concat` method.
     * - Return the concatenated string.
     */
    public static String concatenateStrings(String str1, String str2) {
        // TODO: Implement logic to concatenate two strings.
        return str1 + str2; // Placeholder return value
    }

    /**
     * Task 2: Print Length of a String
     * <p>
     * Description:
     * - Print the length of the given string.
     * <p>
     * Method Signature:
     * - public static void printStringLength(String str)
     * <p>
     * TODO:
     * - Use the `length()` method to determine the string's length.
     * - Print the length to the console.
     */
    public static void printStringLength(String str) {
        // TODO: Implement logic to print the length of the string.
        System.out.println(str.length());

    }

    /**
     * Task 3: Convert String to Uppercase
     * <p>
     * Description:
     * - Convert the given string to uppercase letters.
     * <p>
     * Method Signature:
     * - public static String convertToUpperCase(String str)
     * <p>
     * TODO:
     * - Use the `toUpperCase()` method to convert the string.
     * - Return the uppercase string.
     */
    public static String convertToUpperCase(String str) {
        // TODO: Implement logic to convert string to uppercase.
        return str.toUpperCase(); // Placeholder return value
    }

    /**
     * Task 4: Convert String to Lowercase
     * <p>
     * Description:
     * - Convert the given string to lowercase letters.
     * <p>
     * Method Signature:
     * - public static String convertToLowerCase(String str)
     * <p>
     * TODO:
     * - Use the `toLowerCase()` method to convert the string.
     * - Return the lowercase string.
     */
    public static String convertToLowerCase(String str) {
        // TODO: Implement logic to convert string to lowercase.
        return str.toLowerCase(); // Placeholder return value
    }

    /**
     * Task 5: Replace a Substring
     * <p>
     * Description:
     * - Replace all occurrences of a target substring with a replacement substring in the given string.
     * <p>
     * Method Signature:
     * - public static String replaceSubstring(String str, String target, String replacement)
     * <p>
     * TODO:
     * - Use the `replace()` or `replaceAll()` method to perform the replacement.
     * - Return the modified string.
     */
    public static String replaceSubstring(String str, String target, String replacement) {
        // TODO: Implement logic to replace a substring within the string.
        return null; // Placeholder return value
    }

    /**
     * Task 6: Check if a String is a Palindrome
     * <p>
     * Description:
     * - Determine whether the given string is a palindrome (reads the same forwards and backwards).
     * <p>
     * Method Signature:
     * - public static boolean isPalindrome(String str)
     * <p>
     * TODO:
     * - Reverse the string and compare it to the original.
     * - Return true if they are identical, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        // TODO: Implement logic to check if the string is a palindrome.
        return false; // Placeholder return value
    }

    /**
     * Task 7: Reverse a String
     * <p>
     * Description:
     * - Reverse the order of characters in the given string.
     * <p>
     * Method Signature:
     * - public static String reverseString(String str)
     * <p>
     * TODO:
     * - Use a loop to iterate through the string backwards and build the reversed string.
     * - Return the reversed string.
     */
    public static String reverseString(String str) {
        // TODO: Implement logic to reverse the string.


//"Jeena" ""+a+n+e+e+J
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            char c = str.charAt(i);

            reverse += c;
        }
        return reverse; // Placeholder return value
    }

    /**
     * Task 8: Count Vowels in a String
     * <p>
     * Description:
     * - Count the number of vowels (a, e, i, o, u) in the given string.
     * <p>
     * Method Signature:
     * - public static int countVowels(String str)
     * <p>
     * TODO:
     * - Iterate through the string and count vowels.
     * - Return the total count.
     */
    //Jeena => // loop , if c
    public static int countVowels(String str) {

        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
            if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
                count++;
            }


        }
        // TODO: Implement logic to count vowels in the string.
        return count; // Placeholder return*45*\9-value
    }

    /**
     * Task 9: Find Index of a Character
     * <p>
     * Description:
     * - Find the index of the first occurrence of a specified character in the string.
     * <p>
     * Method Signature:
     * - public static int findIndexOfChar(String str, char ch)
     * <p>
     * TODO:
     * - Use the `indexOf()` method to find the character's index.
     * - Return the index, or -1 if the character is not found.
     */
    public static int findIndexOfChar(String str, char ch) {
        // TODO: Implement logic to find the index of a character.
        return -1; // Placeholder return value
    }

    /**
     * Task 10: Extract a Substring
     * <p>
     * Description:
     * - Extract a substring from the given string between specified start and end indices.
     * <p>
     * Method Signature:
     * - public static String extractSubstring(String str, int start, int end)
     * <p>
     * TODO:
     * - Use the `substring()` method to extract the desired portion.
     * - Handle potential `IndexOutOfBoundsException`.
     * - Return the extracted substring.
     */
    public static String extractSubstring(String str, int start, int end) {
        // TODO: Implement logic to extract a substring from the string.
        return str.substring(start, end); // Placeholder return value
    }

    /**
     * Task 11: Split a String by Delimiter
     * <p>
     * Description:
     * - Split the given string into an array of substrings based on a specified delimiter.
     * <p>
     * Method Signature:
     * - public static String[] splitString(String str, String delimiter)
     * <p>
     * TODO:
     * - Use the `split()` method to divide the string.
     * - Return the resulting array of substrings.
     */
    public static String[] splitString(String str, String delimiter) {
        // TODO: Implement logic to split the string by the given delimiter.
        return str.split(delimiter); // Placeholder return value
    }

    /**
     * Task 12: Trim Whitespace from a String
     * <p>
     * Description:
     * - Remove leading and trailing whitespace from the given string.
     * <p>
     * Method Signature:
     * - public static String trimWhitespace(String str)
     * <p>
     * TODO:
     * - Use the `trim()` method to eliminate extra spaces.
     * - Return the trimmed string.
     */
    public static String trimWhitespace(String str) {
        // TODO: Implement logic to trim whitespace from the string.
        return str.trim(); // Placeholder return value
    }

    /**
     * Task 13: Compare Two Strings (Case-Sensitive)
     * <p>
     * Description:
     * - Compare two strings for equality, considering case differences.
     * <p>
     * Method Signature:
     * - public static boolean compareStrings(String str1, String str2)
     * <p>
     * TODO:
     * - Use the `equals()` method to compare the strings.
     * - Return true if they are identical, false otherwise.
     */
    public static boolean compareStrings(String str1, String str2) {
        // TODO: Implement logic to compare two strings for equality (case-sensitive).

        // Placeholder return value
        return str1.equals(str2);
    }

    /**
     * Task 14: Check if a String Contains a Substring
     * <p>
     * Description:
     * - Determine whether the given string contains a specified substring.
     * <p>
     * Method Signature:
     * - public static boolean containsSubstring(String str, String substring)
     * <p>
     * TODO:
     * - Use the `contains()` method to check for the substring.
     * - Return true if found, false otherwise.
     */
    public static boolean containsSubstring(String str, String substring) {
        // TODO: Implement logic to check if the string contains the substring.
        return str.contains(substring); // Placeholder return value
    }

    /**
     * Task 15: Convert String to Character Array
     * <p>
     * Description:
     * - Convert the given string into an array of characters.
     * <p>
     * Method Signature:
     * - public static char[] convertToCharArray(String str)
     * <p>
     * TODO:
     * - Use the `toCharArray()` method to perform the conversion.
     * - Return the resulting character array.
     */
    public static char[] convertToCharArray(String str) {
        // TODO: Implement logic to convert the string to a character array.
        return str.toCharArray(); // Placeholder return value
    }

    /**
     * Task 16: Remove Duplicates from a String
     * <p>
     * Description:
     * - Remove duplicate characters from the given string and return a new string with unique characters.
     * <p>
     * Method Signature:
     * - public static String removeDuplicates(String str)
     * <p>
     * TODO:
     * - Iterate through the string and build a new string with only unique characters.
     * - Consider using a `StringBuilder` and checking for existing characters.
     * - Return the string without duplicates.
     */
    public static String removeDuplicates(String str) {
        // TODO: Implement logic to remove duplicate characters from the string.
        return null; // Placeholder return value
    }

    /**
     * Task 17: Capitalize the First Letter of Each Word
     * <p>
     * Description:
     * - Capitalize the first letter of each word in the given string.
     * <p>
     * Method Signature:
     * - public static String capitalizeFirstLetter(String str)
     * <p>
     * TODO:
     * - Split the string into words.
     * - Capitalize the first letter of each word.
     * - Join the words back into a single string.
     * - Return the capitalized string.
     */
    public static String capitalizeFirstLetter(String str) {
        // TODO: Implement logic to capitalize the first letter of each word in the string.
        return null; // Placeholder return value
    }

    /**
     * Task 18: Count Frequency of a Character in a String
     * <p>
     * Description:
     * - Count how many times a specific character appears in the given string.
     * <p>
     * Method Signature:
     * - public static int countFrequency(String str, char ch)
     * <p>
     * TODO:
     * - Iterate through the string and count occurrences of the specified character.
     * - Return the total count.
     */
    public static int countFrequency(String str, char ch) {
        // TODO: Implement logic to count the frequency of a character in the string.
        return 0; // Placeholder return value
    }

    /**
     * Task 19: Find the First Non-Repeating Character
     * <p>
     * Description:
     * - Identify and return the first character in the string that does not repeat.
     * <p>
     * Method Signature:
     * - public static char firstNonRepeatingChar(String str)
     * <p>
     * TODO:
     * - Use a data structure to track character counts.
     * - Iterate through the string to find the first character with a count of one.
     * - Return the character or a special value if all characters repeat.
     */
    public static char firstNonRepeatingChar(String str) {
        // TODO: Implement logic to find the first non-repeating character in the string.
        return '\0'; // Placeholder return value
    }

    /**
     * Task 20: Check if Two Strings are Anagrams
     * <p>
     * Description:
     * - Determine whether two strings are anagrams (contain the same characters in a different order).
     * <p>
     * Method Signature:
     * - public static boolean areAnagrams(String str1, String str2)
     * <p>
     * TODO:
     * - Remove whitespace and convert both strings to the same case.
     * - Sort the characters of both strings.
     * - Compare the sorted strings for equality.
     * - Return true if they are anagrams, false otherwise.
     */
    public static <equals> boolean areAnagrams(String str1, String str2) {
        // TODO: Implement logic to check if two strings are anagrams.
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);


    }

}