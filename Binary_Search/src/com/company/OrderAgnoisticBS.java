package com.company;

public class OrderAgnoisticBS {
    public static void main(String[] args) {
//        int[] arr ={-8,-2,-1,0,2,45,66,87,99};
        int[] arr ={99,67,55,54,34,22,10,5,3,1};
        int target = 10;
        int ans = orderAgnoisticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnoisticBS(int[] arr , int target){
        int start =0;
        int end = arr.length-1;

        //Find the whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        /*
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }
        */


        while(start<=end){
            //find the middle element
//            int mid = (start + end)/2;// might be possible that (start + end) will exceeds the range of integer in java
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }


        }
        return -1;
    }
}
