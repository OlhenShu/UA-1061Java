package edu04;

public class EnhancedSwithcExample {
    public static void main(String[] args) {
        String fruit = "apple";
        int calories = switch (fruit) {
            case "apple" -> {
                int baseCalories = 35;
                int additionalCalories = 15;
                yield baseCalories + additionalCalories;
            }
            case "orange" -> {
                int baseCalories = 55;
                int additionalCalories = 27;
                yield baseCalories + additionalCalories;
            }
            case "banana" -> {
                int baseCalories = 20;
                int additionalCalories = 14;
                yield baseCalories + additionalCalories;
            }
            default -> 0;
        };
        System.out.println("Calories" + calories);
    }
}
