package Homework5;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Define the range of possible random numbers
        int[] range = {1, 100};
        int rangeDifference = range[1] - range[0];

        // Generate a random number within the specified rang
        int randomWithinRange = random.nextInt(rangeDifference + 1);
        int randomNumber = range[0] + randomWithinRange;
        int userGuess;

        System.out.println("Enter a number between " + range[0] + " and " + range[1] + ". Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            // Compare the user's guess with the random number
            if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number: " + randomNumber);
            }
        } while (userGuess != randomNumber); // Continue until the user's guess matches the random number
    }
}
