package com.company;

public class InfiniteArray {
    public static void main(String[] args) {
    int [] arr = {3, 5, 7 , 9 ,10, 45,67,88, 99};
    int target = 10;
        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr, int target){
        //first find the range
        //start with the box size of 2
        int start =0;
        int end = 1;

        //condition for the target to lie in the range
        while(target > arr[end]){
            int new_start = end +1;
            //double the box value
            //end = previous end + sizeOfBox*2;
            end = end + (end = start +1) * 2;
            start = new_start;
        }
        return binarySearch(arr, target,start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
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
