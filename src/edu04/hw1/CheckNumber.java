package edu04.hw1;

import java.util.Scanner;
import java.util.Locale;

public class CheckNumber {
    public static void main(String[] args) {
        int totalNumbersInRange = 0;

        double number1;
        double number2;
        double number3;

        number1 = getEnteredNumber("Input First number");
        totalNumbersInRange = number1 >= -5 && number1 <= 5 ? ++totalNumbersInRange : totalNumbersInRange;
        number2 = getEnteredNumber("Input Second number");
        totalNumbersInRange = number2 >= -5 && number2 <= 5 ? ++totalNumbersInRange : totalNumbersInRange;
        number3 = getEnteredNumber("Input Last number");
        totalNumbersInRange = number3 >= -5 && number3 <= 5 ? ++totalNumbersInRange : totalNumbersInRange;

        System.out.println("The number of numbers in the range [-5, 5] is: " + totalNumbersInRange);
    }

    protected static double getEnteredNumber(String msg) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println(msg);
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Please enter a valid floating point number.");
        }
        return scan.nextDouble();
    }
}
