package edu10.hw1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("a1", "b", "c1", "d1", "e"));
        Set<String> set2 = new HashSet<>(Arrays.asList("a2", "b", "c2", "d2", "e"));
        System.out.println(Operations.union(set1, set2));
        System.out.println(Operations.intersect(set1, set2));
    }
}
