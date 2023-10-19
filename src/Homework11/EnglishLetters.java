import java.util.Scanner;
import java.util.Random;

public class EnglishLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] greetingPhrases = {
                "Hello, %s! Nice to meet you.",
                "Hi there, %s! Welcome.",
                "Greetings, %s! It's a pleasure to have you.",
                "Hey, %s! Glad you're here."
        };

        String firstName = "";
        String lastName = "";

        // Validate first name
        while (true) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine().trim();

            if (firstName.matches("^[a-zA-Z\\s-]+$")) {
                break; // Valid input
            } else {
                System.out.println("Invalid input. First name should contain English letters, spaces, or hyphens only.");
            }
        }

        // Validate last name
        while (true) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine().trim();

            if (lastName.matches("^[a-zA-Z\\s-]+$")) {
                break; // Valid input
            } else {
                System.out.println("Invalid input. Last name should contain English letters, spaces, or hyphens only.");
            }
        }

        // Generate and print a random greeting message
        String greetingMessage = greetingPhrases[random.nextInt(greetingPhrases.length)];
        System.out.printf(greetingMessage, firstName + " " + lastName);

        scanner.close();
    }
}