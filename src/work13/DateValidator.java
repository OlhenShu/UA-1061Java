package work13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator {

    public static boolean isValidDateFormat(String inputDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
        dateFormat.setLenient(false);

        try {
            Date parsedDate = dateFormat.parse(inputDate);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String validDate = "01.23.22";
        String invalidDate = "13.45.99";

        System.out.println("Is '" + validDate + "' in valid format? " + isValidDateFormat(validDate));
        System.out.println("Is '" + invalidDate + "' in valid format? " + isValidDateFormat(invalidDate));
    }
}

