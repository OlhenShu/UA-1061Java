package Homework5;

import java.util.Scanner;

public class Positions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int positiveCount = 0;
        int secondPositivePosition = -1;
        int min = Integer.MAX_VALUE;
        int minPosition = -1;
        long productOfEvenNumbers = 1;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            //Find the position of the second positive number.
            if (numbers[i] > 0) {
                positiveCount++;
                // Check if we have found the second positive number and if secondPositivePosition hasn't been set yet.
                if (positiveCount == 2 && secondPositivePosition == -1) {
                    // Set the secondPositivePosition to the position (+1) of the current element in the array.
                    secondPositivePosition = i + 1;
                }
            }

            // Find the minimum value and its position in the array.
            if (numbers[i] < min) {
                min = numbers[i];
                // Update the min variable with the current element, as it is the new minimum value.
                minPosition = i + 1;
            }

            // Calculate the product of all entered even numbers (excluding 0).
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                productOfEvenNumbers *= numbers[i];
            }
        }


        if (positiveCount >= 2) {
            System.out.println("Position of the second positive number: " + secondPositivePosition);
        } else {
            System.out.println("Less than two positive numbers entered.");
        }


        System.out.println("Minimum value: " + min);
        System.out.println("Position of the minimum number: " + minPosition);


        if (productOfEvenNumbers != 1) {
            System.out.println("Product of all entered even numbers (excluding 0): " + productOfEvenNumbers);
        } else {
            System.out.println("No even numbers (excluding 0) entered.");
        }

        scanner.close();
    }
}