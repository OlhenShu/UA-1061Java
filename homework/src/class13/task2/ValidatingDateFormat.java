package class13.task2;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingDateFormat {
    public static boolean isValidDate(final String date) {
        final Pattern pattern = Pattern.compile("^(0[1-9]|1[0-2])\\.(0[1-9]|1\\d|2\\d|3[0-1])\\.\\d{2}$");
        final Matcher matcher = pattern.matcher(date);
        if (!matcher.matches()) {
            return false;
        }

        final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            dateFormat.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the date in MM.dd.yy format: ");
            final String date = scanner.nextLine();

            if (isValidDate(date)) {
                System.out.println("Date format is correct");
            } else {
                System.out.println("Date format is not correct");
            }
        }
    }
}
