package com.company;

import java.util.Arrays;

public class SearchIn2DArrays {

    public static void main(String[] args) {
        int[][] arr= {
                {10,35,66},
                {34,99,87,78},
                {23,56,78}
        };

        int target = 99;

        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
    return new int[]{-1,-1};
    }
}
