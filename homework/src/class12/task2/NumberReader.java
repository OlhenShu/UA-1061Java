package class12.task2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class NumberReader {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * The method reads an integer number and checks if the numbers is in specific range
     *
     * @param start the lower inclusive bound
     * @param end   the upper inclusive bound
     * @return the valid number input by the user
     * @throws NumberFormatException    if the input number format is not integer, therefore it cannot be parsed
     * @throws IllegalArgumentException if the input number is not within the range
     */
    public static int readNumber(int start, int end) {
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= start && number <= end) {
            return number;
        } else {
            throw new IllegalArgumentException("The input number is not included in the range");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        int currentNumber;
        System.out.println("Enter 10 numbers such that 1 < a1 < ... < a10 < 100:");

        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Number " + i + " is ");
                if (i == 0) {
                    array[0] = readNumber(2, 99);
                } else {
                    currentNumber = readNumber(2, 99);
                    if (array[i - 1] < currentNumber) {
                        array[i] = currentNumber;
                    } else {
                        throw new IllegalArgumentException("Wrong number, as it doesn't correspond to conditions");
                    }
                }
            }
            System.out.print("The array is " + Arrays.toString(array));
        } catch (NumberFormatException e) {
            System.out.println("The number format is incorrect");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
