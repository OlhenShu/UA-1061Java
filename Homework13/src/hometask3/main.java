package hometask3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");
        Integer year = scan.nextInt();

        System.out.println(isLeap(year) ? "Is leap." : "Not a leap.");

    }

    protected static boolean isLeap(int year) {
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
}
