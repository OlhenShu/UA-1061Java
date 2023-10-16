package hometask1;
public class NonFlyingBird extends Bird{
    public NonFlyingBird(String name, String feathers, int layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public String fly() {
        return "Can't fly";
    }

}
