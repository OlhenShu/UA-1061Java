package edu14.hw1;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String category;
    private Float price;

    public String getCategory() {
        return category;
    }

    public Float getPrice() {
        return price;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    private LocalDate dateOfManufacture;

    public Product(int id, String name, String category, float price, LocalDate dateOfManufacture) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}
