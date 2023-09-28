package class13.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Objects;

public class Main {
    public static void printDateInfo(LocalDate date, Locale locale) {
        if (Objects.isNull(date) || Objects.isNull(locale)) {
            System.out.println("Invalid date or locale");
            return;
        }
        System.out.println("The day of the week is " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));

        final DayOfWeek dayOfWeekAfter6Months = date.plus(6, ChronoUnit.MONTHS).getDayOfWeek();
        System.out.println("The day of the week after 6 months is " +
                dayOfWeekAfter6Months.getDisplayName(TextStyle.FULL, locale));

        final DayOfWeek dayOfWeekAfter12Months = date.plusMonths(12).getDayOfWeek();
        System.out.println("The day of the week after 12 months is " +
                dayOfWeekAfter12Months.getDisplayName(TextStyle.FULL, locale));
    }

    public static void main(String[] args) {
        final LocalDate birthday = LocalDate.of(2004, 6, 26);
        Locale locale = new Locale("en", "US");

        printDateInfo(birthday, locale);
    }
}
