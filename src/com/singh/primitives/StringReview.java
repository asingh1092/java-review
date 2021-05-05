package com.singh.primitives;

public class StringReview {

    public static void main(String[] args) {
        // byte -> 1 byte -> 8 bits
        // short -> 2 bytes-> 16 bits
        // int -> 4 bytes -> 32 bits
        // long -> 8 bytes -> 64 bits
        // float -> 4 bytes -> 32 bits
        // double -> 8 bytes -> 64 bits
        // char -> 2 bytes -> 16 bits
        // boolean -> 1 byte -> 8 bits

        // Most common primitives: int, double, & boolean
        // Sometimes used: long & char

        /*
            The String is a datatype in Java, which is NOT a primitive type. It's actually a Class,
            but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

            A String is a sequencing of character. In the case of the char whic hyou can see above
            which we discussed in the previous video, it could contain a single character only
            (regular character or Unicode character).

            A String can contain a sequence of characters. A large number of characters. Technically it's
            limited by memory or the MAX_VALUE of an int which was 2.14 billion. That's a lot of characters.

            Strings are Immutable! When you append (i.e +) to a previously made string, Java makes a new
            string in memory.
         */
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("myString is equal to " + lastString);


        String funnyStr = "Computer!Science,!long!walks!on!the!beach";
        int a = funnyStr.indexOf(33);
        int b = funnyStr.indexOf('!'); //chars are converted to Unicode int value
        int c = funnyStr.indexOf("!");
        int d = funnyStr.indexOf("!Science");
        int e = funnyStr.indexOf("!Science,!long");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
