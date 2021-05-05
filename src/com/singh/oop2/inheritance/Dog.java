package com.singh.oop2.inheritance;

public class Dog extends Canine {

    protected String name;

    public Dog(String name, double size) {
        super(size);
        this.name = name;
    }

    public void fetch() {
        System.out.println("Run\nClinch\nReturn");
    }
}
