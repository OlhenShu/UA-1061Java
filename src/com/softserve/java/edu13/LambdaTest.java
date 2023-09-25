package com.softserve.java.edu13;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args) {
        Integer[] numbers = {6, 5, 7, 9, 15, 1, 3, 29, 8};

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o2);
//            }
//        };
        //Comparator<Integer> comparator = (o1, o2) -> o2.compareTo(o1);
        Comparator<Integer> comparator = Integer::compareTo;

        Arrays.sort(numbers,comparator);
        System.out.println(Arrays.toString(numbers));

    }
}
