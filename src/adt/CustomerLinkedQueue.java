/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author Tea Evon
 */
public class CustomerLinkedQueue <T> implements QueueInterface<T> {

    private Node firstNode;
    private int numberOfEntries;

    public CustomerLinkedQueue() {
        firstNode = null;
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);

        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node currentNode = firstNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        numberOfEntries++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            T data = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
            return data;
        }
    }

    @Override
    public T getFront() {
        if (isEmpty()) {
            return null;
        } else {
            T data = firstNode.data;
            return data;
        }
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public void clear() {
        firstNode = null;
    }

    public String toString() {
        String s = "";
        Node firstNodeCopy = firstNode;
        while (firstNodeCopy != null) {
            s += firstNodeCopy.data + "\n";
            firstNodeCopy = firstNodeCopy.next;
        }
        return s;
    }

    public int getSize() {
        return numberOfEntries;
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    } // end Node
}
