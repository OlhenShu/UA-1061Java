package com.softserve.java.edu01.practical;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a");
        int a = scanner.nextInt();

        System.out.println("Enter value of b");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        // double div = (double) a / b;
        if (b != 0) {
            double div1 = (double) a / b;
            System.out.println("Result for division is " + div1);
        } else {
            System.out.println("Div by zero not allowed");
        }

        System.out.println("Result of Sum is " + sum);
        System.out.println("Result of difference is " + difference);
        System.out.println("Result of product is " + product);


        scanner.close();
    }
}
