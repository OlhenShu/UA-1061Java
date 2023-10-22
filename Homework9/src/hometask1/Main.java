package hometask1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection myCollection = new Collection(10, 50 , -50);
        System.out.println("Collection initialization: " + myCollection.getCollection());

        // Swap the maximum and minimum elements in the list.
        myCollection.swapElementsIndex(myCollection.getMaxNumberIndex(), myCollection.getMinNumberIndex());

        // Insert random number
        myCollection.inputNumberBeforeNegative();

        // Insert zero between elem
        myCollection.inputZeroBetweenElements();

        // Copy
        List<Integer> list1 = myCollection.getFirstElement(5);
        System.out.println(list1);
        List<Integer> list2 = myCollection.getLastElement(5);
        System.out.println(list2);

        //  remove the last even element
        myCollection.removeLastEven();

        // Remove element following the first minimum
        myCollection.removeElementAfterMinimum();

        System.out.println("Final collection: " +myCollection.getCollection());
    }
}