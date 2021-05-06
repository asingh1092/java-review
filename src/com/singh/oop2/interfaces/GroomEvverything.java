package com.singh.oop2.interfaces;

import com.singh.oop2.inheritance.Canine;
import com.singh.oop2.inheritance.Wolf;

public class GroomEvverything {
    public static void main(String[] args) {
        Canine[] canines = {
                new Wolf(17.01, 3),
                new Poodle("Richie", 9, "Lux Brand", "Rich Brand"),
                new Wolf(16, 5),
                new Poodle("Pixy", 4, "Top Shelf", "Only the Best"),
        };

        for (Canine canine: canines) {
            canine.groom();
        }
    }
}
