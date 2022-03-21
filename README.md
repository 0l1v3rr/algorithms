# Data Structures and Algorithms
My implementation of different Data Structures, Algorithms and simple coding challenges.

## Algorithms

### Sorting

- [Bubble Sort](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/sorting/BubbleSort.java)
  - This sorting algorithm repeatedly steps through the array, compares the elements, and swaps them if they are in the wrong order. This is repeated until the array is sorted.
  - **O(n^2)**
- [Insertion Sort](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/sorting/InsertionSort.java)
  - Insertion sort iterates, consuming one input element each repetition, and grows a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.
  - **O(n^2)**
- [Selection Sort](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/sorting/SelectionSort.java)
  - The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the beginning.
  - **O(n^2)**
- [Merge Sort](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/sorting/MergeSort.java)
  - Merge sort divides input array into two halves, recursively calls itself for the two halves, and merges the two sorted halves.
  - **O(n*log(n))**
- [Quick Sort](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/sorting/QuickSort.java)
  - This algorithm selects a pivot element into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
  - **O(n*log(n))**
- [Heap Sort](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/sorting/HeapSort.java)
  - Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the minimum element and place the minimum element at the beginning. We repeat the same process for the remaining elements.
  - **O(n*log(n))**

### Searching

- [Linear Search](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/searching/LinearSearch.java)
  -  This searching algorithm sequentially checks each element of the list until a match is found or the whole list has been searched.
  - **O(n)**
- [Binary Search](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/searching/BinarySearch.java)
  - Binary Search is a search algorithm that finds the position of a target value within a sorted array. Binary search compares the target value to the middle element of the array. If they are not equal, the half in which the target cannot lie is eliminated and the search continues on the remaining half. If the search ends with the remaining half being empty, the target is not in the array.
  - **O(log(n))**
- [Jump Search](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/searching/JumpSearch.java)
  - The jump search is a search algorithm for ordered lists. It works by first checking all items L<sub>km</sub>, where k∈ℕ  and m is the block size, until an item is found that is larger than the search key. To find the exact position of the search key in the list a linear search is performed on the sublist L<sub>[(k-1)m, km]</sub>.
  - **O(√n)**

## Data Structures
- [Dynamic Array](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/datastructures/ArrayList.java)
  - A dynamic array is an array with automatic resizing. A dynamic array expands as you add more elements. So you don't need to determine the size ahead of time.
- [Linked List](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/datastructures/LinkedList.java)
  - A linked list is a sequence of data structures, which are connected together via links. Linked List is a sequence of links which contains items. Each link contains a connection to another link.
- [Stack](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/datastructures/Stack.java)
  - A Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out).
- [Queue](https://github.com/0l1v3rr/algorithms/blob/master/src/main/java/com/oliverr/algorithms/datastructures/Queue.java)
  - A Queue is a linear structure which follows a particular order in which the operations are performed. The order is First In First Out (FIFO).