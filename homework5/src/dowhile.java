import java.util.Scanner;

public class dowhile {
    public static void main(String[] args){
        Scanner sq1 = new Scanner(System.in);
        int num1,num2,sum;
        int d;
        d=0;
        do{
            System.out.print("Input number 1:");
            num1= sq1.nextInt();
            System.out.print("Input number 2:");
            num2= sq1.nextInt();
            sum=num1+num2;
            System.out.println("Sum: "+sum);
            System.out.print("Press 0 for continue, 1 for end");
            d= sq1.nextInt();
        }while(d==0);
    }
}
