package edu14.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class App {

    final static Integer countEmployees = 30;

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (var i = 1; i <= countEmployees; i++) {
            employees.add(new Employee(i, getName()));
        }
        Stream<Employee> stream = employees.stream();

        System.out.println(Employee.mostPopularName(stream));
    }

    protected static String getName() {
        String[] names = {"Adam", "Bob", "Nick", "Olivia", "Ava", "Mia", "Henry", "James", "Lucas"};
        int rnd = new Random().nextInt(names.length);

        return names[rnd];
    }

}
