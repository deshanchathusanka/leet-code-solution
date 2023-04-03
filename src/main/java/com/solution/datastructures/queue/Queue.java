package com.solution.datastructures.queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private final List<T> data;

    public Queue(List<T> data) {
        this.data = data;
    }

    public Queue() {
        this(new ArrayList<>());
    }

    public void enqueue(T element) {
        data.add(element);
    }

    public T dequeue() {
        if (data.isEmpty()) {
            return null;
        }
        T removed = data.remove(0);
        return removed;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

}
