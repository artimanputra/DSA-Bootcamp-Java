package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr ={-8,-2,-1,0,2,45,66,87,99};
        int target = -2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if target not found

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            //find the middle element
//            int mid = (start + end)/2;// might be possible that (start + end) will exceeds the range of integer in java
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
