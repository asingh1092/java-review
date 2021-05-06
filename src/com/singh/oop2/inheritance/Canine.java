package com.singh.oop2.inheritance;


import com.singh.oop2.interfaces.Groomable;

// abstract class must have at least one abstract method
public abstract class Canine implements Groomable {

    // protected means inherited classes and classes in the same package
    // can access it
    protected double size;

    public Canine(double size) {
        this.size = size;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public abstract void groom();
}
