package datastructures.worklists;

import cse332.interfaces.worklists.PriorityWorkList;
import cse332.exceptions.NotYetImplementedException;

/**
 * See cse332/interfaces/worklists/PriorityWorkList.java
 * for method specifications.
 */
public class MinFourHeap<E extends Comparable<E>> extends PriorityWorkList<E> {
    /* Do not change the name of this field; the tests rely on it to work correctly. */
    private E[] data;
    
    public MinFourHeap() {
        throw new NotYetImplementedException();
    }

    @Override
    public boolean hasWork() {
        throw new NotYetImplementedException();
    }

    @Override
    public void add(E work) {
        throw new NotYetImplementedException();
    }

    @Override
    public E peek() {
        throw new NotYetImplementedException();
    }

    @Override
    public E next() {
        throw new NotYetImplementedException();
    }

    @Override
    public int size() {
        throw new NotYetImplementedException();
    }

    @Override
    public void clear() {
        throw new NotYetImplementedException();
    }
}
