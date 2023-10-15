package task1;
public class test extends person {
    private String activity;

    public test(FullName fullName, int age, String activity) {
        super(fullName, age);
        this.activity = activity;
    }

    @Override
    public String activity() {
        return this.activity;
    }
}