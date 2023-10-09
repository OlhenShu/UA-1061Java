package com.softserve.java.edu04.practical;

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        // Створення чотирьох екземплярів класу Product
        Product product1 = new Product("Laptop", 1000.50, 10);
        Product product2 = new Product("Mobile", 500.25, 15);
        Product product3 = new Product("Tablet", 300.75, 5);
        Product product4 = new Product("Headphones", 150.10, 25);

        // Пошук найдорожчого товару
        Product mostExpensive = product1;
        if (product2.price > mostExpensive.price) {
            mostExpensive = product2;
        }
        if (product3.price > mostExpensive.price) {
            mostExpensive = product3;
        }

        if (product4.price > mostExpensive.price) {
            mostExpensive = product4;
        }

        // Пошук товару з найбільшою кількістю
        Product biggestQuantity = product1;
        if (product2.quantity > biggestQuantity.quantity) {
            biggestQuantity = product2;
        }
        if (product3.quantity > biggestQuantity.quantity) {
            biggestQuantity = product3;
        }
        if (product4.quantity > biggestQuantity.quantity) {
            biggestQuantity = product4;
        }

        // Вивід результатів
        System.out.println("Most expensive item: " + mostExpensive.name + " with a quantity of " + mostExpensive.quantity);
        System.out.println("Item with the biggest quantity: " + biggestQuantity.name + " with a quantity of " + biggestQuantity.quantity);
    }
}
/**
 * Пояснення:
 * Створення класу:
 * <p>
 * Створюємо клас Product з полями name, price та quantity і конструктором для їх ініціалізації.
 * Створення екземплярів:
 * <p>
 * В методі main створюємо чотири екземпляра класу Product.
 * Пошук найдорожчого товару:
 * <p>
 * Порівнюємо ціни кожного товару безпосередньо, використовуючи умовні оператори.
 * Пошук товару з найбільшою кількістю:
 * <p>
 * Аналогічно порівнюємо кількість кожного товару безпосередньо.
 * Вивід результатів:
 * <p>
 * Виводимо результати на консоль.
 */