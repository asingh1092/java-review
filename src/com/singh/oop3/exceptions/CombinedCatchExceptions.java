package com.singh.oop3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CombinedCatchExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        try {
            int fahrenheit = input.nextInt();
            double celsius = (5.0/9) * (fahrenheit - 32);
            System.out.printf("Fahrenheit: %d\n", fahrenheit);
            System.out.printf("Celsius:    %.1f\n", celsius);
            double x = 1331/fahrenheit;
        }
        catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Sorry, that wasn't a valid value.");
            System.out.println("Please re-run the program again.");
            System.out.println("However, enter a non-zero integer.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
