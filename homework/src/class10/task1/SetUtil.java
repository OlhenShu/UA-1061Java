package class10.task1;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetUtil {
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        return set1.stream().filter(set2::contains)
                .collect(Collectors.toSet());
    }

    public static <T> Set<T> unite(Set<T> set1, Set<T> set2) {
        return Stream.concat(set1.stream(), set2.stream())
                .collect(Collectors.toSet());
    }
}
