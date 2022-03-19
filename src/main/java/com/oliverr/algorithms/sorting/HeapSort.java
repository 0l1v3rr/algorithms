package com.oliverr.algorithms.sorting;

public class HeapSort {
    
    /**
     * Heap Sort sorting algorithm.
     * @param arr The array to sort
     */
    public void sort(int[] arr) {
        // base cases
        if(arr == null) return;
        if(arr.length < 2) return;

        // building the heap
        int len = arr.length;

        // calling the heapify method
        for(int i = len / 2 - 1; i >= 0; i--)
            heapify(arr, len, i);

        // extracting the elements from the heap
        for(int i = len - 1; i >= 0; i--) {
            // swapping the current element with the 0th one
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // calling heapify method
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        // initializing the largest
        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;
 
        // if the left child is larger than the root
        if (left < n && arr[left] > arr[largest]) largest = left;
 
        // if the right child is larger than the largest
        if (right < n && arr[right] > arr[largest]) largest = right;
 
        // if the largest is not equal to i
        if (largest != i) {
            // swapping arr[i] with arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
 
            // recursively call heapify
            heapify(arr, n, largest);
        }
    }

}
