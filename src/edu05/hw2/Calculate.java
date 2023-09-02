package edu05.hw2;

import edu05.InputData;

public class Calculate {

    public static void main(String[] args) {
        boolean isRepeat = true;
        double firstNumber;
        double secondNumber;
        String askUser;
        do {
            firstNumber = InputData.getEnteredNumber("Enter first number");
            secondNumber = InputData.getEnteredNumber("Enter second number");

            System.out.printf("sum: %.2f%n", (firstNumber + secondNumber));

            askUser = InputData.getEnteredString("Do you want to continue adding numbers? (Y - Yes)");

            isRepeat = askUser.toLowerCase().equals("y");
        } while (isRepeat);
    }
}
