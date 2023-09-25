package class12.task1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the dividend: ");
            double dividend = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the divisor: ");
            double divisor = Double.parseDouble(scanner.nextLine());

            double result = ArithmeticUtil.divide(dividend, divisor);
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Format of the number is incorrect");
        }
    }
}
