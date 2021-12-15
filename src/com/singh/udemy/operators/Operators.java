package com.singh.udemy.operators;

public class Operators {

    public static void main(String[] args) {
        int result  = 1 + 2; // 1 + 2 = 3
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println(result); // 2
        System.out.println(previousResult); // 3

        result = result * 10;
        System.out.println(result); // 20

        result = result / 5;
        System.out.println(result);

        result = result % 3; // the remainder of (4 % 3)
        System.out.println(result); // 1

        // result = result + 1
        result++;
        System.out.println(result);

        // result = result - 1
        result--;
        System.out.println(result);

        // result = result + 2
        result += 2;
        System.out.println(result);

        // result = result * 10
        result *= 10;
        System.out.println(result);

        // result = result / 3
        result /= 3;
        System.out.println(result);

        // result = result - 2
        result -= 2;
        System.out.println(result);

        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;

    }
}
