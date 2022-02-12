package com.singh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
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
        x = Math.abs(x);

        while (x > 0) {
            ret = ret*10 + ( x % 10 );
            x = x / 10;
        }

        if (isNeg) {
            ret = ret * -1;
        }

        if (ret < Integer.MIN_VALUE || ret > Integer.MAX_VALUE) return 0;
        return ret;

    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverse(n));
        int m = -143562352;
        System.out.println(reverse(m));
        int o = -143562;
        System.out.println(reverse(o));
    }

}
