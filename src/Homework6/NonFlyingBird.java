package Homework6;

public class NonFlyingBird extends Bird {
    @Override
    public String getBirdInfo() {
        return "Non-Flying Bird: Can't fly, Feathers: " + getFeathers() + ", Lay Eggs: " + getLayEggs();
    }

    @Override
    public String getName() {
        return null;
    }

    public NonFlyingBird() {
        super("feather", 1);
    }

    public NonFlyingBird(String feathers, int layEggs) {

        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println();
    }
}
