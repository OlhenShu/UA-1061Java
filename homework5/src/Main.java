//• 5 integer numbers and find:
//o position of second positive number;
//o minimum value and its position in the array.
//o calculate the product of all entered even numbers (exclude 0 from even if entered by
//user).


import java.util.Scanner;

//2. Create a do-while loop that prompts the user to enter two numbers and calculates their
//sum. After displaying the result, the program should ask the user if they want to perform
//the operation again. If the user inputs a positive response, the loop should repeat;
//otherwise, it should terminate.
public class Main {
    public static void main(String[] args) {
        Scanner sq1 = new Scanner(System.in);
        int lq;
        System.out.print("Input number of hometask:");
        lq= sq1.nextInt();
        choose(lq);
    }
    public static void choose(int num1){
        if(num1==1){
            Scanner sq1 = new Scanner(System.in);
            monthcal b=new monthcal();
            int a;
            System.out.print("Input number of month:");
            a=sq1.nextInt();
            b.monthcal(a);
        } else if (num1==2) {
            Scanner sq1 = new Scanner(System.in);
            calprodten b=new calprodten();
            System.out.print("Input 10 numbers:");
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                int d = sq1.nextInt();
                arr[i] = d;
            }
            b.calprodten(arr);
        } else if (num1==3) {
            Scanner sq1 = new Scanner(System.in);
            fiveint b=new fiveint();
            System.out.print("Input 5 numbers:");
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                int d = sq1.nextInt();
                arr[i] = d;
            }
            b.fiveint(arr);
        }
    }
}