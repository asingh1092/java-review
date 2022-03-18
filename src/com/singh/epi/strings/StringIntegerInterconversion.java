package com.singh.epi.strings;

public class StringIntegerInterconversion {

    /*
        "123"
        3 * 1 + 0 = 3
        2 * 10 + 3 = 23
        1 * 100 + 23 = 123

        "98768"
        8 * 1 + 0 = 8
        6 * 10 + 8 = 68
        7 * 100 + 68 = 768
        8 * 1000 + 768 = 8768

        Time: O(N) where n is num of chars in str
        Space: O(1) constant
     */

    public static int stringToInteger(String str) {
        // start from back then work up to beginning
        if (str.isBlank() || str.isEmpty()) {
            System.out.print("String is empty, returning -1: ");
            return -1;
        }
        int finalNum = 0;
        int factor = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            int num = str.charAt(i);
            finalNum += num * factor;
            factor *= 10;
        }
        return finalNum;
    }

    /*
            123 % 10 / 1 = 3
            123 % 100 / 10 = 2
            123 % 1000 / 100 = 1

            123 % 10 / 1 = 3
            then set 123 = 12 by dividing it by 10
             12 % 10 / 1 = 2
             12 / 10 = 1
             1 % 10 / 1 = 0
            num % 10; = last num
            num /= 10;

     */

    public static String integerToString(int num) {
        StringBuilder finalString = new StringBuilder();
        while (num != 0) {
            finalString.append(num % 10);
            num /= 10;
        }
        return finalString.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(stringToInteger("123"));
        System.out.println(integerToString(123));
    }
}
