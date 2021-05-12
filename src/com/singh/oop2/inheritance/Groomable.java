package com.singh.oop2.inheritance;

public interface Groomable {
    public void groom();

    default void pay() {
        System.out.println("Cha-Ching!");
    }
}
