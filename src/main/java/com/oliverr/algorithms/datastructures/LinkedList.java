package com.oliverr.algorithms.datastructures;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private int size = 0;
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        private T data;
        private Node<T> previous;
        private Node<T> next;

        public Node(T data, Node<T> previous, Node<T> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }
    }
    
    public int size() {
        return size;
    }

    public void reverse() {
        Node<T> node = null;
        Node<T> current = head;
        while(current != null) {
            node = current.previous;
            current.previous = current.next;
            current.next = node;
            current = current.previous;
        }

        if(node != null) {
            head = node.previous;
        }
    }

    public void clear() {
        Node<T> node = head;
        while(node != null) {
            Node<T> next = node.next;
            node.next = null;
            node.previous = null;
            node.data = null;
            node = next;
        }
        size = 0;
        node = null;
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(T data) {
        if (isEmpty()) {
            head = tail = new Node<T>(data, null, null);
        } else {
            tail.next = new Node<T>(data, tail, null);
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(T data) {
        if (isEmpty()) {
            head = tail = new Node<T>(data, null, null);
        } else {
            head.previous = new Node<T>(data, null, head);
            head = head.previous;
        }
        size++;
    }

    public T peekFirst() {
        return head.data;
    }

    public T peekLast() {
        return tail.data;
    }

    public void removeFirst() {
        if(isEmpty()) throw new RuntimeException("List is empty");
        head = head.next;
        size -= 1;
        if(isEmpty()) tail = null;
        else head.previous = null;
    }

    public void removeLast() {
        if(isEmpty()) throw new RuntimeException("List is empty");
        tail = tail.previous;
        size -= 1;
        if(isEmpty()) head = null;
        else tail.next = null;
    }

    public int indexOf(T data) {
        int index = 0;
        Node<T> node = head;
    
        if(data == null) throw new IllegalArgumentException("data must not be null");

        while(node != null) {
            if(data.equals(node.data)) 
                return index;
            node = node.next;
            index++;
        }

        return -1;
    }
    
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(T data : this) {
            sb.append(data + " ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> node = head;
      
            @Override
            public boolean hasNext() {
                return node != null;
            }
      
            @Override
            public T next() {
                T data = node.data;
                node = node.next;
                return data;
            }
      
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
}
