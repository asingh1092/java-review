package com.singh.udemy.expstatblockmethods;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean leap = false;
        int even = 0;

        if (year % 4 == even) {
            if (year % 100 == even) {
                if (year % 400 == 0) {
                    leap = true;
                }
            }
        }

        if (year < 1 || year > 9999) {
            leap = false;
        }

        return leap;
    }

    public static void main(String[] args) {

    }

}
