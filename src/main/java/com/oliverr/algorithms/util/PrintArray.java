package com.oliverr.algorithms.util;

public class PrintArray {

    public static void printArray(int[] arr) {
        System.out.println(stringArray(arr));
    }

    public static String stringArray(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length-1; i++)
            sb.append(arr[i]).append(", ");
        sb.append(arr[arr.length - 1]);

        return sb.toString();
    }

}
