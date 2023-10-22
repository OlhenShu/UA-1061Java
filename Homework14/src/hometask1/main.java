package hometask1;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
public class main {
    final static int countProducts = 20;
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        for (var i = 1; i <= countProducts; i++) {
            String category = getCategory();
            products.add(new Product(i, "Product " + category + " " + i, category, getPrice(), getDate()));
        }

        products.stream()
                .filter(product -> "Phone".equalsIgnoreCase(product.getCategory()))
                .filter(product -> Period.between(product.getDateOfManufacture(), LocalDate.now()).getYears() >= 1)
                .filter(product -> product.getPrice() > 3000)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(System.out::println);
    }


    protected static String getCategory() {
        String[] categories = {"Phone", "Laptop", "Tablet"};
        int rnd = new Random().nextInt(categories.length);
        return categories[rnd];
    }

    protected static float getPrice() {
        return Math.round(new Random().nextFloat((float) 500.0, (float) 10000.0) * (float) 100.0) / (float) 100.0;
    }

    protected static LocalDate getDate() {
        LocalDate currentDate = LocalDate.now();
        int rnd = new Random().nextInt(1000);

        return currentDate.minusDays(rnd);
    }
}
