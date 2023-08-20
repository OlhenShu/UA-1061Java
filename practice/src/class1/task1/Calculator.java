package class1.task1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the first number: ");
        final int first = scanner.nextInt();
        System.out.println("Enter the value of the second number: ");
        final int second = scanner.nextInt();

        int addition = first + second;
        int subtraction = first - second;
        int multiplication = first * second;

        System.out.println("\nHere are several mathematical operations");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (second != 0) {
            double division = (double) first / second;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division cannot be applied though");
        }
        scanner.close();
    }
}
