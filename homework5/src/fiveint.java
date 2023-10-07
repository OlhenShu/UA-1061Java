public class fiveint {
    public static void fiveint(int arr[]) {
        int positive, min, d;
        min = arr[0];
        positive = 0;
        d = 1;
        for (int i = 0; i < 5; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (arr[i] > 0) {
                positive++;
                if (positive == 2) {
                    System.out.println(i + 1);
                }
            }
            if ((arr[i] % 2 == 0) & (arr[i] != 0)) {
                d *= arr[i];
            }

        }
        System.out.println(min);
        System.out.println(d);
    }
}
