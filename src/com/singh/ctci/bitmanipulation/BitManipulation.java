package com.singh.ctci.bitmanipulation;

public class BitManipulation {

    /*
    Bitwise AND (&) - if both bits are 1, then it's one otherwise 0
                e.g. 0101 & 1100 = 0100
    Bitwise inclusive OR (|) - if either of the bits is 1, then it's 1 otherwise 0
                e.g. 0101 | 1100 = 1101

    Bitwise exclusive XOR (^) - if and only if one of the bits is 1, then it's 1 otherwise 0
                e.g. 0101 ^ 1100 = 1001
    Bitwise right shift (>>) - shift bits to the right by n
                e.g. 0101>>1 = 0010
                e.g. 1100>>2 = 0011
    Bitwise left shift (<<) - shift bits to the left by n
                e.g. 0101<<1 = 1010
                e.g. 1100<<2 = 0000
    Bitwise complement (~) - inverse all 1's and 0's
            1's complement - literally just invert all 1's and 0's. There are two zeros (0000 and 1111)
            2's complement - N = -(N + 1)
                            Step 1: Add 0 to leftmost bit
                            Step 2: invert all 1's and 0's
                            Step 3: Add all bits, but remember leftmost bit is signed

            e.g. 5 = 0101 = 1's complement 1010 -> 10
                          = 2's complement = (+5) 00101 -> 11010 + 1 -> 11011 -> -8 + 0 + 2 + 1  -> -6
     Bitwise By hand:
     1. 0110 + 0010 = 6 + 2 = 8 = 1000
     2. 0011 * 0101 = 3 * 5 = 15 = 1111
     3. 0110 + 0110 = 6 + 6 = 12 = 1100 (equivalent to 0110 * 2 which is left shift by 1: 0110 << 1 = 1100)
     4. 0011 + 0010 = 3 + 2 = 5 = 0101
     5. 0011 * 0011 = 3 * 3 = 9 = 1001
     6. 0100 * 0011 = 4 * 3 = 12 = 1100 (equivalent to 0011 * 4 which is left shift by 2: 0011 << 2 = 1100)
     7. 0110 - 0011 = 5 - 3 = 2 = 0010
     8. 1101 >> 2 = 0011 = 3
     9. 1101 ^ (~1101) = 1101 ^ 0010 = 1111 = 15 (equivalent to a^(~a) which is always a sequence of 1's)
     10. 1000 - 0110 = 8 - 6 = 2 = 0010
     11. 1101 ^ 0101 = 1000 = 8
     12. 1011 & (~0 << 2)  = 1011 & (1111 << 2) = 1011 & 1100 = 1000

     */
}
