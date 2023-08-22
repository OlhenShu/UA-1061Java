package class3.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberUtil {
    public static <T extends Number & Comparable<T>> T findMin(T num1, T num2, T num3){
        List<T> listOfNumbers = Arrays.asList(num1, num2, num3);

        return Collections.min(listOfNumbers);
    }
}
