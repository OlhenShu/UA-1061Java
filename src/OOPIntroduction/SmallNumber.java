package OOPIntroduction;

import java.util.Scanner;

public class SmallNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        System.out.print("Input the third number: ");
        int num3 = input.nextInt();

        System.out.print("The smallest number is " + getSmallestNumber(num1, num2, num3));

        input.close();

    }
    //Finds the smallest number among three integers
    public static int getSmallestNumber(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
}
