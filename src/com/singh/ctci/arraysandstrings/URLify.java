package com.singh.ctci.arraysandstrings;

public class URLify {

    public static String uRLify(String s) {
        return s.strip().replace(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(uRLify("Mr John Smith    "));
        System.out.println(uRLify(" 2020, what a glorious year of pain    "));
    }
}
