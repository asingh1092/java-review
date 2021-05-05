package com.singh.oop2.inheritance;

public class Canine {

    // protected means inherited classes and classes in the same package
    // can access it
    protected double size;

    public Canine(double size) {
        this.size = size;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}
