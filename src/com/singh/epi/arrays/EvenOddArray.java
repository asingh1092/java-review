package com.singh.epi.arrays;

import java.util.Collections;
import java.util.List;

public class EvenOddArray {

    /*
    You are given an array of integers and are told to classify them in an output list even, unclassified, and odd.

    e.g. [0, 2, 12, 5, 10, 98] -> [0, 2, 12, 10, 98, 5]
     */

    /* comment for testing*/

    public static void evenOdd(List<Integer> A) {
        int nextEven = 0;
        int nextOdd = A.size() - 1;
        while (nextEven < nextOdd) {
            if (A.get(nextEven) % 2 == 0) {
                nextEven++;
            } else {
                Collections.swap(A, nextEven, nextOdd--);
            }
        }
    }

    public static <T> void swap(T first, T second) {
        T temp = second;
        second = first;
        first = second;
    }
}
