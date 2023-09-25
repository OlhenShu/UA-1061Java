package com.softserve.java.edu12;



public class Hierarchy {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10);
    }

    static String foo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
            try {
                if (i == 3) break;
                System.exit(0);
            } finally {
                continue;
            }

        }
        return "";

    }
}
