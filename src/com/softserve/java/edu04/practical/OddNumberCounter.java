package com.softserve.java.edu04.practical;

import java.util.Scanner;

public class OddNumberCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        int oddCount = 0;

        if (isOdd(num1)) {
            oddCount++;
        }

        if (isOdd(num2)) {
            oddCount++;
        }

        if (isOdd(num3)) {
            oddCount++;
        }

        System.out.println("Number of odd numbers: " + oddCount);
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}

