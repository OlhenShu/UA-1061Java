package Homework3;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int number3 = scanner.nextInt();

        int smallest = findSmallestNumber(number1, number2, number3);
        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallestNumber(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            return number2;
        } else {
            return number3;
        }
    }
}