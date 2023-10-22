package Homework13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a date in the format MM.dd.yy: ");
            String input = scanner.nextLine();

            if (isValidDateFormat(input)) {
                System.out.println("Valid date format: " + input);
                break;
            } else {
                System.out.println("Invalid date format. Please use the format MM.dd.yy (e.g., 01.12.23).");
            }
        }

        scanner.close();
    }

    public static boolean isValidDateFormat(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateStr);
            return date != null;
        } catch (ParseException e) {
            return false;
        }
    }
}
