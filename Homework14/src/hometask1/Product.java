package hometask1;
import java.time.LocalDate;
public class Product {
    private int id;
    private String name,categ;
    private Float price;

    public String getCategory() {
        return categ;
    }

    public Float getPrice() {
        return price;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    private LocalDate dateOfManufacture;

    public Product(int id, String name, String categ, float price, LocalDate dateOfManufacture) {
        this.id = id;
        this.name = name;
        this.categ = categ;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + categ + '\'' +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}
