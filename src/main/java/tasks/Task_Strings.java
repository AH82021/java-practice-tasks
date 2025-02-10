package tasks;



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


        // task one  call to concatenate strings methode

        //String res = concatenateStrings( s1,s2 );

        //print the concatenated res

        //System.out.println(res);
        //
        //String res1 = concatenateString( s3,s4,s5,s6,s7);

        //System.out.println(res1);


        //task 2 print lengths of the given  strings:


        // print tasks 3 and 4



        // Example Usage:
        String sample1 = "Hello World";
        String sample2 = "Java Programming";
        String sample3 = "madam";
        String sample4 = "OpenAI ChatGPT";
        String sample5 = "Trim this string  ";

        String concatenated = concatenateStrings(sample1,sample2);
        printStringLength(concatenated);
        String upper = convertToUpperCase(sample2);
        System.out.println(upper);
        String lower = convertToLowerCase(sample1);
        System.out.println(lower);
        String replaced = replaceSubstring(sample2, "Programming", "AI");

        System.out.println(replaced);



        //boolean isPal = isPalindrome(sample3);

        String reversed = reverseString(sample1);
        System.out.println(reversed);
        int vowelCount = countVowels(sample1);
        System.out.println(vowelCount);
        //int index = findIndexOfChar(sample1, 'W');
        /*
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
     * *
     * *description:
     * * - Concatenate two given strings and return the resulting string.
     * *
     * * Method Signature:
     * * - public stat
     * ic String concatenateStrings(String str1, String str2)
     * <p>
     * TODO:method.
     * *
     * - Combine str1 and str2 using the `+` operator or `concat`  - Return the concatenated string.
     */
    public static String concatenateStrings(String str1, String str2) {
        // TODO: Implement logic to concatenate two strings.
        return  str1+str2;
    }





    /**
     * Task 2: Print Length of a String
     *
     * Description:
     * - Print the length of the given string.
     *
     * Method Signature:
     * - public static void printStringLength(String str)
     *
     * TODO:
     * - Use the `length()` method to determine the string's length.
     * - Print the length to the console.
     */

    public static void printStringLength(String str) {
        // TODO: Implement logic to print the length of the string.
        str.length();


    }

    /**
     * Task 3: Convert String to Uppercase
     *
     * Description:
     * - Convert the given string to uppercase letters.
     *
     * Method Signature:
     * - public static String convertToUpperCase(String str)
     *
     * TODO:
     * - Use the `toUpperCase()` method to convert the string.
     * - Return the uppercase string.
     */
    public static String convertToUpperCase(String str1) {
        // TODO: Implement logic to convert string to uppercase.

        return str1.toUpperCase(); // Placeholder return value
    }


    /**
     * Task 4: Convert String to Lowercase
     *
     * Description:
     * - Convert the given string to lowercase letters.
     *
     * Method Signature:
     * - public static String convertToLowerCase(String str)
     *
     * TODO:
     * - Use the `toLowerCase()` method to convert the string.
     * - Return the lowercase string.
     */
    public static String convertToLowerCase(String str) {
        // TODO: Implement logic to convert string to lowercase.
        return str.toLowerCase();// Placeholder return value
    }

    /**
     * Task 5: Replace a Substring
     *
     * Description:
     * - Replace all occurrences of a target substring with a replacement substring in the given string.
     *
     * Method Signature:
     * - public static String replaceSubstring(String str, String target, String replacement)
     *
     * TODO:
     * - Use the `replace()` or `replaceAll()` method to perform the replacement.
     * - Return the modified string.
     */
    public static String replaceSubstring(String str, String target, String replacement) {
        // TODO: Implement logic to replace a substring within the string.
        return str.replace( 'n','b' );// Placeholder return value
    }

    /**
     * Task 6: Check if a String is a Palindrome
     *
     * Description:
     * - Determine whether the given string is a palindrome (reads the same forwards and backwards).
     *
     * Method Signature:
     * - public static boolean isPalindrome(String str)
     *
     * TODO:
     * - Reverse the string and compare it to the original.
     * - Return true if they are identical, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        // TODO: Implement logic to check if the string is a palindrome.

        return false;
    }

        /**
         * Task 7: Reverse a String
         *
         * Description:
         * - Reverse the order of characters in the given string.
         *
         * Method Signature:
         * - public static String reverseString(String str)
         *
         * TODO:
         * - Use a loop to iterate through the string backwards and build the reversed string.
         * - Return the reversed string.
         */
        public static String reverseString (String str1){
            // TODO: Implement logic to reverse the string.

            String reversed="";

            for (int i=str1.length()-1; i>=0;i--){
                reversed  +=str1.charAt( i );
            }
            return reversed;
        }

        /**
         * Task 8: Count Vowels in a String
         *
         * Description:
         * - Count the number of vowels (a, e, i, o, u) in the given string.
         *
         * Method Signature:
         * - public static int countVowels(String str)
         *
         * TODO:
         * - Iterate through the string and count vowels.
         * - Return the total count.
         */
        public static int countVowels (String str1){
            // TODO: Implement logic to count vowels in the string.

            int vowels = 5;
            return vowels; // Placeholder return value
        }

        /**
         * Task 9: Find Index of a Character
         *
         * Description:
         * - Find the index of the first occurrence of a specified character in the string.
         *
         * Method Signature:
         * - public static int findIndexOfChar(String str, char ch)
         *
         * TODO:
         * - Use the `indexOf()` method to find the character's index.
         * - Return the index, or -1 if the character is not found.
         */
        public static int findIndexOfChar (String str1,char ch) {
            // TODO: Implement logic to find the index of a character.
            return -1;
        }

        /**
         * Task 10: Extract a Substring
         *
         * Description:
         * - Extract a substring from the given string between specified start and end indices.
         *
         * Method Signature:
         * - public static String extractSubstring(String str, int start, int end)
         *
         * TODO:
         * - Use the `substring()` method to extract the desired portion.
         * - Handle potential `IndexOutOfBoundsException`.
         * - Return the extracted substring.
         */
        public static String extractSubstring (String str1,int start, int end){
            // TODO: Implement logic to extract a substring from the string.
            return null;// Placeholder return value
        }
        /**
         *      * Task 11: Split a String by Delimiter
         *      *
         *      * Description:
         *      * - Split the given string into an array of substrings based on a specified delimiter.
         *      *
         *      * Method Signature:
         *      * - public static String[] splitString(String str, String delimiter)
         *      *
         *      * TODO:
         *      * - Use the `split()` method to divide the string.
         *      * - Return the resulting array of substrings.
         *      */


        public static String[] splitString (String str1, String delimiter){
            // TODO: Implement logic to split the string by the given delimiter.
            return new String[0]; // Placeholder return value
        }


        /**
         *      * Task 12: Trim Whitespace from a String
         *      *
         *      * Description:
         *      * - Remove leading and trailing whitespace from the given string.
         *      *
         *      * Method Signature:
         *      * - public static String trimWhitespace(String str)
         *
         * TODO:
         * - Use the `trim()` method to eliminate extra spaces.
         * - Return the trimmed string.
         */
        public static String trimWhitespace (String str1){
            // TODO: Implement logic to trim whitespace from the string.
            return null; // Placeholder return value
        }

        /**
         * Task 13: Compare Two Strings (Case-Sensitive)
         *
         * Description:
         * - Compare two strings for equality, considering case differences.
         *
         * Method Signature:
         * - public static boolean compareStrings(String str1, String str2)
         *
         * TODO:
         * - Use the `equals()` method to compare the strings.
         * - Return true if they are identical, false otherwise.
         */
        public static boolean compareStrings (String str1, String str2){
            // TODO: Implement logic to compare two strings for equality (case-sensitive).
            return false; // Placeholder return value
        }

        /**
         * Task 14: Check if a String Contains a Substring
         *
         * Description:
         * - Determine whether the given string contains a specified substring.
         *
         * Method Signature:
         * - public static boolean containsSubstring(String str, String substring)
         *
         * TODO:
         * - Use the `contains()` method to check for the substring.
         * - Return true if found, false otherwise.
         */
        public static boolean containsSubstring (String str1, String substring){
            // TODO: Implement logic to check if the string contains the substring.
            return false; // Placeholder return value
        }

        /**
         * Task 15: Convert String to Character Array
         *
         * Description:
         * - Convert the given string into an array of characters.
         *
         * Method Signature:
         * - public static char[] convertToCharArray(String str)
         *
         * TODO:
         * - Use the `toCharArray()` method to perform the conversion.
         * - Return the resulting character array.
         */
        public static char[] convertToCharArray (String str1){
            // TODO: Implement logic to convert the string to a character array.
            return new char[0]; // Placeholder return value
        }

        /**
         * Task 16: Remove Duplicates from a String
         *
         * Description:
         * - Remove duplicate characters from the given string and return a new string with unique characters.
         *
         * Method Signature:
         * - public static String removeDuplicates(String str)
         *
         * TODO:
         * - Iterate through the string and build a new string with only unique characters.
         * - Consider using a `StringBuilder` and checking for existing characters.
         * - Return the string without duplicates.
         */
        public static String removeDuplicates (String str1){

            // TODO: Implement logic to remove duplicate characters from the string.
            return null; // Placeholder return value
        }

        /**
         * Task 17: Capitalize the First Letter of Each Word
         *
         * Description:
         * - Capitalize the first letter of each word in the given string.
         *
         * Method Signature:
         * - public static String capitalizeFirstLetter(String str)
         *
         * TODO:
         * - Split the string into words.
         * - Capitalize the first letter of each word.
         * - Join the words back into a single string.
         * - Return the capitalized string.
         */
        public static String capitalizeFirstLetter (String str1){
            // TODO: Implement logic to capitalize the first letter of each word in the string.
            return null; // Placeholder return value
        }

        /**
         * Task 18: Count Frequency of a Character in a String
         *
         * Description:
         * - Count how many times a specific character appears in the given string.
         *
         * Method Signature:
         * - public static int countFrequency(String str, char ch)
         *
         * TODO:
         * - Iterate through the string and count occurrences of the specified character.
         * - Return the total count.
         */
        public static int countFrequency (String str1,char ch){
            // TODO: Implement logic to count the frequency of a character in the string.
            return 0; // Placeholder return value
        }

        /**
         * Task 19: Find the First Non-Repeating Character
         *
         * Description:
         * - Identify and return the first character in the string that does not repeat.
         *
         * Method Signature:
         * - public static char firstNonRepeatingChar(String str)
         *
         * TODO:
         * - Use a data structure to track character counts.
         * - Iterate through the string to find the first character with a count of one.
         * - Return the character or a special value if all characters repeat.
         */
        public static char firstNonRepeatingChar (String str1){
            // TODO: Implement logic to find the first non-repeating character in the string.
            return '\0'; // Placeholder return value
        }

        /**
         * Task 20: Check if Two Strings are Anagrams
         *
         * Description:
         * - Determine whether two strings are anagrams (contain the same characters in a different order).
         *
         * Method Signature:
         * - public static boolean areAnagrams(String str1, String str2)
         *
         * TODO:
         * - Remove whitespace and convert both strings to the same case.
         * - Sort the characters of both strings.
         * - Compare the sorted strings for equality.
         * - Return true if they are anagrams, false otherwise.
         */
        public static boolean areAnagrams (String str1, String str2){
            // TODO: Implement logic to check if two strings are anagrams.
            return false; // Placeholder return value
        }
    }


