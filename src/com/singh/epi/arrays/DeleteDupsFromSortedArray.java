package com.singh.epi.arrays;

import java.util.*;

public class DeleteDupsFromSortedArray {

    public static List<Integer> removedDupsBigSpace(List<Integer> sortedArray) {
        Set<Integer> hSet = new HashSet<>(sortedArray);
        Integer[] intArray= hSet.toArray(new Integer[hSet.size()]);
        return Arrays.asList(intArray);
    }

    /*
     1 1 3 4 5 6 7 7 9 9
     ^ ^

     1 3 4 5 6 7 9
                   ^ ^

     */
    public static List<Integer> removeDupsOptimal(List<Integer> sortedArray) {
        int slower = 1;
        for (int i = 1; i < sortedArray.size(); i++) {
            if (!sortedArray.get(i).equals(sortedArray.get(slower - 1))) {
                sortedArray.set(slower, sortedArray.get(i));
                slower++;
            }
        }
        return sortedArray.subList(0, slower);
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 5, 2, 3, 7, 58, 234, 6 ,3 , 3, 2,5, 3, 3, 3, 7);
        Collections.sort(list1);
        System.out.println(removedDupsBigSpace(list1));
        List<Integer> list2 = Arrays.asList(1, 5, 2, 3, 7, 58, 234, 6 ,3 , 3, 2,5, 3, 3, 3, 7);
        Collections.sort(list2);
        System.out.println(removeDupsOptimal(list2));
    }
}
