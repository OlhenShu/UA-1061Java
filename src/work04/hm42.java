package work04;
import java.util.Scanner;

public class hm42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rab = 0;
        int bar = 0;

        System.out.println("Enter 1 integer number: ");
        int num1 = in.nextInt();

        System.out.println("Enter 2 integer number: ");
        int num2 = in.nextInt();

        System.out.println("Enter 3 integer number: ");
        int num3 = in.nextInt();

        if (num1 > rab) rab = num1;
        if (num2 > rab) rab = num2;
        if (num3 > rab) rab = num3;

        if (num1 < bar) bar = num1;
        if (num2 < bar) bar = num2;
        if (num3 < bar) bar = num3;

        System.out.println("Maximum value: " + rab);
        System.out.println("Minimum value: " + bar);

    }
}
