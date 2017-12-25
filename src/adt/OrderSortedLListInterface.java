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
public interface OrderSortedLListInterface <OrderDelivery extends Comparable<OrderDelivery>> {
    public boolean add(OrderDelivery newEntry);
    public OrderDelivery getEntry(int givenPosition);
    public boolean contains(OrderDelivery anEntry);
    public void clear();
    public int getLength();
    public boolean isEmpty();
    public boolean isFull();
}
