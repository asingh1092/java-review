package com.singh.epi;

public class ComputingTheParityOfAWord {

    /* The parity of a binary word is 1 if the number of 1s in the word is odd; otherwise it is 0.
       e.g. the parity of 1011 is 1.
       e.g. the parity of 100010000 is 0.

       x % 2 == 0 -> even -> return 0
       x % 2 != 0 -> odd -> return 1

       1. take input number and AND it to 1
       2. then right shift by 1
       3. do this until input number is 0

     */

    public static short computeParity(long input) {
        short countBits = 0;
        while (input != 0) {
            countBits += (input & 1);
            input >>>= 1;
        }

        System.out.println("Number of times through while loop: " + countBits);
        if (countBits % 2 == 0)
            return 0;
        else
            return 1;
    }

    public static short parity(long input) {
        short result = 0;
        while (input != 0) {
            result ^= (input & 1);
            input >>>= 1;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(computeParity(11));
        System.out.println(computeParity(272));
        System.out.println(computeParity(999999999));
    }
}
