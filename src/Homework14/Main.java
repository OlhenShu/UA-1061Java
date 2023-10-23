package Homework14;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String category, LocalDate dateOfManufacture, double price) {
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public static List<Product> createProductList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of(2021, 5, 12), 999.99));
        products.add(new Product("Laptop", LocalDate.of(2022, 2, 5), 1299.99));
        products.add(new Product("Tablet", LocalDate.of(2022, 7, 3), 699.99));
        products.add(new Product("TV", LocalDate.of(2021, 11, 22), 899.99));
        products.add(new Product("Mouse", LocalDate.of(2022, 8, 15), 49.99));
        products.add(new Product("Keyboard", LocalDate.of(2022, 8, 15), 59.99));
        products.add(new Product("Laptop", LocalDate.of(2022, 6, 30), 999.99));
        products.add(new Product("Tablet", LocalDate.of(2022, 7, 1), 799.99));
        products.add(new Product("TV", LocalDate.of(2021, 3, 9), 599.99));
        products.add(new Product("Mouse", LocalDate.of(2022, 8, 15), 49.99));
        products.add(new Product("Laptop", LocalDate.of(2022, 4, 18), 799.99));
        products.add(new Product("Phone", LocalDate.of(2021, 8, 17), 899.99));
        products.add(new Product("TV", LocalDate.of(2021, 11, 22), 899.99));
        products.add(new Product("Laptop", LocalDate.of(2022, 1, 7), 999.99));
        products.add(new Product("Tablet", LocalDate.of(2021, 10, 14), 749.99));
        products.add(new Product("Laptop", LocalDate.of(2022, 3, 25), 1299.99));
        products.add(new Product("Phone", LocalDate.of(2022, 5, 7), 1099.99));
        products.add(new Product("TV", LocalDate.of(2022, 4, 30), 599.99));
        products.add(new Product("Phone", LocalDate.of(2020, 8, 10), 4000.0));
        products.add(new Product("Phone", LocalDate.of(2020, 9, 15), 3200.0));
        return products;
    }

    public static List<Product> filterExpensivePhones(List<Product> products) {
        return products.stream()
                .filter(product -> product.getCategory().equals("Phone")
                        && product.getPrice() > 3000
                        && product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCounts.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = Product.createProductList();
        List<Product> expensivePhones = Product.filterExpensivePhones(products);
        System.out.println("Expensive Phones:");
        expensivePhones.forEach(product -> System.out.println(
                "Category: " + product.getCategory() +
                        ", Price: " + product.getPrice() +
                        ", Date of Manufacture: " + product.getDateOfManufacture())
        );

        Stream<Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam"),
                new Employee("Borys")
        );

        Optional<String> mostPopularName = Product.mostPopularName(employees);
        mostPopularName.ifPresent(name -> System.out.println("Most Popular Name: " + name));
    }
}
