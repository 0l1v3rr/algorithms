package com.oliverr.algorithms.sorting;

public class InsertionSort {

    /**
     * Insertion Sort sorting algorithm.
     * @param arr The array to sort
     */
    public void sort(int[] arr) {
        // base cases
        if(arr == null) return;
        if(arr.length < 2) return;

        for (int i = 1; i < arr.length; i++) {
            // setting a temp variable to arr[i]
            int temp = arr[i];

            // moving the elements of the array[0,...,i - 1], if they are greater than 'temp'
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

    }

}
