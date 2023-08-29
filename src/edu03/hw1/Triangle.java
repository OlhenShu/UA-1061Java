package edu03.hw1;

import edu03.Helper;

public class Triangle {
    public static void main(String[] args) {
        int firstSide = Helper.getEnteredIntNumber("Input the first side:");
        int secondSide = Helper.getEnteredIntNumber("Input the second side:");
        int thirdSide = Helper.getEnteredIntNumber("Input the third side:");
        double p;
        double area;

        p = (firstSide + secondSide + thirdSide) / 2.0;
        area = Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));

        System.out.printf("Area of a triangle: %.2f%n", area);
    }
}
