package com.company;

public class MaxArray {
    public static void main(String[] args) {
        int arr[]= {1,23,45,72,82};

//        System.out.println(Max(arr));
        System.out.println(MaxRange(arr,1,3));
    }

    static int Max(int[] arr){
        int MaxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>MaxVal){
                MaxVal = arr[i];
            }

        }
        return MaxVal;
    }
    static int MaxRange(int[] arr, int start, int end){
        int MaxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>MaxVal){
                MaxVal = arr[i];
            }

        }
        return MaxVal;
    }
}
