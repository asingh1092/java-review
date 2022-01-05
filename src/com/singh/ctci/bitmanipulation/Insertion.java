package com.singh.ctci.bitmanipulation;

public class Insertion {

    /*
     N and M = two 32-bit numbers
     i and j = two bit positions
     Write a method to insert M into N such that M starts at bit j and ends at bit i.

     Assume that bits j through i have enough space to fit all of M.
      i.e if M = 10011, you can assume that there are at least 5 bits between j and i.
          you would not have j = 3 and i =2 because M could not fully fit between bit 3 and bit 2

     Example:
          Input: N = 100 0000 0000, M = 10 011, i = 2 , j = 6
          Output N = 100 0100 1100

          100 0000 0000
               j    i
               100 11

          100 0100 1100
     */

    public static int bitInsert(int n, int m, int i, int j) {
        int MAX_INT_POSITION = 32;
        int MIN_INT_POSITION = 0;

        if ((j < i) || (j >= MAX_INT_POSITION) | (i < MIN_INT_POSITION)) {
            return 0;
        }

        m <<= i;
        return n + m;
    }

}
