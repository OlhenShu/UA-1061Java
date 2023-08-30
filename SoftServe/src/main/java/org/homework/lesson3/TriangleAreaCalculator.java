package org.homework.lesson3;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side1:");
        double side1 = scanner.nextDouble();

        System.out.print("Input Side2:");
        double side2 = scanner.nextDouble();

        System.out.print("Input Side3:");
        double side3 = scanner.nextDouble();

        double halfPerimeter = (side1 + side2 + side3)/2;
        double area = Math.sqrt(halfPerimeter *
                                    (halfPerimeter - side1) *
                                    (halfPerimeter - side2) *
                                    (halfPerimeter - side3)
        );

        System.out.println("Area:"+area);

        scanner.close();

    }
}
