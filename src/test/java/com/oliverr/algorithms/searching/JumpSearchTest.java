package com.oliverr.algorithms.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpSearchTest {
    

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    JumpSearch js;

    @Test
    public void binarySearchTest() {
        js = new JumpSearch();
        Assertions.assertEquals(0, js.search(arr, 1));
        Assertions.assertEquals(3, js.search(arr, 4));
        Assertions.assertEquals(6, js.search(arr, 7));
        Assertions.assertEquals(9, js.search(arr, 10));
        Assertions.assertEquals(-1, js.search(arr, 11));
    }

}
