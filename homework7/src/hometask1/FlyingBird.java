package hometask1;
public class FlyingBird extends Bird{
    public FlyingBird(String name, String feathers, int layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public String fly() {
        return "Can fly";
    }
}
