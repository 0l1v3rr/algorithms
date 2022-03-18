package com.oliverr.algorithms.searching;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LinearSearchTest {
    
    LinearSearch ls;
    int[] arr = { 1, 8, 4, 6, 2, 7, 9, 5, 3 };

    @Test
    public void linearSearchTest() {
        ls = new LinearSearch();
        Assertions.assertEquals(0, ls.search(arr, 1));
        Assertions.assertEquals(3, ls.search(arr, 6));
        Assertions.assertEquals(7, ls.search(arr, 5));
        Assertions.assertEquals(-1, ls.search(arr, 12));
    }

}
