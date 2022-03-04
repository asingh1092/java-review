package com.singh.epi.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnumerateAllPrimes {

    /*
    a Number is prime when it is only divisible by itself or 1 or sqrt(n)
       * 0 and 1 dont count
       * 2, 3, 5, 7, 11, 13, 17, 19, etc are prime
     */

    // solution is O(n * sqrt(n)) = O(n^(3/2) where n is the numbers up until value
    public static List<Integer> generatePrimesBF(int value) {
        if (value < 2) {
            return Collections.emptyList();
        }
        List<Integer> ret = new ArrayList<>();
        // ignore anything negative + 0 & 1
        for (int i = 2; i <= value + 1; i++) {
            for (int j = 2; j <= Math.sqrt(value); j++)
                if (i % j == 0) {
                } else {
                    ret.add(i);
                }
        }
        return ret;
    }

    public static List<Integer> generatePrimes(int value) {
        // if less than 2, return empty list
        if (value < 2) {
            return Collections.emptyList();
        }
        List<Integer> primes = new ArrayList<>();
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(value + 1, true)); // + 1 here is for 0
        // 0 & 1 are not prime
        isPrime.set(0, false);
        isPrime.set(1, false);
        // start p at 2 because of the above
        for (int p = 2; p <= value; p++) {
            if (isPrime.get(p)) {
                primes.add(p);
                // Sieve the multiples of p
                for (int i = p * 2; i <= value; i += p) {
                    isPrime.set(i, false);
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(generatePrimes(10));
        System.out.println(generatePrimes(18));
        System.out.println(generatePrimes(19));
        System.out.println(generatePrimes(33));
        System.out.println(generatePrimes(100));

        System.out.println(generatePrimesBF(10));
        System.out.println(generatePrimesBF(18));
        System.out.println(generatePrimesBF(19));
        System.out.println(generatePrimesBF(33));
        System.out.println(generatePrimesBF(100));
    }
}
