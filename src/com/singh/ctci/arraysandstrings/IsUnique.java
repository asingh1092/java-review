package com.singh.ctci.arraysandstrings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    public static boolean isUnique(String s) {
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
}
