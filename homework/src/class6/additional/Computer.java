package class6.additional;

public abstract class Computer {
    private final String brand;

    public Computer() {
        this.brand = "Generic";
    }

    public abstract void turnOn();

    public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    public void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}
