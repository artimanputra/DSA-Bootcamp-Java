package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Bubble Sort
     int[] arr ={4,5,1,2,3};
     bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped= false;
            //for each step maximum item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped= true;
                }
            }
            //if you did not swapped for a particular value of i, it meance the array is sorted hence stop the for loop
            if(!swapped){ //!false = true;
                break;
            }
        }
    }
}
