package com.singh.epi.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> first = null;
    private int size = 0;

    public Queue() {
    }

    public Queue(Node<T> first) {
        this.first = first;
        size += 1;
    }

    private void checkFirstNull() {
        if (this.first == null) throw new NoSuchElementException("Empty queue!");
    }

    public Boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        return this.size;
    }

    public T getMaxValue() {
        T maxValue = this.first.getData();
        Node<T> dummy = this.first;
        while (dummy.getNext() != null) {
            if (dummy.compareTo(dummy.getNext().getData()) > maxValue.hashCode()) maxValue = dummy.getData();
            dummy = dummy.getNext();
        }
        return maxValue;
    }

    public void add(T item) {
        checkFirstNull();
        Node<T> nodeToAdd = new Node<>(item);
        Node<T> dummy = first;
        while (dummy.getNext() != null) {
            dummy = dummy.getNext();
        }
        dummy.setNext(nodeToAdd);
        size += 1;
    }

    public T remove() {
        T ret = first.getData();
        first = first.getNext();
        size -= 1;
        return ret;
    }

    public T peek() {
     return first.getData();
    }
}
