package work13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BirthdayCheck {

    public static void BirthdayCheck(LocalDate birthday) {
        System.out.println("Day of the week for the birthday (" + formatLocalDate(birthday) + "): " +
                birthday.getDayOfWeek());

        LocalDate after6Months = birthday.plus(6, ChronoUnit.MONTHS);
        System.out.println("Day of the week after 6 months (" + formatLocalDate(after6Months) + "): " +
                after6Months.getDayOfWeek());

        LocalDate after12Months = birthday.plus(12, ChronoUnit.MONTHS);
        System.out.println("Day of the week after 12 months (" + formatLocalDate(after12Months) + "): " +
                after12Months.getDayOfWeek());
    }

    private static String formatLocalDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM.dd.yyyy"));
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 8, 15);
        BirthdayCheck(birthday);
    }
}

