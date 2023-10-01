package class14;

import lombok.Getter;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        if (Objects.isNull(firstName) || Objects.isNull(lastName)) {
            throw new IllegalArgumentException("Both first name and last name must be non-null");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Optional<String> findMostPopularName(Stream<Employee> employees) {
        return employees.collect(Collectors.groupingBy(Employee::getFirstName, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}