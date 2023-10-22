package hometask4;
import java.time.LocalDate;
import java.time.Month;
public class main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2001, Month.NOVEMBER, 19);
        printDaysOfWeek(localDate);
    }

    protected static void printDaysOfWeek(LocalDate date) {
        System.out.println("Day of current week" + date.getDayOfWeek());

        LocalDate date2 = date.plusMonths(6);
        System.out.println("Day of week (after 6 months)" + date2.getDayOfWeek());

        LocalDate date3 = date.plusYears(1);
        System.out.println("Day of week (after 1 year)" + date3.getDayOfWeek());
    }
}
