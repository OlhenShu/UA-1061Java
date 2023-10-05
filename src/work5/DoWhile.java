package work5;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        float[] numbers = new float[2];
        Scanner scan = new Scanner(System.in);
        String Answer;
        do {

            float Sum = 0;
            System.out.println("Enter 2 numbers: ");
            for (int i = 0; i <= 1; i++) {
                numbers[i] = scan.nextFloat();
                Sum += numbers[i];
            }
            System.out.println("Sum: " + Sum);
            System.out.println("Do you wont to continue?(y/n): ");
            Answer = scan.next();

        } while (Answer.equals("y"));
    }
}