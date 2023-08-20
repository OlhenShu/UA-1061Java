package src;

import java.util.Scanner;

public class CalculatorCostPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cost per minute:");
        double c1 = scanner.nextInt();

        System.out.println("Enter the cost per minute:");
        double c2 = scanner.nextInt();

        System.out.println("Enter the cost per minute:");
        double c3 = scanner.nextInt();

        System.out.println("Enter duration:");
        double t1 = scanner.nextInt();

        System.out.println("Enter duration:");
        double t2 = scanner.nextInt();

        System.out.println("Enter duration:");
        double t3 = scanner.nextInt();


        double totalAmount1 = c1 * t1;
        double totalAmount2 = c2 * t2;
        double totalAmount3 = c3 * t3;
        double sum = totalAmount1 + totalAmount2 + totalAmount3;


        System.out.println("c1 * t1 = " + totalAmount1);
        System.out.println("c2 * t2 = " + totalAmount2);
        System.out.println("c3 * t3 = " + totalAmount3);
        System.out.println("totalAmount1 + totalAmount2 + totalAmount3 = " + sum);

        scanner.close();
    }
}
