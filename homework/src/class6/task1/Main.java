package class6.task1;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        final Bird[] birds = new Bird[]{
                new Eagle(EnumSet.of(Colour.BROWN), true),
                new Swallow(EnumSet.of(Colour.BROWN, Colour.WHITE), false),
                new Penguin(EnumSet.of(Colour.GRAY, Colour.WHITE), false),
                new Kiwi(EnumSet.of(Colour.BROWN), true)
        };

        for (Bird i : birds) {
            System.out.println(i);
            i.fly();
            System.out.println();
        }
    }
}
