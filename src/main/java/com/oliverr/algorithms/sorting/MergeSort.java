package com.oliverr.algorithms.sorting;

public class MergeSort {

    /**
     * Merge Sort sorting algorithm.
     * @param arr The array to sort
     */
    public void sort(int[] arr) {
        // base cases
        if(arr == null) return;
        if(arr.length < 2) return;

        // setting up a len variable to store the length of the given array
        int len = arr.length;

        // dividing the given array into two halves
        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        // filling up the two halves
        for(int i = 0; i < mid; i++)
            left[i] = arr[i];

        for(int i = mid; i < len; i++)
            right[i - mid] = arr[i];

        // calling the mergeSort method recursively to both sides
        sort(left);
        sort(right);

        // calling the merge method
        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        // setting up two variables to store the length of the given arrays
        int leftLen = left.length;
        int rightLen = right.length;

        // loop variables
        int i = 0, j = 0, k = 0;

        // merging the left and the right into 'arr'
        while(i < leftLen && j < rightLen) {
            if(left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }

        // filling up the array with the leftover elements of the left array
        while(i < leftLen) {
            arr[k++] = left[i++];
        }

        // filling up the array with the leftover elements of the right array
        while(j < rightLen) {
            arr[k++] = right[j++];
        }
    }

}
