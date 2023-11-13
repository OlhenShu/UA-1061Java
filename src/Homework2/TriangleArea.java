package Homework2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Side 1: ");
        double a = input.nextDouble();

        System.out.println("Input Side 2: ");
        double b = input.nextDouble();

        System.out.println("Input Side 3: ");
        double c = input.nextDouble();

        System.out.println("The area of the triangle with sides " + a + ", " + b + ", " + c + " is " + formatArea(getTriangleArea(a,b,c)));

        input.close();

    }
    //This method Calculates the area of a triangle
    public static double getTriangleArea(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    //This method formats a number to the number with two decimal places
    public static String formatArea(double Area) {
        return new DecimalFormat("#0.00").format(Area);
    }
}
