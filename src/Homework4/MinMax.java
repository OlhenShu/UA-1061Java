package Homework4;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max, min;

        System.out.print("Number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double number2 = scanner.nextDouble();
        System.out.print("Number 3: ");
        double number3 = scanner.nextDouble();

        if (number1 >= number2 && number1 >= number3) {
            max = number1;
        } else if ((number2 >= number1 && number2 >= number3)) {
            max = number2;
        } else
            max = number3;

        if (number1 <= number2 && number1 <= number3) {
            min = number1;
        } else if ((number2 <= number1 && number2 <= number3)) {
            min = number2;
        } else {
            min = number3;
        }

        System.out.println("The maximum value(s):");
        if (number1 == max) {
            System.out.println("Number 1: " + number1);
        }
        if (number2 == max) {
            System.out.println("Number 2: " + number2);
        }
        if (number3 == max) {
            System.out.println("Number 3: " + number3);
        }

        System.out.println("The minimum value(s):");
        if (number1 == min) {
            System.out.println("Number 1: " + number1);
        }
        if (number2 == min) {
            System.out.println("Number 2: " + number2);
        }
        if (number3 == min) {
            System.out.println("Number 3: " + number3);
        }


        scanner.close();
    }
}
