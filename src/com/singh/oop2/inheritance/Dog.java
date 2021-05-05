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

    public String toString() {
        return ("Name: " + name + "; Size: " + size);
    }

    public void groom() {}

    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) o;
        return ((dog.size == size) && (dog.name.equals(name)));
    }

    public static void main(String[] args) {
        Dog spot = new Dog("Spot", 9.6000001);
        spot.bark();

        Dog dog1 = new Dog("Spot", 9.6);
        Dog dog2 = new Dog("Spot", 9.6);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(spot));
    }
}
