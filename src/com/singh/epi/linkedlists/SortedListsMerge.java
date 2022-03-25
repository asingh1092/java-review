package com.singh.epi.linkedlists;

public class SortedListsMerge {

    /*
    Merge two sorted lists.

    Solution 1 - make a ret list and add items as we iterate thru them, then dump the rest into new list
                Space: O(N+M)
                Time: O(N+M)
    Solution 2 - use one of the lists and add accordingly
                Space: O(1)
                Time: O(N+M)

    prevL1 = empty
    L1 : 1->4->7
            ^
    prevL2 = empty
    L2 : 2->6->9->11->13
         ^

     */
    public static ListNode<Integer> mergeTwoSortedListsSolution1(ListNode<Integer> first, ListNode<Integer> second) {
        ListNode<Integer> ret = ListNode.empty();
        ListNode<Integer> dummy = ret;
        while (first.getNext() != null && second.getNext() != null) {
            if (first.getData() < second.getData()) {
                dummy.setNext(first);
                first = first.getNext();
            } else {
                dummy.setNext(second);
                second = second.getNext();
            }
            dummy = dummy.getNext();
        }

        while (first.getNext() != null) {
            dummy.setNext(first);
            first = first.getNext();
            dummy = dummy.getNext();
        }

        while (second.getNext() != null) {
            dummy.setNext(second);
            second = second.getNext();
            dummy = dummy.getNext();
        }

        return ret.getNext();
    }

    public static void main(String[] args) {
        ListNode<Integer> L1 = new ListNode<>(1, new ListNode<>(4, new ListNode<>(7)));
        ListNode<Integer> L2 = new ListNode<>(2, new ListNode<>(6, new ListNode<>(9, new ListNode<>(11, new ListNode<>(13)))));
        System.out.println(mergeTwoSortedListsSolution1(L1, L2));
    }
}