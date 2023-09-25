package class12.task1;

public class ArithmeticUtil {
    public static double divide(double dividend, double divisor) {
        if (divisor == 0.) {
            throw new ArithmeticException("Division by 0 isn't allowed");
        }
        return dividend / divisor;
    }
}
