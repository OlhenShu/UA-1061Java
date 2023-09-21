package class11.task2;

public class StringUtil {
    public static String reduceRedundantWhitespaces(final String value) {
        return value.replaceAll(" {2,}", " ");
    }
}
