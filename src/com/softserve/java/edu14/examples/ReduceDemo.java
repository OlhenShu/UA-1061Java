package com.softserve.java.edu14.examples;

import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        int product = Stream.of(1, 2, 3, 4, 5)
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(0, Integer::sum);
        System.out.println(sum);
        String str = Stream.of("a", "b", "c", "d", "e")
                .reduce("", String::concat);
        System.out.println(str);
    }
}
