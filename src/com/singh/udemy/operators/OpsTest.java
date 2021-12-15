package com.singh.udemy.operators;

public class OpsTest {

    public static void main(String[] args) {
        double val1 = 20.00;
        double val2 = 80.00;

        double result1 = (val1 + val2) * 100.00;
        System.out.println("Step 3 operation: " + result1);

        double result2 = result1 % 40.00;
        System.out.println("Step 4 operation: " + result2);

        boolean result3 = result2 == 0 ? true : false;
        System.out.println("Step 5 operation: " + result3);

        if (!result3) {
            System.out.println("Got some remainder");
        }
    }


}
