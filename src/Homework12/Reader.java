package Homework12;

import java.util.Scanner;

public class Reader {
    public static int readNumber(int start, int end, int numberIndex) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number#" + numberIndex + " between " + start + " and " + end + ": ");

        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
            if (number <= start || number >= end) {
                throw new IllegalArgumentException("Number is out of range.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number.");
        }

        return number;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            try {
                int number = readNumber(start, end, i + 1);

                if (i > 0 && number <= numbers[i - 1]) {
                    System.out.println("Entered number should be greater than the previous one.");
                    i--;
                } else {
                    numbers[i] = number;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }

        System.out.println("Entered numbers in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}