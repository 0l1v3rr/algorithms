package com.oliverr.algorithms.searching;

public class JumpSearch {
    
    /**
     * <p>Jump Search searching algorithm.
     * <p>This algorithm only works in sorted arrays.
     * @param arr The array you want to search in
     * @param n The number to search
     */
    public int search(int[] arr, int n) {
        
        // getting the length of the array
        int len = arr.length;
 
        // finding the block size to be jumped (the square root of the length of the array)
        int step = (int)Math.floor(Math.sqrt(len));
 
        // finding the block where the element is
        int prev = 0;
        while (arr[Math.min(step, len)-1] < n) {
            prev = step;
            // increasing step by the square root of the length of the array
            step += (int)Math.floor(Math.sqrt(len));

            // if prev is greater or equal than the length of the array, then n is not in the array
            if (prev >= len) return -1;
        }
 
        // linear searching for n in the block
        while (arr[prev] < n) {
            prev++;
            // if we reach here, n is not in the array
            if (prev == Math.min(step, len)) return -1;
        }
 
        // if n is found
        if (arr[prev] == n) return prev;
 
        return -1;
    }

}
