package src;

import java.util.Scanner;

public
class CalculateAverage {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Input second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Input third number:");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3)/3;
        System.out.println("Average is " + average);

        scanner.close();
    }
}

