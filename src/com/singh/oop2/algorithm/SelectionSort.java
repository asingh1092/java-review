package com.singh.oop2.algorithm;

public class SelectionSort {

    public static void selectionSort(int[] list) {
        int minIndex;
        int nextSmallest;

        // take the array and start from the left most value and compared it
        for (int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++) {
            minIndex = unSortedStart;
            for (int currentIndex = unSortedStart+1; currentIndex < list.length; currentIndex++) {
                if (list[currentIndex] < list[minIndex]) {
                    minIndex = currentIndex;
                }
            }
            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }
}
