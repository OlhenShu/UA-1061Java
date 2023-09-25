package com.softserve.java.edu13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public record Person(String name, int age) {
}

class DemoPerson {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Adam", 25),
                new Person("Alice", 23),
                new Person("Bob", 25)
        );
        //1
//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.name().compareTo(p2.name());
//            }
//        };
        //2
        // Comparator<Person> comparator = (p1, p2) -> p1.name().compareTo(p2.name());
//3
        Comparator<Person> comparator = Comparator.comparing(Person::name);

        personList.sort(comparator);
        System.out.println(personList);
    }
}