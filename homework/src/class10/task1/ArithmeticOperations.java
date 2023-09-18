package class10.task1;

import java.util.HashSet;
import java.util.Set;
import static java.lang.System.out;

public class ArithmeticOperations {
    public static void main(String[] args) {
        final Set<String> set1 = new HashSet<>();
        final Set<String> set2 = new HashSet<>();

        set1.add("Apple");
        set1.add("DNA");
        set1.add("Circuit");
        set1.add("Peach");

        set2.add("Peach");
        set2.add("Leg");
        set2.add("Blood");
        set2.add("Cell");

        out.println("Set1 has such elements: " + String.join(", ", set1));
        out.println("Set2 has such elements: " + String.join(", ", set2) + "\n");

        final Set<String> union = SetUtil.unite(set1, set2);
        out.println("Union of them: " + String.join(", ", union));

        final Set<String> intersection = SetUtil.intersect(set1, set2);
        out.println("Intersection of them: " + String.join(", ", intersection));

    }
}
