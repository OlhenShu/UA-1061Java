package class1.task1;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius value in order to calculate the circumference and area: ");
            final double radius = scanner.nextDouble();

            try {
                Circle circle = new Circle(radius);
                System.out.println("The circumference is " + circle.findCircumference());
                System.out.println("The area is " + circle.findArea());
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}