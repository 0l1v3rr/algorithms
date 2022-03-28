package com.oliverr.algorithms.datastructures;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedListTest {
    
    private LinkedList<String> list = new LinkedList<>();

    @Test
    public void reverseLinkedListTest() {
        list.addLast("Greg");
        list.addLast("John");
        list.addLast("Doe");
        list.addLast("Trevor");
        list.addLast("James");
        list.addLast("Bill");
        list.addLast("Jordan");

        list.reverse();
        Assertions.assertEquals("[ Jordan Bill James Trevor Doe John Greg ]", list.toString());
    }

}
