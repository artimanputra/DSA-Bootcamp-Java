package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

//        for (int j : arr) {
//            System.out.print(j + " "); //here j represents elements in the array
//        }

        System.out.println(Arrays.toString(arr));
    }
}
