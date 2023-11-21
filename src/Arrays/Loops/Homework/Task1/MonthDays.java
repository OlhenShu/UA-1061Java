package Arrays.Loops.Homework.Task1;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of month: ");
        int monthNumber = input.nextInt();
        for (int i = 0; i < monthDays.length; i++) {
            if(monthNumber == i + 1){
                System.out.println("This month has " + monthDays[i] + " calendar days.");
            }
        }
    }

}
