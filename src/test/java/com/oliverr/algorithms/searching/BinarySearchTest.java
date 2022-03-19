package com.oliverr.algorithms.searching;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BinarySearchTest {
    
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    BinarySearch bs;

    @Test
    public void binarySearchTest() {
        bs = new BinarySearch();
        Assertions.assertEquals(0, bs.search(arr, 1));
        Assertions.assertEquals(3, bs.search(arr, 4));
        Assertions.assertEquals(6, bs.search(arr, 7));
        Assertions.assertEquals(9, bs.search(arr, 10));
        Assertions.assertEquals(-1, bs.search(arr, 11));
    }

}
