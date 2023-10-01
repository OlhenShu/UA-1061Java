package class14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        final List<Product> productList = Stream.of(
                new Product("Phones", LocalDate.of(2021, 11, 30), 17999),
                new Product("T-Shirts", LocalDate.of(2022, 4, 29), 700),
                new Product("Laptops", LocalDate.of(2022, 7, 28), 12999),
                new Product("Furniture", LocalDate.of(2021, 4, 27), 4499),
                new Product("Running Shoes", LocalDate.of(2020, 9, 26), 2000),
                new Product("Watches", LocalDate.of(2020, 9, 25), 149),
                new Product("Kitchen Appliances", LocalDate.of(2021, 9, 24), 1799),
                new Product("Headphones", LocalDate.of(2022, 9, 23), 799),
                new Product("Jeans", LocalDate.of(2021, 3, 22), 399),
                new Product("Headphones", LocalDate.of(2020, 9, 21), 199),
                new Product("Phones", LocalDate.of(2023, 7, 20), 14990),
                new Product("Watches", LocalDate.of(2022, 9, 19), 599),
                new Product("Books", LocalDate.of(2020, 12, 18), 1290),
                new Product("Shirts", LocalDate.of(2021, 4, 17), 295),
                new Product("Bicycles", LocalDate.of(2020, 4, 16), 250),
                new Product("Phones", LocalDate.of(2020, 3, 12), 50000),
                new Product("Home Decor", LocalDate.of(2023, 8, 14), 500),
                new Product("Cameras", LocalDate.of(2020, 9, 13), 14000),
                new Product("Jackets", LocalDate.of(2020, 1, 12), 3000),
                new Product("Phones", LocalDate.of(2019, 2, 7), 34000)
        ).collect(Collectors.toCollection(ArrayList::new));

        out.println("Here is the list of products sorted by price belonging to the category 'Phones' with a price greater than 3000, and the date of manufacture more than 1 year ago:");
        productList.stream()
                .filter(o -> o.getCategory().equals("Phones")
                        && o.getPrice() > 3000
                        && LocalDate.now().minusYears(1).isAfter(o.getDateOfManufacture()))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(out::println);

        final Stream<Employee> employeeStream = Stream.of(
                new Employee("John", "Doe"),
                new Employee("Alice", "Smith"),
                new Employee("Alice", "Doe"),
                new Employee("John", "Johnson"),
                new Employee("Bob", "Williams"),
                new Employee("Alice", "Johnson"),
                new Employee("Alice", "Johnson"),
                new Employee("John", "Williams")
        );
        final Optional<String> mostPopularName= Employee.findMostPopularName(employeeStream);
        mostPopularName.ifPresent(o -> out.printf("%nThe most popular name is %s", o));
    }
}
