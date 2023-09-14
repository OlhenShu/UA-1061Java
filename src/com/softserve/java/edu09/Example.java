package com.softserve.java.edu09;

import java.time.LocalDate;

public class Example {
    public static void main(String[] args) {
//        Integer i = Integer.valueOf(128);
//        Integer j = 128;
//        System.out.println(i.equals(j));

        Object[] arr = {1, 1.5, LocalDate.now()};
        Number[] numbers = {1, 1.5, (byte) 12};
        for (var el : numbers) {
            System.out.println(el.getClass().getName());
        }

    }


}
