package com.oliverr.algorithms.sorting;

public class CountingSort {

    /**
     * Counting Sort sorting algorithm.
     * @param arr The array to sort
     */
    public void sort(int[] arr) {
        // base cases
        if(arr == null) return;
        if(arr.length < 2) return;

        int len = arr.length;

        // creating a new array with the length of the array + 1
        int[] output = new int[len + 1];

        // finding the largest element of the array
        int max = arr[0];
        for (int i = 1; i < len; i++)
            if (arr[i] > max)
                max = arr[i];

        // creating a new array with the length of max + 1
        int[] count = new int[max + 1];

        // filling count array with all zeros
        for (int i = 0; i < max; i++)
            count[i] = 0;

        // storing the count of each element
        for (int i = 0; i < len; i++)
            count[arr[i]]++;

        // storing the count of each array
        for (int i = 1; i <= max; i++)
            count[i] += count[i - 1];

        // finding the index of each element of the original array in count array
        for (int i = len - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // copying the sorted elements into original array
        for (int i = 0; i < len; i++)
            arr[i] = output[i];
    }

}
