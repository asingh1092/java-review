package com.singh.epi.strings;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {

    /*
        The look and say sequence is making the following:
                n = 1 -> <1>
                n = 2 -> <1, 11>
                n = 3 -> <1, 11, 21>
                ....
                n = 6 -> <1, 11, 21, 1211, 111221, 312211>
                etc
         Time: O(N) where N is integer values up to n
         Space: O(1)
     */

    private static String lookAndSayUntil(int n) {
        List<Integer> looknSayList = new ArrayList<>();
        looknSayList.add(1);
        for (int i = 0; i <= n; ++i) {

        }

        return "";
    }
}
