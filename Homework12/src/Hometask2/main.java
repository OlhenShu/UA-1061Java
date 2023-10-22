package Hometask2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] numb = new int[10];

        System.out.println("Enter 10 numbers (from 1 to 100). Each subsequent number must be greater than the previous one.");
        try {
            for (var i = 0; i < 10; i++) {
                numb[i] = readNumb(
                        i == 0 ? 0 : numb[i - 1],
                        100
                );
            }
            System.out.print(Arrays.toString(numb));
        } catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }

    }

    protected static int readNumb(int start, int end) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");
        int number;

        try {
            number = scan.nextInt();
        } catch (InputMismatchException exception) {
            throw new InputMismatchException("Invalid value error.");
        }

        if (number > start && number < end) {
            return number;
        } else {
            throw new InputMismatchException("Invalid value error.");
        }
    }
}
