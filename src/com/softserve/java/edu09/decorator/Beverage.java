package com.softserve.java.edu09.decorator;

// Component
public interface Beverage {
    String getDescription();

    double cost();
}

// Concrete Component
class Coffee implements Beverage {
    public String getDescription() {
        return "Coffee";
    }

    public double cost() {
        return 1.99;
    }
}

//Base Decorator
abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}

// Concrete Decorator
class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 0.5;
    }
}

// using
class Demo {
    public static void main(String[] args) {
        Beverage coffeeWithMilk = new MilkDecorator(new Coffee());
        System.out.println(coffeeWithMilk.getDescription() + ": $" + coffeeWithMilk.cost());
    }
}

