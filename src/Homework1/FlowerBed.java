package Homework1;
import java.util.Scanner;
public class FlowerBed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circular flower bed ");

        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double square = Math.PI * Math.pow(radius, 2);

        System.out.println("The Perimeter of the flowed bed: " + perimeter);
        System.out.println("The Square of the flowed bed: " + square);

        scanner.close();
    }
}

