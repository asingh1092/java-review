package com.singh.oop3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryBlockExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        try {
            int fahrenheit = input.nextInt();
            double celsius = (5.0/9) * (fahrenheit - 32);
            System.out.printf("Fahrenheit: %d\n", fahrenheit);
            System.out.printf("Celsius:    %.1f\n", celsius);
        } catch (InputMismatchException e) {
            System.out.println("Sorry, that wasn't an int");
            System.out.println("Please re-run the program again.");
        }

    }
}
