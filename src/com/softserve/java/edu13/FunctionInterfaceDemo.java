package com.softserve.java.edu13;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.function.*;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        int num1 = 10;
        int num2 = 5;

//        System.out.println(isEven.test(num1));
//        System.out.println(isEven.test(num2));

        Function<Integer, Double> centigradeToFahrenheitInt = x -> Double.valueOf((x * 9 / 5.0) + 32);
//        System.out.println(centigradeToFahrenheitInt.apply(27));

        Function<String, Integer> strInt = Integer::valueOf;
//        System.out.println(strInt.apply("27"));

        //Consumer<String> printStr = str -> System.out.println(str);
        Consumer<String> printStr = System.out::println;
        String[] strings = {"Adam", "Bob", "Charley"};

        for (String str : strings) {
            printStr.accept(str);
        }

        // Supplier<UUID> generateUUID = () -> UUID.randomUUID();
        Supplier<UUID> generateUUID = UUID::randomUUID;
        System.out.println(generateUUID.get());
        System.out.println(generateUUID.get());

        UnaryOperator<Integer> square = x -> x * x;

        int num = 25;
        //    System.out.println(square.apply(num));
//Task 1
        LocalDate date = LocalDate.now();
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("uk", "UA"));
        System.out.println("Today is " + dayOfWeek);
//Task 2
        LocalDate firstDayOfMonth = LocalDate.now().withDayOfMonth(1);
        TemporalAdjuster firstMonday = TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY);
        LocalDate firstDayMonday = firstDayOfMonth.with(firstMonday);

        System.out.println(firstDayMonday);
//        System.out.println(date);
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

        var zone = ZoneId.of("Europe/Kyiv");
        System.out.println(zone.getRules());
        var zones = ZoneId.getAvailableZoneIds();
        //   zones.forEach(System.out::println);
        //  System.out.println(zones.size());
    }
}

class Task3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");

        strings.sort(String::compareTo);

        System.out.println("Sorted strings: " + strings);
    }
}

class Task4 {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int count = count(numbers, x -> x % 3 == 0);
        System.out.println(count);
    }

    public static int count(Integer[] array, Predicate<Integer> condition) {
        int count = 0;

        for (Integer num : array) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }
}

