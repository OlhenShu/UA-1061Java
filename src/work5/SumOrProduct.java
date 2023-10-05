package work5;

import java.util.Scanner;
public class SumOrProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 int numbers: ");

        for (int i = 0; i <= 10; i++) {
            numbers[i] = scan.nextInt();
        }

        int result;

        if (numbers[0] >= 0 && numbers[1] >= 0 && numbers[2] >= 0 && numbers[3] >= 0 && numbers[4] >= 0) {
            result = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        } else {
            result = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
        }

        System.out.println("Result is: " + result);

    }
}
