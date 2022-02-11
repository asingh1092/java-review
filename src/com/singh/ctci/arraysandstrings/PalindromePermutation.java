package com.singh.ctci.arraysandstrings;

import java.util.HashMap;
import java.util.Map;



public class PalindromePermutation {

    /*
        "tact coa" -> true (acto cta, taco cat)
        "ttt ttt" -> true (tt tt tt)
        "oat tic" -> oattic -> aciott
                     "ccctt"

         1. Hashtable -> HashMap<Character, Integer>
         2. put chars in hashtable
         3. go through hash table and see if exactly one character has odd number
     */


    public static Boolean isPalindromePermutation(String str) {
        Map<Character, Integer> hMap = new HashMap<>();
        boolean ret = true;
        for (char c: str.toCharArray()) {
            if (hMap.get(c) != null) {

            }
        }

        return ret;
    }

    public static void main(String[] arg) {
        String test = "taco cat";
        System.out.println(isPalindromePermutation(test));
    }
}
