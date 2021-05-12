package com.singh.oop2.inheritance;

public interface Groomable {
    public void groom();

    default void pay() {
        System.out.println("Cha-Ching!");
    }

    // static methods cannot be overridden in classes
    static String calculateTip(double price, double percentage) {
        double rawTip = price * (percentage / 100);
        return String.format("$%,.2f", rawTip);
    }
}
