package Arrays.Loops.Homework;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);





        String choice;


        do{
            System.out.println("Enter two numbers for calculating: ");
            int num1 = input.nextInt();

            int num2 = input.nextInt();



            int sum = num1 + num2;
            System.out.println("The sum of this two numbers is " + sum);

            input.nextLine();

            System.out.println("Type \"yes\" if you want to perform the operation again: ");
            choice = input.nextLine();

        }while (choice.equalsIgnoreCase("yes"));

        System.out.println("The action is ended");

    }

}
