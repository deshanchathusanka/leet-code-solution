package com.solution.datastructures.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 **/
interface NestedInteger {
    boolean isInteger();

    Integer getInteger();

    List<NestedInteger> getList();
}

public class NestedIterator implements Iterator<Integer> {

    private final List<NestedInteger> nestedIntegers;
    private Queue<Integer> queue;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedIntegers = nestedList;
        this.queue = new Queue<>();
        flat(nestedIntegers, queue);
    }

    @Override
    public Integer next() {
        return queue.dequeue();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    private void flat(List<NestedInteger> nestedIntegers, Queue<Integer> flatInteger) {
        for (NestedInteger nestedInteger : nestedIntegers) {
            if (nestedInteger.isInteger()) {
                flatInteger.enqueue(nestedInteger.getInteger());
            } else {
                flat(nestedInteger.getList(), flatInteger);
            }
        }
    }

}
