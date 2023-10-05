package work5;

import java.util.Scanner;
public class Mounth {
    public static void main(String[] args) {
        int[] DaysInMounth = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a mounth number (1-12): ");
        int MounthNumber = scanner.nextInt();

        if (MounthNumber >= 1 && MounthNumber <= 12) {
            int days = DaysInMounth[MounthNumber];
            System.out.println("Number of days in the selected mounth: " + days);
        } else {
            System.out.println("Invalid mounth number! Please, enter again)");
        }
        scanner.close();
    }

}
