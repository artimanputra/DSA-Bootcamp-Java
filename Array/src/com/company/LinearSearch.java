package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,56,788,99,89,76,56,45};
        int target = 88;
        System.out.println(linearSearch(arr,target));

    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return  -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
               return i;
            }
        }
        return -1;
    }
    //search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length==0){
            return  -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0){
            return  false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
