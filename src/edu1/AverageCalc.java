import java.util.Scanner;

public class AverageCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        double numb1 = scanner.nextDouble();

        System.out.println("Enter second number");
        double numb2 = scanner.nextDouble();

        System.out.println("Enter third number");
        double numb3 = scanner.nextDouble();
        double average = (numb1+numb2+numb3)/3;

        System.out.println("Average is: "+average);
        System.out.printf("%.2f%n", average);

        scanner.close();
    }
}
