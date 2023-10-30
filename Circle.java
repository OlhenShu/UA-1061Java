import java.util.Scanner;

public class Circle {

    public static double calculatePerimeter(double a){

        return 2 * Math.PI * a;
    }
    public static double calculateArea(double a){
        return  Math.PI * a*a;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        if(radius<=0){
            System.out.println("The radius couldn't be Zero or less than Zero");
        }
        else{
            System.out.println("The perimeter of circle: " + calculatePerimeter(radius));
            System.out.println("The area of circle: " + calculateArea(radius));

        }
        input.close();

    }
}
