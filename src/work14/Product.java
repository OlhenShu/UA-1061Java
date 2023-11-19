package work14;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    private String manufacture;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacture, String category, LocalDate dateOfManufacture, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacture='" + manufacture + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    public static List<Product> createProductList() {
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            productList.add(new Product("Виробник" + i, "Телефон", LocalDate.now().minusMonths(i * 2),
                    (i + 1) * 1000));
        }

        return productList;
    }



    public static List<Product> getSortedProducts(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> Period.between(product.getDateOfManufacture(), LocalDate.now()).getYears() > 1)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }


    public static Optional<String> mostPopularName(Stream<Product> products) {
        return Optional.empty();
    }


    public static void main(String[] args) {
        List<Product> productList = createProductList();
        List<Product> sortedProducts = getSortedProducts(productList);
        System.out.println("Sorted Products: " + sortedProducts);
        Optional<String> mostPopularName = mostPopularName(productList.stream());
        System.out.println("Most Popular Name: " + mostPopularName.orElse("No most popular name found"));
    }
}

