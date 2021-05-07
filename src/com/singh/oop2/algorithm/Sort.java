package com.singh.oop2.algorithm;

public class Sort {

    // selection sort is n^2 worst case and best case
    public static void selectionSort(Comparable[] list) {
        int minIndex;
        Comparable nextSmallest;

        for (int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++) {
            minIndex = unSortedStart;
            for (int currentIndex = unSortedStart+1; currentIndex < list.length; currentIndex++) {
                if (list[currentIndex].compareTo(list[minIndex]) < 0) {
                    minIndex = currentIndex;
                }
            }
            // Swap
            Utils.swap(list[minIndex], list[unSortedStart]);
            // nextSmallest = list[minIndex];
            // list[minIndex] = list[unSortedStart];
            // list[unSortedStart] = nextSmallest;
        }
    }


    public static void mergeSort(int[] list, int start, int end) {
        if (start == end) {
            return;
        } else if (start == end-1) {
            if (list[start] <= list[end]) {
                return;
            } else { // swap
                Utils.swap(list[start], list[end]);
                // int temp = list[start];
                // list[start] = list[end];
                // list[end] = temp;
            }
        }

        int mid = (end-start)/2;
        mergeSort(list, start, start + mid);
        mergeSort(list, start + mid + 1, end);
        merge(list, start, start + mid, end);
    }

    private static void merge(int[] list, int leftHalfStart, int rightHalfStart, int end) {
        int leftHalfSize = rightHalfStart - leftHalfStart + 1;
        int rightHalfSize = end - rightHalfStart;

        int[] leftHalf = new int[leftHalfSize];
        int[] rightHalf = new int[rightHalfSize];

        for (int i=0; i<leftHalfSize; ++i)
            leftHalf[i] = list[leftHalfStart + i];
        for (int j=0; j<rightHalfSize; ++j)
            rightHalf[j] = list[rightHalfStart + 1+ j];

        int i = 0;
        int j = 0;

        int k = leftHalfStart;
        while (i < leftHalfSize && j < rightHalfSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                list[k] = leftHalf[i];
                i++;
            } else {
                list[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalfSize) {
            list[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalfSize) {
            list[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(Comparable[] list, int start, int end) {
        if (start == end) {
            return;
        } else if (start == end-1) {
            if (list[start].compareTo(list[end]) <= 0) {

                return;
            } else { // swap
                Utils.swap(list[start], list[end]);
                // Comparable temp = list[start];
                // list[start] = list[end];
                // list[end] = temp;
            }
        }

        int mid = (end-start)/2;
        mergeSort(list, start, start + mid);
        mergeSort(list, start + mid + 1, end);
        merge(list, start, start + mid, end);
    }

    private static void merge(Comparable[] list, int leftHalfStart, int rightHalfStart, int end) {
        int leftHalfSize = rightHalfStart - leftHalfStart + 1;
        int rightHalfSize = end - rightHalfStart;

        Comparable[] leftHalf = new Comparable[leftHalfSize];
        Comparable[] rightHalf = new Comparable[rightHalfSize];

        for (int i=0; i<leftHalfSize; ++i)
            leftHalf[i] = list[leftHalfStart + i];
        for (int j=0; j<rightHalfSize; ++j)
            rightHalf[j] = list[rightHalfStart + 1+ j];

        int i = 0;
        int j = 0;

        int k = leftHalfStart;
        while (i < leftHalfSize && j < rightHalfSize) {
            if (leftHalf[i].compareTo(rightHalf[j]) <= 0) {
                list[k] = leftHalf[i];
                i++;
            } else {
                list[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalfSize) {
            list[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalfSize) {
            list[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    // insertion sort is n^2 worst case but best case is n
    public static void insertionSort(int[] list) {
        for (int unsortedStart = 1; unsortedStart < list.length; unsortedStart++) {
            int nextInsert = list[unsortedStart];
            int currentIndex = unsortedStart = 1;

            while (currentIndex >= 0 && list[currentIndex] > nextInsert) {
                list[currentIndex + 1] = list[currentIndex];
                currentIndex--;
            }

            list[currentIndex] = nextInsert;
        }
    }
}
