package work14;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployersEx {

    public static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        Optional<Map.Entry<String, Long>> mostPopularEntry = nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        return mostPopularEntry.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("Jack"),
                new Employee("Andrii"),
                new Employee("Mike"),
                new Employee("Jeff")
        );
        Optional<String> mostPopularName = mostPopularName(employeeList.stream());
        System.out.println("Most Popular Name: " + mostPopularName.orElse("No names found"));
    }
}

