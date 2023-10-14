package edu14.hw2;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private Integer id;

    private String name;

    public String getName() {
        return name;
    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .stream().findFirst();
    }
}
