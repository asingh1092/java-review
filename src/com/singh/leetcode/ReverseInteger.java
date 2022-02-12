package com.singh.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseInteger {
    // n = 123
    // x % 10 / 1 = gives you last digit -> 3
    // x % 100 / 10 = gives you second digit -> 2
    // x % 1000 / 100 = gives you third digit -> 1
    /*
    int number;
    while (number > 0) {
        (number % 10) gives u last digit
        (number = number / 10) reduces it by 10
    }


    */

    public static int reverse(int x) {
        int ret = 0;
        boolean isNeg = x < 0;
        Stack<Integer> stack = new Stack<>();

        while (x > 0) {
            stack.push( x % 10 );
            x = x / 10;
        }

        while (!stack.isEmpty()) {
            ret = 10*ret + stack.pop();
        }

        if (isNeg) {
            ret = ret * -1;
        }

        if (ret < (-2^31) || ret > ((2^31) - 1)) return 0;
        return ret;

    }
}
