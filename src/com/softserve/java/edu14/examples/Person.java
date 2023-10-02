package com.softserve.java.edu14.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public record Person(String name, int age) {
}
class Demo{
    public static void main(String[] args) {
        List<Person> peoples = List.of(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("John", 18),
                new Person("Greg", 35)
        );
        List<String> names = peoples.stream()
                .map(Person::name)
                .toList();
        //System.out.println(names);
        List<Person> sortedPeoples = peoples.stream()
                .sorted(Comparator.comparing(Person::name)
                        .thenComparing(Person::age))
                .toList();
        //System.out.println(sortedPeoples);
        Optional<Person> oldestPerson = peoples.stream()
                .reduce((p1, p2) -> p1.age() < p2.age() ? p1 : p2);
        //System.out.println(oldestPerson);
        List<Integer> list = Arrays.asList (1 , 2, 3, 4, 7, 3);
        list.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName()));

    }
}