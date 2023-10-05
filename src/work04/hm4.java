package work04;
import java.util.Scanner;
import java.util.Locale;

public class hm4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner in = new Scanner(System.in);

        System.out.print("Input float number: ");
        double number = 0.0;
        if (in.hasNextDouble()) {
            number = in.nextDouble();
        } else {
            System.out.println("Invalid input for float number.");
            in.close();
            return; // Exit the program
        }

        if (number >= -5 && number <=5){
            System.out.println("Your number belong to the range [-5, 5].");
        }
        else {
            System.out.println("Your number DON'T belong to the range [-5, 5].");
        }


    }
}



