package Homework5;

import java.util.Scanner;

public class TenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sumOfFirstFivePositives = 0;
        int productOfLastFiveNegatives = 1;


        int positiveCount = 0;
        int negativeCount = 0;

// Iterate through each number in the 'numbers' array for analysis.
        for (int number : numbers) {
            if (number > 0) {
                if (positiveCount < 5) {
                    // Add the positive number to the sum of the first five positive numbers.
                    sumOfFirstFivePositives += number;
                }
                positiveCount++;
            } else if (number < 0) {
                // Check if it's negative and process negative numbers.
                productOfLastFiveNegatives *= number;
                negativeCount++;
            }
        }

        if (negativeCount > 0) {
            System.out.println("Product of the last five negative numbers: " + productOfLastFiveNegatives);
        } else {
            System.out.println("Sum of the first five positive numbers: " + sumOfFirstFivePositives);
        }

        scanner.close();
    }
}
