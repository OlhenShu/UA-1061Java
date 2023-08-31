package class5.task4;

import java.util.Random;

public class Randomizer {
    private final static Random random = new Random();
    public static int getNumber(int max) {
        return random.nextInt(max);
    }
}
