package edu05.hw1;

import edu05.InputData;

public class Search {
    public static void main(String[] args) {
        int countNumbers = 5;
        int[] numbers = InputData.getNumbers(
                "Enter " + countNumbers + " integer numbers.",
                countNumbers
        );

        int position = getPositivePosition(numbers, 2);
        int[] min = getMin(numbers);
        int product = getEvenProduct(numbers);

        System.out.println("Position of second positive number: " + position);
        System.out.println("Minimum value: " + min[1] + " Position in the array: " + min[0]);
        System.out.println("Product of all entered even numbers (exclude 0): " + product);
    }

    protected static int getPositivePosition(int[] numbers, int number) {
        int inc = 0;
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                inc++;
                if (inc == number) {
                    position = i + 1;
                    break;
                }
            }
        }
        return position;
    }

    protected static int[] getMin(int[] numbers) {
        // first - position, second - min value
        int[] result = {1, numbers[0]};

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < result[1]) {
                result[0] = i + 1;
                result[1] = numbers[i];
            }
        }

        return result;
    }

    protected static int getEvenProduct(int[] numbers) {
        int result = 0;
        for (int i = 1; i < numbers.length; i += 2) {
            if (numbers[i] != 0) {
                result = result == 0 ? numbers[i] : result * numbers[i];
            }
        }
        return result;
    }
}
