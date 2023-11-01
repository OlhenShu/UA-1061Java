package Homework1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Phonecalls {

    public static double calculateCostPerCall(double cost, int duration) {
        return (cost / 60) * duration;
    }

    public static String formatCost(double cost) {
        return new DecimalFormat("#0.00").format(cost);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalCost = 0.0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the cost of call " + i + " (per minute): ");
            double cost = input.nextDouble();
            System.out.print("Enter the duration of call " + i + " (in seconds): ");
            int duration = input.nextInt();

            double callCost = calculateCostPerCall(cost, duration);
            totalCost += callCost;

            System.out.println("The cost of call " + i + ": " + formatCost(callCost));
        }

        System.out.println("The total costs: " + formatCost(totalCost));

        input.close();
    }
}
