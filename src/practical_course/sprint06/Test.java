package practical_course.sprint06;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2017, 11,26,15,38);
        Period period = Period.ofYears(1).ofMonths(2).ofDays(3);
        time = time.minus(period);
        System.out.println(time);
    }
}
