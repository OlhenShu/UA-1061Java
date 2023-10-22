package Homework13;

public class LeapYear {
        public static void main(String[] args) {
            int year = 2024; // Change the year you want to check here

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        public static boolean isLeapYear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
    }

