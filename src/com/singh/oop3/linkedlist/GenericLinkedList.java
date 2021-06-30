package com.singh.oop3.linkedlist;

public class GenericLinkedList<E> {

    private Node<E> head; // the only instance variable of the list

    public GenericLinkedList() {
        head = null; // list starts off empty
    }

    public static void main(String[] args) {
        GenericLinkedList<String> songs = new GenericLinkedList<>();
        songs.addToFront("Yo dawg song 1");
        songs.addToRear("This going to the be song 2");
        songs.addToFront("This is song 3");
        songs.addToRear("Look! Song 4");
        songs.addToFront("Sonnnnnnggggg 5!");
        System.out.println(songs.toString());
        songs.removeFromFront();
        songs.removeFromRear();
        System.out.println(songs.toString());
        System.out.println(songs.contains("Look! Song 4"));
    }

    public boolean isEmpty() {
        return (head == null); //the list is empty if the head is null
    }

    public void addToFront(E newData) {
        head = new Node<E>(newData, head);
    }

    public void addToRear(E newData) {
        Node<E> node = new Node<E>(newData, null); // new Node to add to Rear of list
        Node<E> current = head;
        if (isEmpty()) head = node; // point head to new node if list is empty
        else {
            while (current.next != null) { // the last node is the one with next = null
                current = current.next;
            }
            current.next = node;
        }
    }

    public String toString() {
        Node<E> current = head; // traversal starts at the front
        String result = "";

        while (current != null) {
            result = result + current.data.toString() + "\n";
            current = current.next;
        }
        return result;
    }

    public boolean contains(E target) {
        if (isEmpty()) {
            return false;
        }
        boolean found = false;
        Node<E> current = head;

        while ((current != null) && (!found)) {
            if (target.equals(current.data)) {
                found = true;
            } else {
                current = current.next;
            }
        }
        return found;
    }

    public E removeFromRear() {
        E removedData;

        if (isEmpty()) {
            removedData = null;
        } else if (head.next == null) {
            removedData = head.data;
            head = null;
        } else {
            Node<E> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            removedData = current.next.data;
            current.next = null;
        }

        return removedData;
    }

    public E removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        E removedData = head.data;
        head = head.next;
        return removedData;
    }

    public E get(E target) {
        if (isEmpty()) {
            return null;
        }
        E dataToGet = head.data;
        Node<E> current = head;
        while (current.next != null) {
            if (current.data == target) {
                dataToGet = current.data;
                return dataToGet;
            }
            current = current.next;
        }
        if (dataToGet == null) {
            System.out.println("Target not in linked list!");
        }
        return dataToGet;
    }

    private class Node<E> { //inner class
        E data;
        Node<E> next;

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
