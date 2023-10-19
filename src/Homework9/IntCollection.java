package Homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myCollection = new ArrayList<>();

        System.out.println("Enter 10 integers, one at a time:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            int number = scanner.nextInt();
            myCollection.add(number);
        }

        // Find the index of the maximum and minimum elements in the list
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));

        // Swap the maximum and minimum elements in the list
        Collections.swap(myCollection, maxIndex, minIndex);

        // Insert a random three-digit number before the first negative element
        int randomThreeDigitNumber = (int) (Math.random() * (900) + 100);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomThreeDigitNumber);
                break;
            }
        }

        // Insert a zero between all neighboring elements with different signs
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i - 1) * myCollection.get(i) < 0) {
                myCollection.add(i, 0);
                i++;
            }
        }

        // Copy the first k elements to list1 in direct order and the rest to list2 in reverse order
        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        // Remove the last even element (if exists) from myCollection
        int lastIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastIndex = i;
                break;
            }
        }

        if (lastIndex != -1) {
            myCollection.remove(lastIndex);
        } else {
            System.out.println("There is no even element in the list.");
        }

        // Remove the element following the first minimum element (if applicable)
        if (minIndex < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        }

        // Print the modified lists
        System.out.println("List after all modifications:");
        System.out.println("myCollection: " + myCollection);
        System.out.println("list1 (First 5 elements in direct order): " + list1);
        System.out.println("list2 (Rest of the elements in reverse order): " + list2);
    }
}