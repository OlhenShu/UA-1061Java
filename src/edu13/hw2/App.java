package edu13.hw2;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("mm.dd.yy", Locale.US);
        DateValidator validator = new DateValidator(dateFormatter);

        String date1 = "05.15.1983";
        String date2 = "02.31.05";

        System.out.println(date1 + " - " + validator.isValid(date1)); // false
        System.out.println(date2 + " - " + validator.isValid(date2)); // true
    }
}
