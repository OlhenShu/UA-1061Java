package task1;
public class Main {
    public static void main(String[] args) {
        test person = new test(new FullName("JJ", "Abrams"), 55, "Director");
        System.out.println(person.info());
        System.out.println(person.activity());
    }
}