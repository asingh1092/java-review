package com.singh.ctci.bitmanipulation;

public class Insertion {

    /*
     N and M = two 32-bit numbers
     i and j = two bit positions
     i = start bit
     j = end bit
     Write a method to insert M into N such that M starts at bit j and ends at bit i.

     Assume that bits j through i have enough space to fit all of M.
      i.e if M = 10011, you can assume that there are at least 5 bits between j and i.
          you would not have j = 3 and i = 2  because M could not fully fit between bit 3 and bit 2

     Example:
          Input: N = 10000000000, M = 10 011, i = 2 , j = 6
          Output N = 10001001100
          10987654321
          10000000000
               j   i
          00001001100
          10001001100
     */

    public static int bitInsert(int n, int m, int i, int j) {
        int ret = 0;
        if (j < i || i < 0 || j >= 32) {
            return ret;
        }

        // make mask to clear i to j in n
        int allOnes = ~0;
        int left = j < 31 ? (allOnes << (j + 1)) : 0;
        int right = ((1 << i) - 1);
        int mask = left | right;

        // clear n
        n = n & mask;

        // right shift m by i
        m <<= i;

        ret = n | m;
        return ret;
    }

}
