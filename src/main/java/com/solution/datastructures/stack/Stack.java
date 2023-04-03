package com.solution.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> data;
    private int top;

    public Stack(List<T> data) {
        this.data = data;
        this.top = -1;
    }

    public Stack() {
        this(new ArrayList<>());
    }

    public void push(T element) {
        data.add(element);
        ++top;
    }

    public T pop() {
        if (data.isEmpty()) {
            return null;
        }
        T element = data.remove(top);
        --top;
        return element;
    }

}
