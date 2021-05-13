package com.singh.oop2.polymorphism;

public class Student extends Person {
    public boolean isHealthy() {
        //method details
        return false;
    }
    public int currentGPA() {
        //method details
        return -1;
    }

    public static void main(String[] args) {
        Person s;
        s = new Student();
        s.isHealthy();
        s.talk();
    }
}
