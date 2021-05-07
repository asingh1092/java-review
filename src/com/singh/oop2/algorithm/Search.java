package com.singh.oop2.algorithm;

import java.util.Random;

public class Search {

    public static boolean isTargetInIntArray(int target, int[] arr) {
        boolean result = false;
        for (int element : arr) {
            if (element == target) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int searchIntArray(int target, int[] arr) {
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    public static int linearSearch(Comparable target, Comparable[] list) {
        int index = 0;
        while (index < list.length) {
            if (list[index].compareTo(target) == 0)
                return index;
            else
                index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[1000000];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        int result = Search.linearSearch(1, numbers);

    }
}
