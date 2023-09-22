package Homework4;

import java.util.Scanner;

public class ThreeFloat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double number2 = scanner.nextDouble();
        System.out.print("Number 3: ");
        double number3 = scanner.nextDouble();

        if (number1 <= 5 && number1 >= -5) {
            System.out.println("The number does belong to the range[-5, 5]");
        } else {
            System.out.println("The number doesn't belong to the range[-5, 5]");
        }

        if (number2 <= 5 && number2 >= -5) {
            System.out.println("The number does belong to the range[-5, 5]");
        } else {
            System.out.println("The number doesn't belong to the range[-5, 5]");
        }
        if (number3 <= 5 && number3 >= -5) {
            System.out.println("The number does belong to the range[-5, 5]");
        } else {
            System.out.println("The number doesn't belong to the range[-5, 5]");

            scanner.close();


        }

    }
}



