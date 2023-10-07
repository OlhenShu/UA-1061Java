import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);// you don't need to create a new Scanner object every time you want to read something from the console.
        Scanner sl = new Scanner(System.in);
        Scanner sl1 = new Scanner(System.in);
        System.out.println("First homework task");
        System.out.println("Input radius");
        float numb = sc.nextFloat();
        float pi= 3.14F;// you can use Math.PI
        float perime, area;//don't use declare variables on the same line

        perime=2*pi*numb;
        System.out.println("Perimeter:"+perime);
        area=pi*numb*numb;
        System.out.println("Area:"+area);

        System.out.println("Second homework task");
        String name,adress;//address
        System.out.println("What is your name?");
        name=sl.nextLine();
        System.out.println("Where do you live, "+name);
        adress=sl1.nextLine();
        System.out.println("Hi, "+name+" from "+adress);

        System.out.println("Third task");
        Scanner sm = new Scanner(System.in);
        Scanner sm1 = new Scanner(System.in);
        Scanner sm2 = new Scanner(System.in);

        Scanner sd = new Scanner(System.in);
        Scanner sd1 = new Scanner(System.in);
        Scanner sd2 = new Scanner(System.in);

        double c1,c2,c3,t1,t2,t3;
        System.out.println("Input first number of cpm");
        c1=sm.nextDouble();
        System.out.println("Input second number of cpm");
        c2=sm1.nextDouble();
        System.out.println("Input third number of cpm");
        c3=sm2.nextDouble();
        System.out.println("Input first number of duration");
        t1=sd.nextDouble();
        System.out.println("Input second number of duration");
        t2=sd1.nextDouble();
        System.out.println("Input third number of duration");
        t3=sd2.nextDouble();
        double a,b,c,total;
        a=c1*t1;
        b=c2*t2;
        c=c3*t3;
        total=a+b+c;
        System.out.println("Total: "+total+" First call:"+a+" Second call:"+b+" Third call:"+c);
    }
}
//Don`t forget about conventions and code style.
//https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html
//https://google.github.io/styleguide/javaguide.html
//https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html