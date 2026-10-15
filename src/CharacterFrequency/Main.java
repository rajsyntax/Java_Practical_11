package CharacterFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User se complete String input le rahe hain.
        // nextLine() spaces ke saath poori line read karta hai.
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Character ko key aur uski frequency ko value ke roop mein store karenge.
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // String ke har character ko check kar rahe hain.
        for (char ch : input.toCharArray()) {

            // Character pehle se Map mein hai to uski frequency increase hogi.
            // Agar character nahi hai to getOrDefault() 0 return karega.
            frequencyMap.put(
                    ch,
                    frequencyMap.getOrDefault(ch, 0) + 1
            );
        }

        System.out.println("\nCharacter Frequencies:");

        // HashMap ke har character aur uski frequency ko display kar rahe hain.
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

            System.out.println(
                    "'" + entry.getKey() + "' = " + entry.getValue()
            );
        }

        scanner.close();
    }
}