package org.practice.lesson3;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        double num1 = getNumber("Enter the first number: ");
        double num2 = getNumber("Enter the second number: ");

        double total = getTotal(num1, num2);
        double average = getAverage(num1, num2);

        System.out.println("The sum of 7 and 2 is: " + total);
        System.out.println("The average of 7 and 2 is: " + average);

    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double number = scanner.nextDouble();
        return number;
    }
}