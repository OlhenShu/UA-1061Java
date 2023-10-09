package com.softserve.java.edu03.practical;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        double num1 = getNumber("Enter first number: ");
        double num2 = getNumber("Enter second number: ");

        System.out.println( getTotal(num1, num2));
        System.out.println( getAverage(num1, num2));
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {

        return (num1 + num2) / 2.0;
    }

    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println(prompt);
        }
        return sc.nextDouble();

    }
}
