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

    public static void dutchFlagPartition_best(List<Integer> A, int index) {
        /*
        Go through list in one pass and have 4 groups: bottom, middle, top, and unclassified
            - Bottom: A.subList(0, smaller) = values less than pivot
            - Middle: A.sublist(smaller, equal) = values that are the pivot
            - Unclassified: A.sublist(equal, larger) = unclassified
            - Top: A.subList(larger, A.size()) = values larger than the pivot
         */
        int pivot = A.get(index); int smaller = 0; int equal = 0; int larger = A.size();
        System.out.println("Pivot: " + pivot + "\nBefore: " + A);
        while (equal < larger) {
            if (A.get(equal) < pivot) {
                Collections.swap(A, equal++, smaller++);
            }
            else if (A.get(equal) == pivot) {
                ++equal;
            }
            else { // A.get(equal) > pivot
                Collections.swap(A, equal, --larger);
            }
        }
        System.out.println("Afterwards: " + A);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            aList.add(rand.nextInt(15));
        }
        dutchFlagPartitionO_n_space(aList, rand.nextInt(10));
        List<Integer> bList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bList.add(rand.nextInt(15));
        }
        dutchFlagPartition_best(bList, rand.nextInt(10));

    }
}

