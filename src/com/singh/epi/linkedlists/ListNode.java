package com.singh.epi.linkedlists;

public class ListNode<T> {
    private T data = null;
    private ListNode<T> next = null;
//    private ListNode<T> prev = null;

    private ListNode() {
    }

    public ListNode(T data) {
        this.data = data;
    }

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

//    public ListNode(T data, ListNode<T> next, ListNode<T> prev) {
//        this.data = data;
//        this.next = next;
//        this.prev = prev;
//    }

    public ListNode<T> empty() {
        return new ListNode<>();
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    // implement search, insert, and delete for singly linked list

    public ListNode<T> searchList(ListNode<T> head, T value) {
        while (head.next != null) {
            if (head.data == value) {
                return head;
            }
            head = head.next;
        }
        return empty();
    }


    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        head.next = new ListNode<>(2);
        head.next.next = new ListNode<>(3);
        System.out.println(head);
        System.out.println(head.searchList(head, 5));
    }
}
