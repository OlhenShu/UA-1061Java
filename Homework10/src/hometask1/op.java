package hometask1;

import java.util.HashSet;
import java.util.Set;

public class op {
    public static <T>Set<T> union(Set<T> set1, Set<T> set2) {
        var result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T>Set<T> intersect(Set<T> set1, Set<T> set2) {
        var result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}