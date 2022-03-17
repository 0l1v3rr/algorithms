package com.oliverr.algorithms.sorting;

public class BubbleSort {

    /**
     * Bubble Sort sorting algorithm.
     * @param arr The array to sort
     */
    public void sort(int[] arr) {
        // base cases
        if(arr == null) return;
        if(arr.length < 2) return;

        for(int i = 0; i < arr.length - 1; i++) {
            // setting an isSorted boolean variable to true
            boolean isSorted = true;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                // if the arr[j] is bigger than arr[j + 1]
                if(arr[j] > arr[j + 1]) {
                    // swap the two values
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // setting the isSorted to false
                    isSorted = false;
                }
            }
            // if the array is sorted then return
            if(isSorted) return;
        }
    }

}
