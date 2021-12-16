package com.singh.udemy.expstatblockmethods;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        list.add(toMilesPerHour(1.5));
        list.add(toMilesPerHour(10.25));
        list.add(toMilesPerHour(-5.6));
        list.add(toMilesPerHour(25.42));
        list.add(toMilesPerHour(75.114));
        System.out.println(list);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

}
