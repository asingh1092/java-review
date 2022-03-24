package com.singh.epi.linkedlists;

public class ListNode<T> {
    private T data;
    private ListNode<T> next;
    private ListNode<T> prev;

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(T data, ListNode<T> next, ListNode<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
