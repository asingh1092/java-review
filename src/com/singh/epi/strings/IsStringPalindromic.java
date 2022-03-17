package com.singh.epi.strings;

public class IsStringPalindromic {

    public static boolean isPalindrome(String str) {
        boolean ret = true;
        int begin = 0;
        int end = str.length() - 1;
        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end)) {
                ret = false;
                break;
            } else {
                begin++;
                end--;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aghhhggg"));
        System.out.println(isPalindrome("aabbaa"));
        System.out.println(isPalindrome("aabaaa"));
        System.out.println(isPalindrome("AAaBBaa"));
    }
}
