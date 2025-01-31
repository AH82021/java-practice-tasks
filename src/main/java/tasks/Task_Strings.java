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
        String name = new String("Woodbridge");
        System.out.println(name);

        String str1 = "coding is my passaint";
        System.out.println(str1.substring(0,6));

        String first = "Andisha";
        String second = "Jeena";
        String third = "Khalida";
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        String st1 = "git gat";
        System.out.println(str1.replace('g', 'k'));
        String greet = "Hello Hamid";
        System.out.println("String: " + greet);
        int length = greet.length();

        System.out.println("Length: " + length);



            }
        }



