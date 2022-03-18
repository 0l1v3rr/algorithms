package com.oliverr.algorithms.searching;

public class LinearSearch {
    
    /**
     * Linear Search searching algorithm.
     * @param arr The array you want to search in
     * @param n The number to search
     */
    public int search(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == n)
                return i;
        return -1;
    }

}
