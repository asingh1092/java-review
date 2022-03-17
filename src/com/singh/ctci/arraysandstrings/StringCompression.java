package com.singh.ctci.arraysandstrings;

public class StringCompression {

    /*
        Implement a method to perofrm basic string compression using the counts
        of repeated characters. Assume the string only has uppercase or lowercase letters
        (a - z).

         e.g. "aaabcccd" to "a3b1c3d1"
              "aaAadFFFFFg" -> "a2A1a1d1F5g1"

         aaabcccd
         ^
         have a count var set to 0
         check if next char is same as current, then increase pointer and count
               else take current char and add count to some stringbuilder then reset count

         Time: O(N) where N is size of original str
         Space: < O(N) since sb can't be N chars only
     */

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (i + 1 != str.length() && current == str.charAt(i + 1)) {
                // increase count
                count++;
            } else {
                // append current char and count, then reset count
                sb.append(current);
                sb.append(count);
                count = 1;
            }
        }

        return sb.length() < str.length() ? sb.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaabcccd"));
        System.out.println(compressString("aaabccccccccccc"));
        System.out.println(compressString("aaAadFFFFFg"));
        System.out.println(compressString("aAadFFFFFgggggGGGG"));
    }
}
