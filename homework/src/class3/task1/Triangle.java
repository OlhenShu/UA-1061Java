package class3.task1;

import java.util.Collections;
import java.util.List;

public class Triangle {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalArgumentException{
        if (side1 <= 0 || side2 <= 0 | side3 <= 0) {
            throw new IllegalArgumentException("The length of the sides must be greater than zero");
        } else {
            List<Double> numbers = List.of(side1, side2, side3);
            double max = Collections.max(numbers, Double::compareTo);
            double sumOfRemainingValues = numbers.stream()
                    .reduce(0.0, Double::sum) - max;

            if (max >= sumOfRemainingValues) {
                throw new IllegalArgumentException("Triangle with such sides cannot exist");
            }
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() { //Heron's formula
        double semiperimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }
}
