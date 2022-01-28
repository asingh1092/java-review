package com.singh.epi.arrays;

import java.util.*;

public class IntAsArrayMultiply {

    /*
        * Assumption: every int entry in the array is < 9. i.e can't be 10
        a1 = [2, 5, 7]
        a2 =   [-5, 7]
        ret =   |  17 9 9 |
              | 12  8 5 0 |
              |  14   6   4  9 |
        ret = [-1, 4, 6, 4, 9 ]
      */

    public static List<Integer> intAsArrayMultiple(List<Integer> a1, List<Integer> a2) {
        // Create ret list of 0's of size a1 + a2
        List<Integer> ret = new ArrayList<>(Collections.nCopies(a1.size() + a2.size(), 0));
        System.out.println("Ret: " + ret);

        // Extract out sign
        int sign = a1.get(0) < 0 || a2.get(0) < 0 ? -1 : 1;

        // Edit first position to be positive; we'll worry about sign later
        a1.set(0, Math.abs(a1.get(0)));
        a2.set(0, Math.abs(a1.get(0)));

        for (int i = a1.size() - 1; i >= 0; --i) {
            for (int j = a2.size() - 1; j >= 0; --j) {
                ret.set(i + j + 1, ret.get(i + j + 1) + a1.get(i) * a2.get(j));
                ret.set(i + j, ret.get(i + j) + ret.get(i + j + 1) / 10);
                ret.set(i + j + 1, ret.get(i + j + 1) % 10);
            }
        }
        System.out.println("Ret: " + ret);
        // get rid of leading 0's
        int firstNotZero = 0;
        while (firstNotZero < ret.size() && ret.get(firstNotZero) == 0) {
            ++firstNotZero;
        }
        ret = ret.subList(firstNotZero, ret.size());

        // Check if ret is empty
        if (ret.isEmpty()) {
            ret = List.of(0);
            return ret;
        }

        // Get that sign in there
        ret.set(0, ret.get(0) * sign);
        return ret;
    }


    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(-1, 2);
        List<Integer> array2 = Arrays.asList(2, 6, 4);
        System.out.println("Array1 : " + array1);
        System.out.println("Array2 : " + array2);
        System.out.println("Return: " + intAsArrayMultiple(array1, array2));
    }
}
