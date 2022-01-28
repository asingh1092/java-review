package com.singh.ctci.arraysandstrings;

import java.util.*;

public class IsUnique {

    public static boolean isUnique(String s) {
        /*
           n = number of characters = s.length()
           Space: O(n)
            Time: O(n)
         */
        boolean ret = true;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            if (set.contains(s.charAt(i))) {
                ret = false;
            } else {
                set.add(s.charAt(i));
            }
        }
        return ret;
    }

    public static boolean betterIsUnique(String s) {
        /*
           Space: O(1)
           Time: sort first O(nlogn) + look through list O(n)
                so 0(nlogn)
         */
        boolean ret = true;
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        char prev = temp[0];
        for (int i = 1; i < temp.length; ++i) {
            if (temp[i] == prev) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String test1 = "thehehehehehe";
        String test2 = "tyuioplkjhgfdsa";
        System.out.println(isUnique(test1));
        System.out.println(isUnique(test2));
        System.out.println(betterIsUnique(test1));
        System.out.println(betterIsUnique(test2));
    }
}
