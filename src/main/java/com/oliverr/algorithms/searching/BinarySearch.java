package com.oliverr.algorithms.searching;

public class BinarySearch {
    
    /**
     * <p>Binary Search searching algorithm.
     * <p>This algorithm only works in sorted arrays.
     * @param arr The array you want to search in
     * @param n The number to search
     */
    public int search(int[] arr, int n) {
        return search(arr, 0, arr.length - 1, n);
    }

    private int search(int arr[], int left, int right, int n) {
        // If we reach here then the element is not in the array
        if(left > right) return -1;
        
        // calculating the middle index
        int midIndex = left + (right - left) / 2;

        // If the element is at the middle of the array
        if (arr[midIndex] == n) return midIndex;

        // If the given element is smaller than the element at the midIndex, then it can only be in the left subarray
        if (arr[midIndex] > n) return search(arr, left, midIndex - 1, n);

        // Else the element can only be in right subarray
        return search(arr, midIndex + 1, right, n);
    }

}
