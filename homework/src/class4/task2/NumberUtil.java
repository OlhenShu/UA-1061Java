package class4.task2;

import java.util.Collections;
import java.util.List;

public class NumberUtil {

    public static <T extends Number & Comparable<T>> T findMin(List<? extends T> numbers) {
        return Collections.min(numbers);
    }

    public static <T extends Number & Comparable<T>> T findMax(List<? extends T> numbers) {
        return Collections.max(numbers);
    }
}
