package class5.task2;

import java.util.Scanner;

public class SumOfTwoNumbers {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        int sum;
        String response;

        do {
            System.out.println("Enter two integer numbers!");
            System.out.print("Number 1 is ");
            try{
                firstNum = Integer.parseInt(scanner.nextLine());

                System.out.print("Number 2 is ");
                secondNum = Integer.parseInt(scanner.nextLine());

                sum = firstNum + secondNum;
                System.out.println("The sum of the numbers is " + sum + "\n");
            }catch (NumberFormatException e) {
                System.out.println("Format of numbers is incorrect\n");
            }finally {
                System.out.println("Would you like to continue? Enter 'y' or 'Y' if you desire, or enter everything else if you don't");
                System.out.print("Your response is " );
                response = scanner.nextLine();
                System.out.println();
            }
        }while (response.equalsIgnoreCase("Y"));
    }
}
