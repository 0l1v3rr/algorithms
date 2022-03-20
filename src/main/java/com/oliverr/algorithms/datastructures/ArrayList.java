package com.oliverr.algorithms.datastructures;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class ArrayList<T> implements Iterable<T> {

    private T[] arr;
    private int len = 0;
    private int capacity = 0;

    public ArrayList() {
        this(128);
    }

    public ArrayList(int size) {
        if(size < 0) throw new IllegalArgumentException("size must be greater than 0");
        this.capacity = size;
        arr = (T[]) new Object[capacity];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < len;
            }

            @Override
            public T next() {
                return arr[i++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public void clear() {
        for(int i = 0; i < len; i++) arr[i] = null;
        len = 0;
    }

    public T get(int index) {
        if(index < 0 || index >= len) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public void set(int index, T value) {
        if(index < 0 || index >= len) throw new IndexOutOfBoundsException();
        arr[index] = value;
    }

    public void add(T value) {
        if(len + 1 < capacity) throw new IndexOutOfBoundsException();

        if(capacity == 0) capacity = 1;
        else capacity *= 2;
        T[] newArr = (T[]) new Object[capacity];
        for(int i = 0; i < len; i++)
            newArr[i] = arr[i];
        arr = newArr;
        newArr[len++] = value;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= len) throw new IndexOutOfBoundsException();
        T[] newArr = (T[]) new Object[len - 1];

        for (int i = 0, j = 0; i < len; i++, j++) {
            if (i == index) j--;
            else newArr[j] = arr[i];
        }
        arr = newArr;
        capacity = len--;
    }

    public void remove(T value) {
        int index = indexOf(value);
        if(index == -1) return;
        removeAt(index);
    }

    public int indexOf(T value) {
        for(int i = 0; i < len; i++)
            if(arr[i].equals(value))
                return i;
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }
    
}
