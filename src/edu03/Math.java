package edu03;
//example of overriding methods
public class Math {
    public int add(int a, int b) {
        return a + b;
    }
        public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.add(5,7));
        System.out.println(math.add(5,7, 12));
        System.out.println(math.add(5,7.5));
    }
}
