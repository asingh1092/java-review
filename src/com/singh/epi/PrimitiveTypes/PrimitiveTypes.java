package com.singh.epi.PrimitiveTypes;

public class PrimitiveTypes {

    /*
    nibble = 4 bits -> 0000
    byte = 8 bits = 1 byte
        -> 256 combinations (2^8)
        -> 00000000 is zero
        -> signed: [-128 to 127] or [-2^7 to 2^7-1]
    short = 16 bits = 2 bytes (a "short word")
        -> 65,536 combinations (2^16)
        -> 00000000 00000000 is zero
        -> signed: [-32,768 to 32,767] or [-2^15 to 2^15-1]
    int = 32 bits = 4 bytes (a "long word")
        -> 4,294,967,296 combinations (2^32)
        -> 000000000 00000000 000000000 00000000 is zero
        -> signed: [-2,147,483,648 to 2,147,483,647] or [-2^31 t 2^31-1]
        -> unsigned: [0 to 4,294.967,296] or [2^0 to 2^32-1]
    long = 64 bits = 8 bytes
        -> big ass number of combinations (2^64)
        -> 000000000 00000000 000000000 00000000 000000000 00000000 000000000 00000000 is zero
        -> signed: [-2^63 to 2^63-1]
        -> unsigned: [0 to 2^64-1]

    double = 32 bits = 4 bytes
    float = 64 bits = 8 bytes

    char = 8 bits = 1 byte
    boolean = 16 bits = 2 bytes


     86 (decimal) = 1*64 + 0*32 + 1*16 + 0*8 + 1*4 + 1*2 + 0*1
                  = 1010110 (binary)

     125 (decimal) = 1*64 + 1*32 + 1*16 + 1*8 + 1*4 + 0*2 + 1*1
                   = 1111101

     96 (decimal) = 1*64 + 1*32 + 0*16 + 0*8 + 0*4 + 0*2 + 0*1
                  = 1100000

     10011 (binary) = 1*1 + 1*2 + 0*4 + 0*8 + 1*16
                    = 1 + 2 + 0 + 0 + 16
                    = 19

     37 (decimal) = 1*32 + 0*16 + 0*8 + 1*4 + 0*2 1*1
                  = 100101

     54 (decimal) = 1*32 + 1*16 + 0*8 + 1*4 + 1*2 0*1
                  = 110110

     63 (decimal) = 1*32 + 1*16 + 1*8 + 1+4 + 1*2 + 1*1
                  = 111111
     127 (decimal) = 1*64 + 1*32 + 1*16 + 1*8 + 1+4 + 1*2 + 1*1
                   = 1111111
     */

    public static short countBits(int x ) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits;
    }

    public static void main(String[] args) {
        System.out.println(countBits(86));
        System.out.println(countBits(125));
        System.out.println(countBits(96));
        System.out.println(countBits(37));
        System.out.println(countBits(54));
        System.out.println(countBits(63));
        System.out.println(countBits(127));
    }
}
