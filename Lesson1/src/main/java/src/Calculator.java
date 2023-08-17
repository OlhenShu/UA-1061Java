package src;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);

        if (b != 0) {
            double quotient = (double) a / b;
            System.out.println("a / b = " + quotient);
        } else {
            System.out.println("Division by zero is undefined.");
        }
        scanner.close();
    }
}
