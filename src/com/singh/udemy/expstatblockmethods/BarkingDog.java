package com.singh.udemy.expstatblockmethods;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = barking & (hourOfDay < 8 || hourOfDay > 22);
        if (hourOfDay < 0 || hourOfDay > 23) {
            wakeUp = false;
        }
        return wakeUp;
    }

    public static void main(String[] args) {
        System.out.println("Barking at 1: " + shouldWakeUp(true, 1));
        System.out.println("Not barking at 2: " + shouldWakeUp(false, 2));
        System.out.println("Barking at 8: " + shouldWakeUp(true, 8));
        System.out.println("Barking at -1: " + shouldWakeUp(true, -1));
    }
}
