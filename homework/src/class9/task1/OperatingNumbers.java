package class9.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OperatingNumbers {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static final Random random = new Random();

    public static void swapMinAndMax(final List<Integer> list) throws IllegalArgumentException {
        if (Objects.isNull(list) || list.isEmpty()) {
            throw new IllegalArgumentException("The list is null or empty");
        } else {
            int currentValue;
            Element min = new Element(0, list.get(0));
            Element max = new Element(0, list.get(0));

            for (int i = 0; i < list.size(); i++) {
                currentValue = list.get(i);
                if (min.value() > currentValue) {
                    min = new Element(i, list.get(i));
                }
                if (max.value() < currentValue) {
                    max = new Element(i, list.get(i));
                }
            }
            Collections.swap(list, min.position(), max.position());
        }
    }

    public static void insertThreeDigitNumberBeforeTheFirstNegative(final List<Integer> list) throws IllegalArgumentException {
        if (Objects.isNull(list)) {
            throw new IllegalArgumentException("The list is null");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, random.nextInt(900) + 100);
                return;
            }
        }
    }

    public static void insertZeroBetweenNegativeAndPositive(final List<Integer> list) throws IllegalArgumentException {
        if (Objects.isNull(list)) {
            throw new IllegalArgumentException("The list is null");
        }
        int leftValue;
        int rightValue;
        for (int i = 0; i < list.size() - 1; i++) {
            leftValue = list.get(i);
            rightValue = list.get(i + 1);
            if (leftValue < 0 && rightValue > 0 || leftValue > 0 && rightValue < 0) {
                list.add(i + 1, 0);
            }
        }
    }


    public static void copyKElementsAndReverseRest(List<Integer> list, List<Integer> list1, List<Integer> list2, int k) throws IllegalArgumentException {
        if (Objects.isNull(list) || k < 0 || k > list.size()) {
            throw new IllegalArgumentException("List is null or k is invalid");
        }
        list1.addAll(list.subList(0, k));

        for (int i = list.size() - 1; i >= k; i--) {
            list2.add(list.get(i));
        }
    }

    public static void removeTheLastEvenNumber(final List<Integer> list) throws IllegalArgumentException {
        if (Objects.isNull(list)) {
            throw new IllegalArgumentException("List is null");
        }
        int currentElement;
        Element lastEvenNumber = null;

        for (int i = 0; i < list.size(); i++) {
            currentElement = list.get(i);
            if (currentElement % 2 == 0) {
                lastEvenNumber = new Element(i, currentElement);
            }
        }
        if (Objects.isNull(lastEvenNumber)) {
            System.out.println("There are not even numbers to remove the last one");
        } else {
            list.remove(lastEvenNumber.position());
        }
    }

    public static void main(String[] args) {
        final List<Integer> myCollection = new LinkedList<>();
        final List<Integer> list1 = new LinkedList<>();
        final List<Integer> list2 = new LinkedList<>();

        System.out.println("You need to fill in 10 integer values:");
        try {
            for (int i = 0; i < 6; i++) {
                System.out.print("Value " + i + " is ");
                myCollection.add(Integer.parseInt(bufferedReader.readLine()));
            }
        } catch (NumberFormatException e) {
            System.out.println("You should have entered only integer values");
        } catch (IOException e) {
            System.out.println("Impossible to work with reader");
        }

        System.out.println("\nBefore: " + myCollection);
        swapMinAndMax(myCollection);
        System.out.println("Swapping the minimum and maximum values: " + myCollection);

        insertThreeDigitNumberBeforeTheFirstNegative(myCollection);
        System.out.println("Inserting a random three-digit number before the first negative element: " + myCollection);

        insertZeroBetweenNegativeAndPositive(myCollection);
        System.out.println("Inserting a zero between all neighboring elements with different signs: " + myCollection);

        copyKElementsAndReverseRest(myCollection, list1, list2, 2);
        System.out.println("Copying the first 2 elements of the myCollection to the list1, in direct order, and the rest " +
                "to the list2 in reverse order: list1 - " + list1 + " and list2 - " + list2);

        System.out.println("\nRemoving the last even element. If there is no such element, displaying a message");
        removeTheLastEvenNumber(myCollection);
        System.out.println("The list is " + myCollection);
    }
}
