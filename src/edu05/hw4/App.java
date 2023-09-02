package edu05.hw4;

import edu05.InputData;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomIntNumber = rand.nextInt(10);
        int enterNumber = InputData.getEnteredIntNumber("Enter an integer:");
        do {
            if (enterNumber > randomIntNumber) {
                enterNumber = InputData.getEnteredIntNumber("Too high, try again:");
            } else if (enterNumber < randomIntNumber) {
                enterNumber = InputData.getEnteredIntNumber("Too low, try again:");
            }
        } while (enterNumber == randomIntNumber);
        System.out.println("Congratulations. You guessed the number.");
    }
}
