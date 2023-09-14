package com.softserve.java.edu09.practical;
//TODO
//In main() method declare a collection myCollection of 10 integers and fill it (from the console or random):
//        Find and save in list newCollection all positions of element more than 5 in the collection. Output newCollection to the console;
//        Remove from collection myCollection elements, which are greater then 20. Output the result
//        Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position – xxx, value of element – xxx”
//        Sort and print collection.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCollection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(50));
        }
        System.out.println("My collection is " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                newCollection.add(myCollection.get(i));
            }
        }//position
        System.out.println("New collection is " + newCollection);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println("My collection after removed" + myCollection);

        int[] position = {2, 8, 5};
        int[] value = {1, -3, -4};

        for (int i = 0; i < position.length; i++) {
            if (position[i] < myCollection.size()) {
                myCollection.add(position[i], value[i]);
                System.out.println("Position " + position[i] + "- value " + value[i]);
            } else {
                System.out.println("Out of bound " + position[i]);
            }
        }
        myCollection.sort(Integer::compareTo);
        System.out.println("My collection" + myCollection);
    }
}
