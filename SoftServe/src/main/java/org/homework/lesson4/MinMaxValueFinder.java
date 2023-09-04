package org.homework.lesson4;

import java.util.Scanner;

public class MinMaxValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second integer number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter third integer number:");
        int num3 = scanner.nextInt();

        Integer resultMin;

        if (num1 < num2 && num1 < num3) {
            resultMin = num1;
        } else if (num2 < num3) {
            resultMin = num2;
        } else {
            resultMin = num3;
        }
          System.out.println("Minimum Result:" + resultMin);

        Integer resultMax;

        if (num1 > num2 && num1 > num3) {
            resultMax = num1;
        } else if (num2 > num3) {
            resultMax = num2;
        } else {
            resultMax = num3;
        }
        System.out.println("Maximum Result:" + resultMax);

        scanner.close();
    }
}