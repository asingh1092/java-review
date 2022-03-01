package com.singh.epi.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnumerateAllPrimes {

    /*
    a Number is prime when it is only divisible by itself or 1
       * 0 and 1 dont count
       * 2, 3, 5, 7, 11, 13, 17, 19, etc are prime
     */

    // solution is O(n) where n is the numbers up until value
    public static List<Integer> primeListTo(int value) {
        if (value < 0 || value == 0 || value == 1) {
            return Collections.emptyList();
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < value + 1; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
            } else {
                ret.add(i);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(primeListTo(10));
        System.out.println(primeListTo(18));
        System.out.println(primeListTo(19));
        System.out.println(primeListTo(33));
        System.out.println(primeListTo(100));

    }
}
