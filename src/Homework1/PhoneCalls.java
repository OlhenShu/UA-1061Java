package Homework1;

import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost per minute for the first call (c1): ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter the duration of the first call in minutes (t1): ");
        double t1 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for the second call (c2): ");
        double c2 = scanner.nextDouble();
        System.out.print("Enter the duration of the second call in minutes (t2): ");
        double t2 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for the third call (c3): ");
        double c3 = scanner.nextDouble();
        System.out.print("Enter the duration of the third call in minutes (t3): ");
        double t3 = scanner.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double totalCost = cost1 + cost2 + cost3;

        System.out.println("Cost of the first call: " + cost1);
        System.out.println("Cost of the second call: " + cost2);
        System.out.println("Cost of the third call: " + cost3);
        System.out.println("Total cost of all calls: " + totalCost);


        scanner.close();


    }
}

