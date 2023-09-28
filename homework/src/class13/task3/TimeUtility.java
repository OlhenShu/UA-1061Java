package class13.task3;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeUtility {
    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            final int year = sc.nextInt();

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } catch (InputMismatchException e) {
            System.out.println("You have just entered the wrong year, which has an incorrect format");
        }
    }
}
