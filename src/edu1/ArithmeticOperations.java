import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a");
        int a = scanner.nextInt();

        System.out.println("Enter value of b");
        int b = scanner.nextInt();

        int sum = a+b;
        int difference = a-b;
        int product = a*b;
            //double div1 = a / b;


        System.out.println("Sum is:"+ sum);
        System.out.println("Dif is:"+ difference);
        System.out.println("Product is:" + product);
        if (b != 0){
            double div1=(double) a / b;
            System.out.println("Div is:" + div1);
        }else{
            System.out.println("Div by zero not allowed");
        }

        scanner.close();
    }
}

