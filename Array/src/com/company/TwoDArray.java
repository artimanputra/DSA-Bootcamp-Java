package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//        int[][] arr = new int[3][];

//        int[][] arr2D ={
//                {1,2,3},
//                {4,5},
//                {3,4,7}
//        };
        Scanner in= new Scanner(System.in);
        int [][] arr = new int[3][3];
        //Input 2DArray
        for (int row= 0; row < arr.length; row++) {
           //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //Output 2dArray
//        for (int row= 0; row < arr.length; row++) {
//           //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for (int row= 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
