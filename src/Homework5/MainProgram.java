import Homework5.MonthsNumber;
import Homework5.TenNumbers;
import Homework5.Positions;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an action: ");
        System.out.println("1 - Find out the number of days in a month");
        System.out.println("2 - Find the sum of  the first five numbers if they are positive");
        System.out.println("3 - Find out the order of the number in the array");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                MonthsNumber.main(args);
                break;
            case 2:
                TenNumbers.main(args);
                break;
            case 3:
                Positions.main(args);
                break;
            default:
                System.out.println("Wrong choice of action.");
        }

        scanner.close();
    }
}
