package com.oliverr.algorithms.datastructures;

import java.util.Iterator;
import java.util.EmptyStackException;

public class Stack<T> implements Iterable<T> {

    private java.util.LinkedList<T> stack = new java.util.LinkedList<T>();
    
    public Stack() {}

    public int size() { 
        return stack.size(); 
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        return stack.removeLast();
    }

    public T peek() {
        if(isEmpty()) throw new EmptyStackException();
        return stack.peekLast();
    }

    public int search(T item) {
        return stack.lastIndexOf(item);
    }

    @Override
    public Iterator<T> iterator() {
        return stack.iterator();
    }
    
}
