package com.company.Array;

public class SortedArrray {
    public static void main(String[] args) {
        //Q:- Find if array is sorted or not
        int[] arr= {1,2,5,3,6,7,};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index){
        //base condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
