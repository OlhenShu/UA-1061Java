package task1;
abstract public class person{
    private FullName fullName;
    private int age;
    public person(FullName fullname, int age){
        this.fullName=fullname;
        this.age=age;
    }
    public FullName getFullName() {
        return fullName;
    }

    public int getage() {
        return age;
    }

    public String info() {
        return "First name: " + this.fullName.getfirstName()
                + ", Last name: " + this.fullName.getlastName()
                + ", Age: " + this.getage();
    }

    abstract public String activity();
}
