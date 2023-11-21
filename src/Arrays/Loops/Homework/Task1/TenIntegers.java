package Arrays.Loops.Homework.Task1;

import java.util.Scanner;

public class TenIntegers {
    private static final int [] arr = new int[10];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }


        if(sumOfFirstFive(arr) != 0){
            System.out.println("The sum of the first five elements " + sumOfFirstFive(arr));
        }
        else{
            System.out.println("Some of the first five elements is not positive");
        }
        if(sumOfLastFive(arr) != 0){
            System.out.println("The sum of the first five elements " + sumOfLastFive(arr));
        }
        else{
            System.out.println("Some of the last five elements is not negative");
        }
    }

    public static int sumOfFirstFive(int [] array){
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if(array[i] >= 0){
                sum += array[i];
            }
            else {
                sum = 0;
                break;
            }
        }
        return sum;
    }

    public static int sumOfLastFive(int [] array){
        int sum = 0;
        for (int i = 5; i < array.length; i++) {
            if(array[i] < 0){
                sum += array[i];
            }
            else {
                sum = 0;
                break;
            }
        }
        return sum;
    }
}
