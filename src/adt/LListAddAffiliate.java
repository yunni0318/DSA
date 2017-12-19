/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author User
 */
public class LListAddAffiliate <T> implements ListInterface<T> {
  private Node firstNode;
  private int numberOfEntries;

    public LListAddAffiliate() {
        clear();
    }

    public final void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public boolean add(T newEntry) {
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
        return true;
    }
    
    public boolean add(int newPosition, T newEntry) {
        boolean isSuccessful = true;

        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
            Node newNode = new Node(newEntry);

            if (isEmpty() || (newPosition == 1)) {
                firstNode = newNode;
            } else{
                Node nodeBefore = firstNode;
                for (int i = 1; i < newPosition - 1; ++i) {
                    nodeBefore = nodeBefore.next;		
                }

                newNode.next = nodeBefore.next;	
                nodeBefore.next = newNode;
            }

            numberOfEntries++;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessful = true;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            Node currentNode = firstNode;
            for (int i = 0; i < givenPosition - 1; ++i) {
                currentNode = currentNode.next;
            }
            currentNode.data = newEntry;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;

        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        return found;
    }

    public T remove(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            if (givenPosition == 1) {
                result = firstNode.data;
                firstNode = firstNode.next;
            } else {
                Node nodeBefore = firstNode;
                for (int i = 1; i < givenPosition - 1; ++i) {
                    nodeBefore = nodeBefore.next;
                }
                result = nodeBefore.next.data;
                nodeBefore.next = nodeBefore.next.next;
            } 																// one to be deleted (to disconnect node from chain)

            numberOfEntries--;
        }

        return result;
    }

    public T getEntry(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            Node currentNode = firstNode;
            for (int i = 0; i < givenPosition - 1; ++i) {
                currentNode = currentNode.next;	
            }
            result = currentNode.data;
        }
        return result;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        boolean result;

        if (numberOfEntries == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public boolean isFull() {
        return false;
    }

    @Override
    public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            outputStr += currentNode.data + "\n";
            currentNode = currentNode.next;
        }
        return outputStr;
    }

    public Iterator<T> getDeliveryMan() {
        return new LListDeliveryMan();
    }

    private class LListDeliveryMan implements Iterator<T> {

        private Node currentNode;

        public LListDeliveryMan() {
            currentNode = firstNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T returnData = currentNode.data;
                currentNode = currentNode.next;
                return returnData;
            } else {
                throw new NoSuchElementException("Illegal call to next(); iterator is after end of list.");
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
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
    }
}
