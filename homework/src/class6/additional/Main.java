package class6.additional;

class Main {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();
        desktop.turnOn();
        laptop.turnOn();

        desktop.shutDown();
        desktop.printBrand();
        laptop.printBrand();
        laptop.shutDown();
    }
}
