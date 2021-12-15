package com.singh.udemy.primitives;

public class FloatDouble {

    public static void main(StringReview[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        // Precision refers to the format and amount of space occupied by the type.
        // Single precision occupies 32 bits (width of 32) -> float data type
        // Double precision occupies 64 bits (width of 64) -> double data type
        // Double's are better to use over floats cuz they took less processing
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        float myCastedFloatValue = (float) 5.25; // Casted, but its easier to just do 5.25f
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // Challenge
        FloatDouble floatDouble = new FloatDouble();
        floatDouble.convertPoundsToKilos(1);
        floatDouble.convertPoundsToKilos(1.34);
        floatDouble.convertPoundsToKilos(2);
        floatDouble.convertPoundsToKilos(2.67);
        floatDouble.convertPoundsToKilos(3);
        floatDouble.convertPoundsToKilos(3.8);
        floatDouble.convertPoundsToKilos(4);
        floatDouble.convertPoundsToKilos(4.987);
        floatDouble.convertPoundsToKilos(5);
    }

    public void convertPoundsToKilos(double pounds) {
        double poundToKilo = 0.45359237;
        System.out.println("Converted " + pounds + " pounds to " + pounds * poundToKilo);
    }
}
