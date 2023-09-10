package org.homework.lesson5;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean yes = true;

        do {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum:" + sum);

            System.out.println("Do you want to perform the operation again?");
            yes = scanner.nextBoolean();

        } while (yes);

        scanner.close();
    }
}
