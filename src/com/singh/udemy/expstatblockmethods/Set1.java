package com.singh.udemy.expstatblockmethods;

public class Set1 {

    public static final int ZERO_CONSTANT = 0;

    public static void main(String[] args) {
        checkNumber(5);
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

    }
    public static void checkNumber(int number) {

        if (number > ZERO_CONSTANT) {
            System.out.println("positive");
        } else if (number < ZERO_CONSTANT) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < ZERO_CONSTANT) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
}
