package com.singh.leetcode;

public class FindIfSubstring {
    /*
    Find if a string is a substring of another string.

    Given "us", is it a substring of "justice?"

     us
      ^

     justice
       ^

     Time: O(N + M) :  Space : O(1)
     */
    public static boolean isSubstring(String smaller, String bigger) {
        // if smaller is bigger, then something is wrong
        int smallSize = smaller.length();
        int bigSize = bigger.length();
        if (smallSize > bigSize) {
            System.out.print("Check input variables. Smaller string is larger! ");
            return false;
        }
        int smallIndex = 0;
        int bigIndex = 0;
        while (smallIndex < smallSize && bigIndex < bigSize) {
            if (smaller.charAt(smallIndex) == bigger.charAt(bigIndex)) {
                smallIndex++;
            }
            bigIndex++;
            // figure out someway to restart smallIndex by checking following char for smaller and bigger
            if (smallIndex != 0 && smallIndex < smallSize - 1 && bigIndex < bigSize - 1) {
                if (smaller.charAt(smallIndex + 1) != bigger.charAt(bigIndex + 1)) {
                    smallIndex = 0;
                }
            }
        }
        // if smallIndex has reached the size of the smaller index, return true else false
        return smallIndex == smallSize;
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("us", "justice"));
        System.out.println(isSubstring("ugh", "justice"));
        System.out.println(isSubstring("blasphemy", "justice"));
        System.out.println(isSubstring("ho", "wholesome"));
        System.out.println(isSubstring("tyuio", "qwertyuiop"));
        System.out.println(isSubstring("typ", "qwtruiyop"));
        System.out.println(isSubstring("t", "afacdfacfktawdawdawdawdwa"));
        System.out.println(isSubstring(" ", "lmdadujfrmoaewjfame"));
    }

}
