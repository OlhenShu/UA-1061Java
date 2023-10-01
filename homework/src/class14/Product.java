package class14;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
public class Product {
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String category, LocalDate dateOfManufacture, double price) {
        if (Objects.isNull(category)) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        if (Objects.isNull(dateOfManufacture)) {
            throw new IllegalArgumentException("Date of manufacture cannot be null");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
