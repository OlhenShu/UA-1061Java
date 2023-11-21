package Arrays.Loops.PracticalTasks;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        if(integer != 0){
            BigInteger bigInteger = BigInteger.valueOf(integer);
            boolean probablePrime = bigInteger.isProbablePrime(integer);

            if(probablePrime){
                System.out.println("Number " + integer + " is a prime number");
            }
            else {
                System.out.println("The given number is not a prime number");
            }
        }
        else{
            System.out.println("Zero is not a prime number!");
        }


    }
}
