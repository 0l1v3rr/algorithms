package com.oliverr.algorithms.datastructures;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{

    private java.util.LinkedList<T> queue = new java.util.LinkedList<T>();

    public Queue() {}

    public int size() { 
        return queue.size(); 
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return queue.peekFirst();
    }

    public T poll() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return queue.removeFirst();
    }

    public void offer(T value) {
        queue.addLast(value);
    }

    @Override
    public Iterator<T> iterator() {
        return queue.iterator();
    }
    
}
