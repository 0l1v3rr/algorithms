package com.oliverr.algorithms.sorting;

public class SelectionSort {
    
    /**
     * Selection Sort sorting algorithm.
     * @param arr The array to sort
     */
    public void sort(int[] arr) {
        // base cases
        if(arr == null) return;
        if(arr.length < 2) return;

        // firstly, we iterate through the array using a for loop
        // the loop starts from 0 and runs until 'i' is less than arr.length - 1
        for(int i = 0; i < arr.length - 1; i++) {
            // setting a variable to store the min index
            int minIndex = i;

            // searching the lowest element inside the remaining array and storing its index
            for(int j = i + 1; j < arr.length; j++)
                if(arr[minIndex] > arr[j]) 
                    minIndex = j;

            // swapping the arr[i] and the arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
