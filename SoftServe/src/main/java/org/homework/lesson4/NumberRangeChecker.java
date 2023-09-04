package org.homework.lesson4;

import java.util.Scanner;

public class NumberRangeChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first float number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second float number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter third float number:");
        double num3 = scanner.nextDouble();

        System.out.println(num1 > -5 && num1 < 5);
        System.out.println(num2 > -5 && num2 < 5);
        System.out.println(num3 > -5 && num3 < 5);

        scanner.close();
        }


    }

