package com.softserve.java.edu12.practical;

import java.util.InputMismatchException;
import java.util.Scanner;

//TODO
//It is required to create a method named squareRectangle that takes two integer parameters "a" and "b" and calculates the area of a rectangle: int squareRectangle (int a, int b),
//In case the user enters negative values, the method should throw an exception.
// The values of "a" and "b" should be taken as input from the console.
// It is recommended to check the correctness of the squareRectangle() method in the main() method.
// Furthermore, it is necessary to verify that the input values are numeric and handle non-numeric input accordingly.
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        boolean validInput = false;
        while (!validInput){
            System.out.println("Enter value of a: ");
            try{
                a = sc.nextInt();
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Enter valid value of a");
                sc.next();
            }
        }
        validInput = false;
        while (!validInput){
            System.out.println("Enter value of b: ");
            try{
                b = sc.nextInt();
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Enter valid value of b");
                sc.next();
            }
        }
        try{
            int areaRectangle = squareRectangle(a, b);
            System.out.println("Area is : " + areaRectangle);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Values of a and b must be non-negative");
        }
        return a * b;
    }
}
