package com.singh.epi.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> first = null;

    public Queue() {
    }

    public Queue(Node<T> first) {
        this.first = first;
    }
    // isEmpty
    private void checkFirstNull() {
        if (this.first == null) throw new NoSuchElementException("Empty queue!");
    }

    public Boolean isEmpty() {
        return first == null;
    }

    public void add(T item) {
        checkFirstNull();
        Node<T> nodeToAdd = new Node<>(item);
        Node<T> dummy = first;
        while (dummy.getNext() != null) {
            dummy = dummy.getNext();
        }
        dummy.setNext(nodeToAdd);
    }

    public T remove() {
        T ret = first.getData();
        first = first.getNext();
        return ret;
    }

    public T peek() {
     return first.getData();
    }
}
