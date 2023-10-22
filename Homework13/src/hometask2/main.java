package hometask2;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class main {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("mm.dd.yy", Locale.US);
        DateValidator validator = new DateValidator(dateFormatter);

        String date1 = "01.01.1991";
        String date2 = "01.20.09";

        System.out.println(date1 + " - " + validator.isValid(date1)); // false
        System.out.println(date2 + " - " + validator.isValid(date2)); // true
    }
}
