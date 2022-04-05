package com.singh.epi.stacksandqueues;

public class Stack<T> {
    private Node<T> top;

    public Stack(Node<T> top) {
        this.top = top;
    }

    public T peek() {
        return top
    }
}
