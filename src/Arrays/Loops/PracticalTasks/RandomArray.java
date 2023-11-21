package Arrays.Loops.PracticalTasks;

import java.util.Random;
public class RandomArray {

    public static void main(String[] args) {
        Random rnd = new Random();
        int [] array = new int[10];

        System.out.println("The random array of numbers");
        for(int i = 0; i < 10; i++){
            array[i] = rnd.nextInt(201) - 100;
            System.out.print(array[i] + " ");
        }

        System.out.println("The biggest number in the array is " + getMax(array));
        System.out.println("The sum of positive numbers is " + sumOfPositiveNumbers(array));
        System.out.println("Number of negative numbers in the array " + countOfNegativeNumbers(array));

        if(countOfNegativeNumbers(array) > countOfPositiveNumbers(array)){
            System.out.println("There are more negative values in the array.");
        }
        else {
            System.out.println("There are more positive values in the array.");
        }
    }
    public static int getMax(int [] array){
        int max = 0;
        for (int j : array) {
            max = Math.max(j, max);
        }
        return max;
    }
    public static int sumOfPositiveNumbers(int [] array){
        int sum = 0;
        for (int j : array) {
            if (j > 0) {
                sum += j;
            }
        }
        return sum;
    }
    public static int countOfNegativeNumbers(int [] array){
        int count = 0;
        for (int l : array){
            if( l < 0){
                count++;
            }
        }
        return count;
    }
    public static int countOfPositiveNumbers(int [] array){
        int count = 0;
        for (int m : array){
            if( m > 0){
                count++;
            }
        }
        return count;
    }
}
