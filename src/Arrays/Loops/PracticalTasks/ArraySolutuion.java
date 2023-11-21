package Arrays.Loops.PracticalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySolutuion {
    public static void main(String[] args) {
        String [] names = {"Andruskiy", "Kornenko","Scherba","Sorokolit","Bunko","Bilous"};
        Arrays.sort(names);
        for (String name : names) System.out.println(name);


        int [] notes = {10, 8, 2, 4, 7 };
        int sum = 0;
        for(int i: notes){
            sum += i;
        }
        System.out.println(sum/2);

        Scanner input = new Scanner(System.in);
        int index = Arrays.binarySearch(notes, input.nextInt());
        if(index >= 0){
            System.out.println("The given number is in the " + index + " position of array");
        }
        else {
            System.out.println("The specified number is not in one of the array positions");
        }

    }


}
