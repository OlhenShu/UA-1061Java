package org.homework.lesson5;

import java.util.Scanner;

public class MonthDaysCalculator {

    public static void main(String[] args) {
        int[][] a = {
                {1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12},
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month number:");
        int month = scanner.nextInt();

        System.out.println("A month number: " + a[0][month - 1]);
        System.out.println("Number of days: " + a[1][month - 1]);

        scanner.close();
    }
}
