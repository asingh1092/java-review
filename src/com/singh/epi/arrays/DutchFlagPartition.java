package com.singh.epi.arrays;

import java.util.Collections;
import java.util.List;

public class DutchFlagPartition {
    /* Suppose you're given an Array A with a pivot index i. Rearrange A such
    *  that values less than i appear first, then i, then values greater than i */

    public static void dutchFlagPartition(List<Integer> A, int index) {
        int pivot = A.get(index);
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) == pivot) {
                continue;
            }
            if (A.get(i) > A.size()) {
                Collections.swap(A, i, index);
            }
        }
    }

}
