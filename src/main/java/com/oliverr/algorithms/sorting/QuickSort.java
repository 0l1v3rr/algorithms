package com.oliverr.algorithms.sorting;

public class QuickSort {
    
    /**
     * Quick Sort sorting algorithm.
     * @param arr The array to sort
     */
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int low, int high) {
        // base cases
        if(arr == null) return;
        if(arr.length < 2) return;
        if(low >= high) return;

        // choosing a pivot to work with
        int pivot = arr[high];

        // declaring the 2 pointers
        int leftPointer = low, rightPointer = high;

        // moving the elements of the array to the left of the pivot if it is less than that
        // moving the elements of the array to the right of the pivot if it is greater than that
        while(leftPointer < rightPointer) {
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            // swapping the arr[leftPointer] and the arr[rightPointer]
            swap(arr, leftPointer, rightPointer);
        }
        // swapping the arr[leftPointer] with the arr[high]
        swap(arr, leftPointer, high);

        // call this sort method recursively
        sort(arr, low, leftPointer - 1);
        sort(arr, leftPointer + 1, high);
    }

    // swapping method
    private void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}
