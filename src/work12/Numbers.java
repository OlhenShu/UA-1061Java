package work12;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Numbers {
    public static int readNumber(int start, int end) throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter any int number between %d and %d: ", start, end);

        int number;

        try {
            number = scan.nextInt();
            if (number < start || number > end) {
                throw new InputMismatchException("Number out of range!");

            }
        } catch (InputMismatchException e) {
            throw e;
        }
        return number;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int first = start - 1;

        try {
            for (int i = 0; i <= 10; i++) {
                int number = readNumber(first + 1, end);
                first = number;
                System.out.println("Accepted number: " + number);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter right number at the correct range!");
        }

    }
}
