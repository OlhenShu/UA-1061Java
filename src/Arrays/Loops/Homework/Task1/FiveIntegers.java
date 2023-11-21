package Arrays.Loops.Homework.Task1;

import java.util.Scanner;

public class FiveIntegers {
    private static final int [] arr = new int[5];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Write five numbers to fill the array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }

        System.out.println("The position of second positive number in the array is " + positionOfSecondPositive(arr));
        System.out.println("The minimum value in the array is " + minimumValue(arr) + " and its position in the array is " + positionOfMinimumValue(arr));
        System.out.println("The product of all entered even numbers is " + productOfEvenNumbers(arr));
    }

    public static int positionOfSecondPositive(int [] array){
        int count = 0;
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                count++;
                if(count == 2){
                    pos = i;
                }
            }
        }
        return pos;
    }

    public static int minimumValue(int [] array){
        int minimum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j : array) {
                minimum = Math.min(minimum, Math.min(array[i], j));
            }
        }
        return minimum;
    }

    public static int positionOfMinimumValue(int [] array){
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == minimumValue(arr)){
                position = i;
            }
        }
        return position;
    }

    public static int productOfEvenNumbers(int [] array){
        int product = 1;
        for (int j : array) {
            if (j % 2 == 0) {
                if (j == 0) {
                    continue;
                }
                product *= j;
            }
        }
        return product;
    }
}
