package Homework5;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int[] numbers = new int[2];

            System.out.println("Enter 2 numbers:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            int sumOfTwoNumbers = numbers[0] + numbers[1];

            System.out.println("Sum of two numbers: " + sumOfTwoNumbers);

            while (true) {
                System.out.print("Do you want to perform the operation again? (yes/no): ");
                String response = scanner.next();

                if (response.equalsIgnoreCase("yes")) {
                    break;
                } else if (response.equalsIgnoreCase("no")) {
                    System.out.println("Thank you");
                    return;
                } else {
                    System.out.println("Incorrect value. Please enter 'yes' or 'no'.");
                }
            }
        } while (true);
    }
}