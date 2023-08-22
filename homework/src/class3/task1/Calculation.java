package class3.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    private static Triangle getTriangle() throws IllegalArgumentException, InputMismatchException { //used to input data and retrieve a Triangle object
        System.out.print("Input Side 1: ");
        final double side1 = scanner.nextDouble();
        System.out.print("Input Side 2: ");
        final double side2 = scanner.nextDouble();
        System.out.print("Input Side 3: ");
        final double side3 = scanner.nextDouble();

        return new Triangle(side1, side2, side3);
    }

    public static void main(String[] args) {
        try {
            Triangle triangle = getTriangle();
            System.out.println("The area of the triangle is " + triangle.getArea());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } catch (InputMismatchException exception) {
            System.out.println("The type of values has to be double");
        }
    }
}
