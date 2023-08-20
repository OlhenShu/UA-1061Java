package src;

import java.util.Scanner;

public class CalculatorPerimetersArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value radius:");
        double  radius = scanner.nextInt();

        double perimeters = 2 * Math.PI * radius;
        double circle = Math.PI * ( radius * radius );


        System.out.println("2 * Math.PI * radius = " + perimeters);
        System.out.println("Math.PI * ( radius * radius ) = " + circle);


        scanner.close();
    }
}
