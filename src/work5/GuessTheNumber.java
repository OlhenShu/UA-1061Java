package work5;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int minRange = 0;
        int maxRange = 20;

        int randomNumber = rand.nextInt(maxRange - minRange + 1) + minRange;
        int userGuess;
        int numberOfGuesses = 0;
        System.out.println("Hi! Welcome to the Guess number game!");
        System.out.println("I have chosen the number between " + minRange + " and " + maxRange + ". Try to guess it.");

        do {
            System.out.println("Your guess: ");
            userGuess = scan.nextInt();
            numberOfGuesses++;

            if(userGuess < randomNumber) {
                System.out.println("Too low, try again!");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Congratulations! Winner, winner - chicken dinner! You guessed the number, which i have chosen!");
                System.out.println("It took you " + numberOfGuesses + " guesses!");
            }
        } while (userGuess != randomNumber);
    }
}
