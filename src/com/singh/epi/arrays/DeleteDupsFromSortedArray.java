package com.singh.epi.arrays;

import java.util.*;

public class DeleteDupsFromSortedArray {

    public static List<Integer> removedDups(List<Integer> sortedArray) {
        Set<Integer> hSet = new HashSet<>(sortedArray);
        Integer[] intArray= hSet.toArray(new Integer[hSet.size()]);
        return Arrays.asList(intArray);
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 5, 2, 3, 7,58 , 234, 6 ,3 , 3, 2,5, 3, 3, 3, 7);
        Collections.sort(list1);
        System.out.println(removedDups(list1));
    }
}
