package work01;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {

        float p = 3.14F;
        Scanner scan = new Scanner(System.in);

        System.out.print("Write radius: ");
        float num1 = scan.nextFloat();

        System.out.println("Perimeter of the circle is: " + 2 * p * num1 + ".");
        System.out.println("Area of the circle is: " + p * num1 * num1 + ".");

    }
}
