package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr , maxIndex,last);
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int MaxVal = start;
        for (int i = start; i <= end ; i++) {
            if(arr[MaxVal] < arr[i]){
                MaxVal =i;
            }
        }
        return MaxVal;
    }
}
