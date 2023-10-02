package com.softserve.java.edu14.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0,i -> i + 2);
        //stream.limit(40).forEach(System.out::println);

        Stream<Double> randoms = Stream.generate(Math::random);
        randoms.limit(10).forEach(System.out::println);

        List<String> strings = Stream.of("abc", "", "bc", "abcd", "", "jkl").toList();
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .toList();
                      //  .collect(Collectors.toList());
       long count = strings.stream()
                .filter(string -> !string.isEmpty())
                .count();
        System.out.println(count);
       //System.out.println(strings);
       // System.out.println(filtered);
        Optional<Integer> first = Stream.of(1,2, 3,4,5).findFirst();
        System.out.println(first);
        Optional<Integer> any = Stream.of(1, 2, 3, 4, 5).findAny();
        System.out.println(any);

        boolean anyMatch = Stream.of(1, 2, 3, 4, 5).anyMatch(i -> i % 2 == 0);
        System.out.println(anyMatch);
        boolean noneMath = Stream.of(1, 2, 3, 4, 5).noneMatch(i -> i > 1);
        System.out.println(noneMath);
        boolean allMatch = Stream.of(1, 2, 3, 4, 5).allMatch(i -> i < 0);
        System.out.println(allMatch);
        Optional<Integer> min = Stream.of(1, 2, 3, 4, 5).min(Comparator.naturalOrder());
        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5).max(Comparator.naturalOrder());
        System.out.println(min);
        System.out.println(max);

        Integer[] numbers = Stream.of(6, 5, 7, 9, 15, 1, 3, 29, 8).toArray(Integer[]::new);
        System.out.println(Arrays.toString(numbers));
    }
}
