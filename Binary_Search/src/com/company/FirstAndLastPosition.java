package com.company;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosition {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
       //check for first occurrence if target first
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int search(int[] nums, int target, boolean FirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        //check for first occurrence of target first
        while(start<=end){
            //find the middle element
//            int mid = (start + end)/2;// might be possible that (start + end) will exceeds the range of integer in java
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid +1;
            }
            else{
                //potential ans found
                ans = mid;
                if(FirstIndex){
                    end = mid -1;
                }
                else{
                    start= mid +1;
                }
            }
        }
        return ans;
    }
}
