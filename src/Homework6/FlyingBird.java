package Homework6;

public class FlyingBird extends Bird {
    @Override
    public String getBirdInfo() {
        return "Flying Bird: Can fly, Feathers: " + getFeathers() + ", Lay Eggs: " + getLayEggs();
    }

    public FlyingBird() {
        super("feather", 1);
    }

    @Override
    public String getName() {
        return null;
    }

    public FlyingBird(String feathers, int layEggs) {

        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println();
    }
}