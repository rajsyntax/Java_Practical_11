package PalindromeChecker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User se complete input le rahe hain.
        // nextLine() use kar rahe hain taaki spaces bhi read ho sakein.
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        /*
         * Extension ke according:
         * 1. Uppercase/lowercase ka difference ignore karna hai.
         * 2. Spaces ignore karne hain.
         * 3. Special characters ignore karne hain.
         *
         * Isliye pehle input ko clean/normalize kar rahe hain.
         */
        String cleaned = original
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        // StringBuilder ka use karke cleaned String ko reverse kar rahe hain.
        String reversed = new StringBuilder(cleaned)
                .reverse()
                .toString();

        // Original aur reversed String ko equals() se compare kar rahe hain.
        boolean isPalindrome = cleaned.equals(reversed);

        // Original input display kar rahe hain.
        System.out.println("Original: " + original);

        // Comparison ke liye cleaned String display kar rahe hain.
        System.out.println("Processed: " + cleaned);

        // Reversed String display kar rahe hain.
        System.out.println("Reverse: " + reversed);

        // Final result display kar rahe hain.
        if (isPalindrome) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }

        scanner.close();
    }
}