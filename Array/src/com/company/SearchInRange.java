package com.company;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr={1,56,788,99,89,76,56,45};
//        int target = 88;

        int[] arr = new int[5];
        System.out.println("ENter array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the element you want to find");
        int target = in.nextInt();

        System.out.println("Enter the starting and ending index");
        int start= in.nextInt();
        int end= in.nextInt();

        System.out.println(linearSearch(arr,target,start,end));

    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return  -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
