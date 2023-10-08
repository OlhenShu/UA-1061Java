package edu12.hw1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println(div(getNumber("Enter first number"), getNumber("Enter second number")));
        } catch (ArithmeticException|InputMismatchException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("An unexpected error has occurred.");
            exception.printStackTrace();
        }
    }

    protected static double div(double firstNumber, double secondNumber) {
        if (secondNumber == 0.0) {
            throw new ArithmeticException("Division by 0 is not allowed.");
        }
        return firstNumber / secondNumber;
    }

    protected static double getNumber(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        double firstNumber = 0;
        try {
            firstNumber = scan.nextDouble();
        } catch (InputMismatchException exception) {
            throw new InputMismatchException("Invalid value entered.");
        }

        return firstNumber;
    }
}
