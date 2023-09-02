package edu05;

import java.util.Locale;
import java.util.Scanner;

public class InputData {
    static public int getEnteredIntNumber(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Please enter a valid Integer number.");
        }
        return scan.nextInt();
    }

    public static int[] getNumbers(String msg, int count) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter " + i + 1 + " number");
            numbers[i] = scan.nextInt();
        }

        return numbers;
    }

    public static double getEnteredNumber(String msg) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println(msg);
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Please enter a valid floating point number.");
        }
        return scan.nextDouble();
    }

    public static String getEnteredString(String msg) {
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println(msg);
        while ((line = scan.nextLine()).isEmpty()) {
            scan.next();
            System.out.println("Please enter not empty string.");
        }
        return line;
    }
}
