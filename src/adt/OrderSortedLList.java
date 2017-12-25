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
public class OrderSortedLList <OrderDelivery extends Comparable<OrderDelivery>> implements OrderSortedLListInterface<OrderDelivery> {
    private Node firstNode;
  private int length;

  public OrderSortedLList() {
    firstNode = null;
    length = 0;
  }

  public boolean add(OrderDelivery newEntry) {    
    firstNode = add(newEntry, firstNode);
    length++;
    return true;  
  }

  private Node add(OrderDelivery newEntry, Node currNode)
  {
      if((currNode == null)||newEntry.compareTo(currNode.data)<=0)
      {
          currNode = new Node(newEntry, currNode);
      }
      else
      {
          Node nodeAfter = add(newEntry, currNode.next);
          currNode.next = nodeAfter;
      }
      return currNode;
  }
  
  
  public OrderDelivery getEntry(int givenPosition) {
    OrderDelivery result = null;

    if ((givenPosition >= 1) && (givenPosition <= length)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition - 1; ++i) {
        currentNode = currentNode.next;		// advance currentNode to next node
      }
      result = currentNode.data;	// currentNode is pointing to the node at givenPosition
    }

    return result;
  }

  public boolean contains(OrderDelivery anEntry) {
    boolean found = false;
    Node tempNode = firstNode;
    int pos = 1;

    while (!found && (tempNode != null)) {
      if (anEntry.compareTo(tempNode.data) <= 0) {
        found = true;
      } else {
        tempNode = tempNode.next;
        pos++;
      }
    }
    if (tempNode != null && tempNode.data.equals(anEntry))
      return true;
    else 
      return false;
  }

  public final void clear() {
    firstNode = null;
    length = 0;
  }

  public int getLength() {
    return length;
  }

  public boolean isEmpty() {
    return (length == 0);
  }

  public boolean isFull() {
    return false;
  }

  private class Node {

    private OrderDelivery data;
    private Node next;

    private Node(OrderDelivery dataPortion) {
      data = dataPortion;
      next = null;
    }

    private Node(OrderDelivery dataPortion, Node nextNode) {
      data = dataPortion;
      next = nextNode;
    }
  }
}
