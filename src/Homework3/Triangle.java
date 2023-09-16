package Homework3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side3: ");
        double side3 = scanner.nextDouble();

//Перевірка чи перед нами дійсно трикутник
        if (isTriangleValid(side1, side2, side3)) {
            double area = calculateTriangleArea (side1, side2, side3);
            System.out.println("The area of the triangle: " + area);
        } else {
            System.out.println("Invalid input: These side lengths do not form a valid triangle.");
        }

        scanner.close();
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double perimeter = (a + b + c) / 2.0;
        //Використання формулу Герона задля обчислення площі трикутника
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }
    //Перевірка, чи можна побудувати трикутник з вказаними сторонами.
    public static boolean isTriangleValid(double a, double b, double c) {
        boolean side1Valid = a + b > c;
        boolean side2Valid = a + c > b;
        boolean side3Valid = b + c > a;

        // Повертаємо true, якщо всі три умови виконуються, означаючи, що це трикутник.
        return side1Valid && side2Valid && side3Valid;
    }
}



