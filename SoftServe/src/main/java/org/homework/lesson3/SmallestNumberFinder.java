package org.homework.lesson3;

import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Input the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Input the third number:");
        double num3 = scanner.nextDouble();

        double result = 0;

        if (num1 < num2){
          if (num1 < num3) {
            result = num1;
          } else {
              result = num3;
          }
        } else {
            result = num2;
        }

        System.out.println("The smallest number is:"+result);

        scanner.close();

    }
}
