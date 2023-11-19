package work13;

public class YearCheck {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        int leapYear = 2020;
        int nonLeapYear = 2021;
        System.out.println(leapYear + " is a leap year: " + isLeapYear(leapYear));
        System.out.println(nonLeapYear + " is a leap year: " + isLeapYear(nonLeapYear));
    }
}

