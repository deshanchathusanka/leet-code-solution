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
    private Iterator<Integer> flatIterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedIntegers = nestedList;
        this.init();
    }

    private void init() {
        List<Integer> flatInteger = new ArrayList<>();
        flat(nestedIntegers, flatInteger);
        flatIterator = flatInteger.listIterator();
    }

    @Override
    public Integer next() {
        return flatIterator.next();
    }

    @Override
    public boolean hasNext() {
        return flatIterator.hasNext();
    }

    private void flat(List<NestedInteger> nestedIntegers, List<Integer> flatInteger) {
        for (NestedInteger nestedInteger : nestedIntegers) {
            if (nestedInteger.isInteger()) {
                flatInteger.add(nestedInteger.getInteger());
            } else {
                flat(nestedInteger.getList(), flatInteger);
            }
        }
    }

}
