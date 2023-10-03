package com.softserve.java.edu14.examples.stream;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class DemoStream {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>(10);
        for (long i = 1; i <= 10; i++) {
            customers.add(new Customer(i, "Customer" + i, (int) i % 2 + 1));
        }
//        System.out.println("Customers: ");
//        customers.forEach(System.out::println);

        List<Product> products = new ArrayList<>(10);
        String[] categories = {"Toys", "Books", "Clothes"};

        for (long i = 1; i <= 10; i++) {
            products.add(
                    new Product(i, "Product" + i, categories[(int) i % 3], i * 12.5));
        }
//        System.out.println("Products: ");
//        products.forEach(System.out::println);

        List<Order> orders = new ArrayList<>(10);
        for (long i = 1; i <= 10; i++) {
            Set<Product> orderProducts = new HashSet<>();
            orderProducts.add(products.get((int) i % products.size()));

            LocalDate orderDate = LocalDate.now().plusDays(i);
            LocalDate deliveryDate = orderDate.plusDays(2);
            OrderStatus status = OrderStatus.values()[(int) i % OrderStatus.values().length];

            orders.add(
                    new Order(i, orderDate, deliveryDate, status, customers.get((int) i % customers.size()), orderProducts)
            );
        }
//        System.out.println("Orders: ");
//        orders.forEach(System.out::println);

        //Find all customers with level 2
        customers.stream()
                .filter(customer -> customer.getLevel() == 2)
                .map(Customer::getName)
                .forEach(System.out::println);
        //Find all Books and print their names
        products.stream()
                .filter(product -> "Books".equalsIgnoreCase(product.getCategory()))
                .map(Product::getName)
                .forEach(System.out::println);

        // Counts of unique categories
        long count = products.stream()
                .map(Product::getCategory)
                .distinct()
                .count();
        System.out.println(count);

        //Find the most expensive product in each category
        products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparing(Product::getPrice))))
                .forEach((category, product) -> System.out.println(category + " " + product));

        orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        //Find the average cost of all ordered products.
        double average = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
        System.out.println(average);
        //For each buyer, display how many orders he made.
        orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer, Collectors.counting()))
                .forEach((customer, counts) -> System.out.println(customer.getName() + ": " + counts));
    }

}
