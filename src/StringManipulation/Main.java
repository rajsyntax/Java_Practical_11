package StringManipulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User se complete sentence le rahe hain
        // nextLine() spaces ke saath poori line read karta hai.
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nOriginal String: " + input);

        // String ki total length calculate kar rahe hain.
        System.out.println("Length: " + input.length());

        // String ko uppercase mein convert kar rahe hain.
        System.out.println("Uppercase: " + input.toUpperCase());

        // String ko lowercase mein convert kar rahe hain.
        System.out.println("Lowercase: " + input.toLowerCase());

        // StringBuilder ka use karke String reverse kar rahe hain.
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();

        System.out.println("Reverse: " + reverse);

        // Words count kar rahe hain.
        int wordCount = 0;

        if (!input.trim().isEmpty()) {
            wordCount = input.trim().split("\\s+").length;
        }

        System.out.println("Number of words: " + wordCount);

        // Check kar rahe hain ki input mein "Java" present hai ya nahi.
        boolean containsJava = input.contains("Java");

        System.out.println("Contains \"Java\": " + containsJava);

        int vowels = 0;
        int spaces = 0;
        int digits = 0;
        int specialCharacters = 0;

        // Har character ko individually check kar rahe hain.
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);
            char lowerChar = Character.toLowerCase(ch);

            // Vowel check
            if (lowerChar == 'a'
                    || lowerChar == 'e'
                    || lowerChar == 'i'
                    || lowerChar == 'o'
                    || lowerChar == 'u') {

                vowels++;
            }

            // Space check
            else if (ch == ' ') {
                spaces++;
            }

            // Digit check
            else if (Character.isDigit(ch)) {
                digits++;
            }

            // Letter/digit/space ke alawa baaki characters
            // special characters ke roop mein count honge.
            else if (!Character.isLetter(ch)) {
                specialCharacters++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Spaces: " + spaces);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);

        scanner.close();
    }
}