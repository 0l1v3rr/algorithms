package com.oliverr.algorithms.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {

    BubbleSort bs;

    int[] arr = new int[10];
    int[] arr2 = new int[10];
    int[] arrSorted = new int[10];
    int[] arr2Sorted = new int[10];

    @BeforeEach
    public void init() {
        bs = new BubbleSort();
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            int n1 = r.nextInt(1000);
            int n2 = r.nextInt(1000);
            arr[i] = n1;
            arrSorted[i] = n1;
            arr2[i] = n2;
            arr2Sorted[i] = n2;
        }

        Arrays.sort(arrSorted);
        Arrays.sort(arr2Sorted);
    }

    @Test
    public void testBubbleSort() {
        bs.sort(arr);
        bs.sort(arr2);
        Assertions.assertArrayEquals(arrSorted, arr);
        Assertions.assertArrayEquals(arr2Sorted, arr2);
    }

}
