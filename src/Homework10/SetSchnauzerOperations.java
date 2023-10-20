package Homework10;

import java.util.HashSet;
import java.util.Set;

public class SetSchnauzerOperations {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Riesenschnauzer");
        set1.add("Mittelschnauzer");
        set1.add("Zwergschnauzer");

        Set<String> set2 = new HashSet<>();
        set2.add("Mittelschnauzer");
        set2.add("Joynd Schnauzer");
        set2.add("Reinschnauzer");

        // Perform union
        Set<String> unionResult = union(set1, set2);
        System.out.println("Union of set1 and set2: " + unionResult);

        // Perform intersection
        Set<String> intersectResult = intersect(set1, set2);
        System.out.println("Intersection of set1 and set2: " + intersectResult);
    }
}
