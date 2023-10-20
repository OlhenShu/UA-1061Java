package Homework12;

import java.util.Scanner;

public class Div {
    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        if (scanner.hasNextDouble()) {
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number (b): ");
            if (scanner.hasNextDouble()) {
                double num2 = scanner.nextDouble();

                try {
                    double result = div(num1, num2);
                    System.out.println("Result of " + num1 + " / " + num2 + " is: " + result);
                } catch (ArithmeticException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            } else {
                System.err.println("Second input is not a valid number.");
            }
        } else {
            System.err.println("First input is not a valid number.");
        }

        scanner.close();
    }
}

