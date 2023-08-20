package class1.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculation {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            double sum = 0;

            System.out.print("The quantity of countries taken part is ");
            int quantityOfCountries = Integer.parseInt(bufferedReader.readLine());
            if (quantityOfCountries <= 0) {
                System.out.println("The quantity is supposed to be greater than 0");
                return;
            }

            for (int i = 1; i <= quantityOfCountries; i++) {
                System.out.println("\nCost per minute in country " + i + " is equal:");
                final double costPerMinute = Double.parseDouble(bufferedReader.readLine());
                System.out.println("Duration (in seconds) of the call in country " + i + ":");
                final int duration = Integer.parseInt(bufferedReader.readLine());

                final double callCost = CallCost.findCallCost(costPerMinute, duration);
                System.out.println("Call cost is equal to " + callCost);
                sum += callCost;
            }

            System.out.println("\nThe sum of the foregoing call costs equals to " + sum);
        } catch (IOException e) {
            System.out.println("Something went wrong while reading");
        }
    }
}
