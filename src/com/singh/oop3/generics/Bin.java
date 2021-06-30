package com.singh.oop3.generics;

import com.singh.oop2.inheritance.Car;
import com.singh.oop2.inheritance.Dog;
import com.singh.oop2.inheritance.Wolf;

public class Bin {

    private Object content;

    public Bin(Object content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Bin test = new Bin("I'm a basic string");
        test.setContent(new Wolf(1, 4));
        test.setContent(new Dog("Spot", 1));
        ((Car) test.getContent()).groom();
        System.out.println(test.getContent());
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
