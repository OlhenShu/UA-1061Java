package class5.task1;

public class MathUtil {
    public static int findProductOfEvenNumbers(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array length is 0. It cannot be!");
        }
        int product = 1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                count += 1;
                product *= array[i];
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("It is impossible to calculate the product of even numbers");
        }
        return product;
    }

    public static ArrayValue findMinimumValueAndItsPosition(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array length is 0. It cannot be!");
        }
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                index = i;
                min = array[i];
            }
        }
        return new ArrayValue(index, min);
    }

    public static int findPositionOfTheSecondPositive(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array length is 0. It cannot be!");
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count += 1;
                if (count == 2) {
                    return i;
                }
            }
        }
        throw new IllegalArgumentException("Not found the second positive value");
    }

    public static int findSumOrProductOf10LengthArray(int[] array) {
        if (array.length != 10) {
            throw new IllegalArgumentException("Array length has to be 10");
        }
        int sum = 0;
        boolean isPositive = true;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                sum+=array[i];
            }else {
                isPositive = false;
                break;
            }
        }
        if (isPositive) {
            return sum;
        }

        int product = 1;
        for (int i=5; i< 10; i++) {
            product*=array[i];
        }
        return product;
    }

}
