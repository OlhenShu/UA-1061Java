package work12;
import java.util.Scanner;
public class Double12 {
    public static double div(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero are not allowed!");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number1, number2;

        try {
            System.out.println("Enter first number: ");
            number1 = scan.nextDouble();

            System.out.println("Enter second number: ");
            number2 = scan.nextDouble();

            double res = div(number1, number2);
            System.out.println("Result of division: " + res);
        } catch (ArithmeticException ea){
            System.out.println("Error: " + ea.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error!");
        }

    }


}
