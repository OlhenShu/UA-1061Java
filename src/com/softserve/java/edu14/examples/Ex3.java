package com.softserve.java.edu14.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 7, 16, 4, 25, 30, 17, 8, 9, 15);
        List<Integer> result = numbers.stream()
            .filter(n -> n % 5 == 0)
            .filter(n -> n > 10)
            .map(n -> n * 2)
            .sorted()
            .limit(2)
            .collect(Collectors.toList());

        System.out.println(result);
        List<String> strings = List.of("abc", "", "bc", "abcd", "", "jkl");
        List<Integer> lengths = strings.stream()
                .map(String::length)
                .toList();
        System.out.println(lengths);
    }
}