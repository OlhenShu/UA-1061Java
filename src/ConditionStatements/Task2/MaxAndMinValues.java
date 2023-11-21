package ConditionStatements.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxAndMinValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int[] numbers = getNumbers(input);
            if (numbers.length == 3) {
                int max = findMax(numbers);
                int min = findMin(numbers);

                System.out.println("The maximum number: " + max);
                System.out.println("The minimum number: " + min);
            } else {
                System.out.println("Please enter exactly three integers.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input is not an integer.");
        }
    }

    private static int[] getNumbers(Scanner input) {
        System.out.println("Enter three integer numbers:");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    private static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            min = Math.min(min, num);
        }
        return min;
    }
}
