package work9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lists {

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(199) - 99;
            myCollection.add(randomNumber);
        }

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));

        int temp = myCollection.get(maxIndex);
        myCollection.set(maxIndex, myCollection.get(minIndex));
        myCollection.set(minIndex, temp);

        int negativeIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negativeIndex = i;
                break;
            }
        }

        if (negativeIndex != -1) {
            int negative3numbers = 100 + rand.nextInt(900);
            myCollection.add(negativeIndex, negative3numbers);
        }

        for (int i = 1; i < myCollection.size(); i++) {
            int prev = myCollection.get(i - 1);
            int current = myCollection.get(i);
            if ((prev >= 0 && current < 0) || (prev < 0 && current >= 0)) {
                myCollection.add(i, 0);
                i++;
            }
        }

        int k = 4;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
        }

        if (minIndex != myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        } else {
            System.out.println("The minimum element is the last one. Nothing is removed.");
        }

        System.out.println("myCollection: " + myCollection);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }
}

