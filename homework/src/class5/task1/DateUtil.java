package class5.task1;

public class DateUtil {
    private static final int[] daysInMonth= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] daysInMonthInLeapYear= {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int findDayInMonth(int month, int year) throws IllegalArgumentException{
        if(!(month >=1 && month<=12)) {
            throw new IllegalArgumentException("There is not such a month");
        }
        if (year%4==0) { //leap year
            return daysInMonthInLeapYear[--month];
        } else{
            return daysInMonth[--month];
        }
    }

}
