package com.singh.epi.stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
    }

    public Stack(Node<T> top) {
        this.top = top;
    }

    private void checkIfEmpty() {
        if (isEmpty()) throw new NoSuchElementException("Empty stack!");
    }

    public Boolean isEmpty() {
        return top != null;
    }

    public T peek() {
        checkIfEmpty();
        return top.getData();
    }

    public T pop() {
        checkIfEmpty();
        T ret = top.getData();
        top = top.getNext();
        return ret;
    }

    public void push(T dataToPush) {
        Node<T> newData = new Node<>(dataToPush);
        newData.setNext(top);
        top = newData;
    }
}
