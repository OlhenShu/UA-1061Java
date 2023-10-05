package work5;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        int SecondPositivePosition = -1;
        int MinValue = 0;
        int MinValuePosition = -1;
        int evenProduct = 1;

        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i <= 4; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i <= 4; i++) {
            if (numbers[i] > 0 && SecondPositivePosition == -1) {
                SecondPositivePosition = i;
            }

            if (numbers[i] < MinValue) {
                MinValue = i;
                MinValuePosition = i;
            }

            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                evenProduct *= i;
            }


        }
        System.out.println("The second positive position is: " + (SecondPositivePosition + 1));
        System.out.println("Minimum value: " + MinValue + "It's position in the array: " + MinValuePosition + 1);
        System.out.println("Even product: " + evenProduct);
    }
}
