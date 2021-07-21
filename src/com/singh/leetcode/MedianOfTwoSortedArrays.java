package com.singh.leetcode;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*
        1. Two pointers, p1 for nums1, and p2 for nums2
        2. Traverse each array and put into them sorted a 3rd array called combined? - have p3 be that pointer for that array
        3. Find length of combined array and divide by 2: if it is odd, then that should be your median,
           else if even, get floor and ceiling of that number and that should be your two numbers to add together and divide by 2
         */
        double ret;

        // meat
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int combinedLength = nums1Length + nums2Length;
        int[] combined = new int[combinedLength];

        int p1 = 0, p2 = 0, p3 = 0;
        while (p1 < nums1Length && p2 < nums2Length) {
            if (nums1[p1] < nums2[p2]) {
                combined[p3] = nums1[p1];
                p1++;
            } else {
                combined[p3] = nums2[p2];
                p2++;
            }
            p3++;
        }

        // these are for uneven lengths of nums1 and nums2

        // add the rest of nums1
        while (p1 < nums1Length) {
            combined[p3] = nums1[p1];
            p1++;
            p3++;
        }

        // add the rest of nums2
        while (p2 < nums2Length) {
            combined[p3] = nums2[p2];
            p2++;
            p3++;
        }
        for (int num : combined) {
            System.out.print(num + " ");
        }

        // potatoes
        if (combinedLength % 2 == 0) {
            // even number
            int value1 = combined[combinedLength / 2];
            int value2 = combined[(combinedLength / 2)  - 1];
            ret = (double) (value1 + value2) / 2;
        } else {
            // odd number
            ret = Math.ceil(combined[combinedLength / 2]);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{0, 1, 8, 29, 85};
        int[] test2 = new int[]{-5, -3, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] test3 = new int[]{-5, -3, 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("\n" + findMedianSortedArrays(test1, test2));
        System.out.println("\n" + findMedianSortedArrays(test1, test3));
        System.out.println("\n" + findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println("\n" + findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println("\n" + findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}));
        System.out.println("\n" + findMedianSortedArrays(new int[]{}, new int[]{1}));
        System.out.println("\n" + findMedianSortedArrays(new int[]{2}, new int[]{}));
    }


}
