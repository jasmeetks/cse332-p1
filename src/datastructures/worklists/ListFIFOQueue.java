package datastructures.worklists;

import java.util.NoSuchElementException;

import cse332.exceptions.NotYetImplementedException;
import cse332.interfaces.worklists.FIFOWorkList;

/**
 * See cse332/interfaces/worklists/FIFOWorkList.java
 * for method specifications.
 */
public class ListFIFOQueue<E> extends FIFOWorkList<E> {
	Node front;
	Node back;
	int size;
	
	private class Node {
		E data;
		Node next;
	}
    
    public ListFIFOQueue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    @Override
    public void add(E work) {
       Node node = new Node();
       node.data = work;
       node.next = null;
       
       if (back != null) {
    	   back.next = node;   
       }
       back = node;
       if (front == null) {
    	   front = back;
       }
       this.size++;
    }

    @Override
    public E peek() {
    	if (this.hasWork() == false) {
    		throw new NoSuchElementException();
    	}
        return front.data;
    }

    @Override
    public E next() {
    	if (this.hasWork() == false) {
    		throw new NoSuchElementException();
    	}
    	E temp = front.data;
        front = front.next;
        this.size--;
        return temp;
    }

    @Override
    public int size() {
        return this.size;
    }

	@Override
    public void clear() {
        this.front = null;
        this.back =  null;
        this.size = 0;
    }
}
