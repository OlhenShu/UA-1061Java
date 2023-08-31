package class5.task1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("Enter the number of the month: ");
//        try {
//            int month = scanner.nextInt();
//            System.out.print("Enter the year: ");
//            int year = scanner.nextInt();
//            System.out.println("The month has " + DateUtil.findDayInMonth(month, year));
//        } catch (InputMismatchException e) {
//            System.out.println("Format of number is incorrect");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println();
//        }

        int[] array = {1, 0, 7, -2, 4, 6};
        System.out.println("The array is "+ Arrays.toString(array) + "\n");
        try {
            System.out.println("Minimum value is " + MathUtil.findMinimumValueAndItsPosition(array));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("The product of even numbers is " + MathUtil.findProductOfEvenNumbers(array));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("The position of the second positive value is " + MathUtil.findPositionOfTheSecondPositive(array));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println();
        }

        int[] tenthValueArray = {1, 1, 5, 2, -10, 5, -3, 2, -1, -2};
        System.out.println("The array is "+ Arrays.toString(tenthValueArray));
        try {
            System.out.println("Finding sum of the first elements if they all are positive or product of the " +
                    "last ones. The result is " + MathUtil.findSumOrProductOf10LengthArray(tenthValueArray));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
