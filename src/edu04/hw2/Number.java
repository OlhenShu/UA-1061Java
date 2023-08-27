package edu04.hw2;

import java.util.Scanner;

public class Number {
    static private int max;
    static private int min;

    public Number(int number) {
        max = number;
        min = number;
    }

    public Number setNumber(int number) {
        if (number > max) {
            max = number;
        }
        if (number < min) {
            min = number;
        }
        return this;
    }

    public static int getEnteredNumber(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Please enter a valid Integer number.");
        }
        return scan.nextInt();
    }

    public static void printResult() {
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
