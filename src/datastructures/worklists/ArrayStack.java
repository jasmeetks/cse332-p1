package datastructures.worklists;

import java.util.NoSuchElementException;

import cse332.exceptions.NotYetImplementedException;
import cse332.interfaces.worklists.LIFOWorkList;

/**
 * See cse332/interfaces/worklists/LIFOWorkList.java
 * for method specifications.
 */
public class ArrayStack<E> extends LIFOWorkList<E> {
	E[] data;
	int size;
	
    @SuppressWarnings("unchecked")
	public ArrayStack() {
    	this.data = (E[]) new Object[10];
    	this.size = 0;
	}

    @Override
    public void add(E work) {
        if (this.size == this.data.length) {
        	growArray();
        }
        data[size] = work;
        size++;
    }

    @Override
    public E peek() {
    	if (this.hasWork() == false) {
    		throw new NoSuchElementException();
    	}
    	return data[size - 1];
    }

    @Override
    public E next() {
    	if (this.hasWork() == false) {
    		throw new NoSuchElementException();
    	}
    	return data[size-- - 1];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.size = 0;
    }
    
    @SuppressWarnings("unchecked")
	private void growArray() {
    	E[] newData = (E[]) new Object[2*data.length];
    	for (int i = 0; i < data.length; i++) {
    		newData[i] = data[i];
    	}
    	data = newData;
    }
}
