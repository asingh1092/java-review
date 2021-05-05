package com.singh.oop2;

public class Insect {

    // instance variables
    private double weight;
    private int x;
    private int y;

    // static constants/variables
    public static final double DEFAULT_WEIGHT = 0.0;
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    public static final double DIST_WEIGHT_LOSS_FACTOR = 0.0001;
    private static int population = 0;
    private static final String[] FACTS = {
            "The two main groups of insects are winged and wingless.",
            "There are more than 1 million insect species.",
            "Insects are cold-blooded.",
            "Spiders are not considered insects."
    };

    //constructors
    public Insect() {
        this(DEFAULT_WEIGHT);
    }

    public Insect(double weight) {
        this(weight, DEFAULT_X, DEFAULT_Y);
    }

    public Insect(double weight, int x, int y) {
        this.weight = weight;
        this.x = x;
        this.y = y;
        population++;
    }

    // methods ------------------------------------

    // getters
    public double getWeight() {
        return weight;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public static int getPopulation() {
        return population;
    }

    // setters
    public void setWeight(double value) {
        weight = value;
    }

    public void setX(int x) {
        if (isLegalX(x)) {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (isLegalY(y)) {
            this.y = y;
        }
    }

    public static boolean isLegalX(int value) {
        return value >= 0;
    }

    public static boolean isLegalY(int value) {
        return value >= 0;
    }


    // behaviors
    public void eat(double amount) {
        System.out.println("Nibble Nibble");
        weight = weight + amount;
    }

    public void move(int newX, int newY) {
        double distance = calculateDistance(x, y, newX, newY);
        if (distance > 0) {
            x = newX;
            y = newY;
            weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
            System.out.printf("Moved %.2f units\n", distance);
        }
        else {
            System.out.println("Staying put.");
        }
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static String produceRandomFact() {
        int index = (int) (Math.random() * ((FACTS.length - 1) + 1));
        return FACTS[index];
    }

    public static void main(String[] args) {
        // main method + testing area
        System.out.println("Insect Population: " + population);
        Insect bug1 = new Insect(10, 100, 90);
        System.out.println("Insect Population: " + population);
        Insect bug2 = new Insect(9.5, -300, 400);
    }
}
