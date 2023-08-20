package class1.task1;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();
        System.out.println("Enter the third number:");
        double number3 = scanner.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("Average is " + average);
        scanner.close();
    }
}
