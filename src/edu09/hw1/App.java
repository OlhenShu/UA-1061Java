package edu09.hw1;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Collection myCollection = new Collection(10, 50 , -50);
        System.out.println("Collection initialization: " + myCollection.getCollection());

        // Swap the maximum and minimum elements in the list.
        myCollection.swapElementsByIndex(myCollection.getMaxValueIndex(), myCollection.getMinValueIndex());

        // Insert a random three-digit number
        myCollection.insertNumberBeforeNegative();

        // Insert a zero
        myCollection.insertZeroBetweenElements();

        // Copy elements
        List<Integer> list1 = myCollection.getFirstElements(5);
        System.out.println(list1);
        List<Integer> list2 = myCollection.getLastElements(5);
        System.out.println(list2);

        //  remove the last even element
        myCollection.removeLastEven();

        // Remove element following the first minimum
        myCollection.removeElementAfterMin();

        System.out.println("Final collection: " +myCollection.getCollection());
    }
}
