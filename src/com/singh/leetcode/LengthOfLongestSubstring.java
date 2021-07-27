package com.singh.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int count = 0;
        int highest = 0;
        Set<Character> hSet = new HashSet<>();

        for (int position = 0; position < s.length(); position++) {
            char curr = s.charAt(position);
            if (hSet.contains(curr)) {
                if (highest < count) highest = count;
                count = 0;
            }
            hSet.add(curr);
            count++;
        }
        return highest;
    }

    public static void main(String[] args) {
        String test1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(test1));
    }


}
