package com.singh.oop2.algorithm;

import java.util.Arrays;
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

    // the linear search algo is at worst linear O(n)
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

    // binary search is logarithmic O(log(n))
    public static int binarySearch(int target, int[] list) {
        int middleIndex = list.length / 2;
        int middleValue = list[middleIndex];
        if (target == middleValue) {
            return middleValue;
        }
        if (target > middleValue) {
            int[] rightSide = Arrays.copyOfRange(list, middleIndex, list.length);
            binarySearch(target, rightSide);
        } else {
            int[] leftSide = Arrays.copyOfRange(list, 0, middleIndex);
            binarySearch(target, leftSide);
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
