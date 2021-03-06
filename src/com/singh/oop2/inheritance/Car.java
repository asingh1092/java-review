package com.singh.oop2.inheritance;

public class Car implements Groomable {
    private String make;
    private String model;
    private int year;
    private int charge; // it's an electric car
    private boolean powered;
    private int speed;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        if (charge > 0) {
            System.out.println("Ding!");
            powered = true;
        }
    }

    public void groom() {
        if (speed == 0) {
            System.out.println("Soap, rinse, wax, and a little tree air freshener.");
        }
    }
}
