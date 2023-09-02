package edu05.hw1;

import edu05.InputData;

public class Numbers {
    public static void main(String[] args) {
        int countNumbers = 10;
        int[] numbers = InputData.getNumbers(
                "Enter " + countNumbers + " integer numbers.",
                countNumbers
        );

        if (isNumbersPositive(numbers, 5)){
            System.out.println("Sum = " + getSumm(numbers, 5));
        } else {
            System.out.println("Product: " + getProduct(numbers, 5));
        }
    }

    protected static int getSumm(int[] numbers, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    protected static int getProduct(int[] numbers, int countFrom) {
        int product = 1;
        for (int i = countFrom; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }

    protected static boolean isNumbersPositive(int[] numbers, int count) {
        boolean isPositive = true;
        for (int i = 0; i < count - 1; i++) {
            if (numbers[i] < 0) {
                isPositive = false;
                break;
            }
        }

        return isPositive;
    }
}
