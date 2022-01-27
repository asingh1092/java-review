package com.singh.epi.arrays;

import java.util.*;

public class DutchFlagPartition {
    /* Suppose you're given an Array A with a pivot index i. Rearrange A such
    *  that values less than i appear first, then i, then values greater than i */

    public static void dutchFlagPartition(List<Integer> A, int index) {
        int pivot = A.get(index);
        int greaterIndex = A.indexOf(pivot) + 1;
        System.out.println("Pivot: " + pivot + "\nBefore: " + A);
        for (int lesserIndex = 0; lesserIndex <= index - 1; lesserIndex++) {
            if (A.get(lesserIndex) > pivot) {
               Collections.swap(A, lesserIndex, greaterIndex);
               greaterIndex++;
               lesserIndex--;
            }
        }
    }

    public static void dutchFlagPartitionO_n_space(List<Integer> A, int index) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        List<Integer> pivots = new ArrayList<>();
        int pivot = A.get(index);
        System.out.println("Pivot: " + pivot + "\nBefore: " + A);
        for (Integer n : A) {
            if (n < pivot) {
                smaller.add(n);
            }
            if (n > pivot) {
                bigger.add(n);
            }
            if (n == pivot) {
                pivots.add(n);
            }
        }
        smaller.addAll(pivots);
        smaller.addAll(bigger);
        A.clear();
        A.addAll(smaller);
        System.out.println("Afterwards: " + A);
        // Space: O(n)
        // Time: O(n)
    }

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            aList.add(rand.nextInt(15));
        }
        dutchFlagPartitionO_n_space(aList, rand.nextInt(10));
    }

}

