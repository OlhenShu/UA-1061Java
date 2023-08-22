package class3.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindingMin {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Input the first number: ");
            final int num1 = scanner.nextInt();
            System.out.print("Input the second number: ");
            final int num2 = scanner.nextInt();
            System.out.print("Input the third number: ");
            final int num3 = scanner.nextInt();

            System.out.println("The smallest number is " + NumberUtil.findMin(num1, num2, num3));
        }catch (InputMismatchException exception) {
            System.out.println("The type of values has to be integer");
        }

    }
}
