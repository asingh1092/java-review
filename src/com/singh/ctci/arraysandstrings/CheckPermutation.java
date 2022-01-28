package com.singh.ctci.arraysandstrings;

import java.util.Arrays;

public class CheckPermutation {

    /*
        N = number of chars in s1
        M = number of chars in s2
        N = M
        Space: O(N + N) = O(N)
        Time: O(N)
     */

    public static boolean checkPermutation(String s1, String s2) {
        boolean ret = true;
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; ++i) {
            if (ch1[i] != ch2[i]) {
                ret = false;
                break;
            }
        }

        return ret;
    }
}
