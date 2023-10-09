package com.softserve.java.edu04;

public class Test {
    public static void main(String[] args) {
//        int x = 5;
//        System.out.println(x++ + ++x + ++x + x++);
//        System.out.println(x);
//        int t = 5;
//        int s = 4;
//        int v = 7;
//
//        System.out.println((t > s) && (t > v) || (s < v));
//        System.out.println((t > s) || (t > v) && (s > v));
//        System.out.println((t > s || t > v) && (s > v));

//        double mark = 2;
//        if(mark > 3){
//            System.out.println("Passed");
//        }
//        System.out.println("Something other");
//        int a = 57;
//        int b = 24;
//        if (a > 50 | (b = 72) < 50) {
//            System.out.println("Do something...");
//        }
//        System.out.println("Variable 'a' = " + a);
//        System.out.println("Variable 'b' = " + b);
        int t = 5, s = 4;
        String str1 = (t >= ++s) ? "yes" : "no";
        System.out.println(str1);
        int a = 3, b = 2;
        String str2 = a-- == b ? "yes" : "no";
       System.out.println(str2);
    }
}
