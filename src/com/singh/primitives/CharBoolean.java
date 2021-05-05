package com.singh.primitives;

public class CharBoolean {

    public static void main(StringReview[] args) {
        char myChar = 'D';
        // char is different from a string. It is similar, but can only store one character.
        // A char stores two bytes of memory, or 16 bits (width = 16). It's not a single byte
        // because it allows you to store Unicode characters.

        /*
            Unicode characters is an international encoding standard for use with different languages
            and scripts by which each letter, digit, or symbol is assigned a unique numeric value that
            applies across different platforms and programs.

            In the English alphabet, we have the letters A through Z, meaning only 26 characters are
            needed in total to represent the entire English alphabet. But other langues aneed more
            characters.

            Unicode allows us to represent these langauges and the way it works is that by using a
            combination of the two bytes that a char takes up in memory it can represent and one
            of 65535 different types of characters.
        */
        char myUnicode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char myCopyrightUnicode = '\u00A9';
        System.out.println(myCopyrightUnicode);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
