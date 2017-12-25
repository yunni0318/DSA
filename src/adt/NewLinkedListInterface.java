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
public interface NewLinkedListInterface<T> {
     /**
     * * Task: Adds a new entry to the end of the list. Entries currently in the
     * * list are unaffected. The list's size is increased by 1. * * @param
     * newEntry the object to be added as a new entry * @return true if the
     * addition is successful, or false if the list is full
     */
    public boolean add(T newEntry);
    
    /**
     * * Task: Removes the entry at a given position from the list. Entries *
     * originally at positions higher than the given position are at the next *
     * lower position within the list, and the list's size is decreased by 1. *
     * * @param givenPosition an integer that indicates the position of the
     * entry to * be removed * @return a reference to the removed entry or null,
     * if either the list was * empty, givenPosition < 1, or   *          givenPosition >
     * getLength()
     */
    public T remove(int givenPosition);

    /**
     * * Task: Removes all entries from the list.
     */
    public void clear();
    
    /**
     * * Task: Retrieves the entry at a given position in the list. * * @param
     * givenPosition an integer that indicates the position of the desired *
     * entry * @return a reference to the indicated entry or null, if either the
     * list is * empty, givenPosition < 1, or givenPosition > getLength()
     */
    public T getEntry(int givenPosition);
    
    /**
     * * Task: Gets the number of entries in the list. * * @return the integer
     * number of entries currently in the list
     */
    public int getNumberOfEntries();

    /**
     * * Task: Sees whether the list is empty. * * @return true if the list is
     * empty, or false if not
     */
    public boolean isEmpty();

//    /**
//     * * Task: Sees whether the list is full. * * @return true if the list is
//     * full, or false if not
//     */
//    public boolean isFull();
}
