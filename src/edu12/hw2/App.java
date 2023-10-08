package edu12.hw2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers in the range from 1 to 100. Each subsequent number must be greater than the previous one.");
        try {
            for (var i = 0; i < 10; i++) {
                numbers[i] = readNumber(
                        i == 0 ? 0 : numbers[i - 1],
                        100
                );
            }
            System.out.print(Arrays.toString(numbers));
        } catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }

    }

    protected static int readNumber(int start, int end) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number;

        try {
            number = scan.nextInt();
        } catch (InputMismatchException exception) {
            throw new InputMismatchException("Invalid value entered.");
        }

        if (number > start && number < end) {
            return number;
        } else {
            throw new InputMismatchException("Invalid value entered.");
        }
    }
}
