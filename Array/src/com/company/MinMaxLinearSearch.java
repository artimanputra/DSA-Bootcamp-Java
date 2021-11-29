package com.company;

public class MinMaxLinearSearch {
    public static void main(String[] args) {
        int[] arr={45,67,87,90,99,56,7};
        System.out.println(Min(arr));
        System.out.println(Max(arr));
    }

    static int Min(int[] arr){
        int MinVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<MinVal){
                MinVal = arr[i];
                return MinVal;
            }

        }

        return MinVal;
    }

    static int Max(int[] arr){
        int MaxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>MaxVal){
                MaxVal = arr[i];
                return MaxVal;
            }

        }

        return MaxVal;
    }
}
