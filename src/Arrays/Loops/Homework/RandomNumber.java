package Arrays.Loops.Homework;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {


    public static void main(String[] args) {
        Random random = new Random();
        int rnd = random.nextInt(101);

        Scanner input = new Scanner(System.in);
        System.out.println("Try to guess the random number from 1 to 100. Your guess is number:");

        int userNumber;

        do{
            userNumber= input.nextInt();
            if(userNumber > rnd){
                System.out.println("Too high,try again.");
            }
            else {
                System.out.println("Too low, try again.");
            }
        }while (userNumber != rnd);

        System.out.println("You guessed what the random number is! Congratulations!!!");
    }
}
