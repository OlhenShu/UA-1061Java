package org.homework.lesson5;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int minRange = 1;
        int maxRange = 100;
        int userGuess;


        System.out.println("Welcome to the Number Guessing Game! ");
        System.out.println("I've selected a random number between \" + minRange + \" and \" + maxRange + \". Try to guess it.");

        do {
           System.out.println("Enter your guess:");
            userGuess = scanner.nextInt();

            if (userGuess < minRange) {
                System.out.println("Too low, try again.");
            } else if (userGuess > maxRange) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        } while (userGuess < minRange || userGuess > maxRange);

        scanner.close();


        }
    }



