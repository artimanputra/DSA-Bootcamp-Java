package com.company;

public class FindUnique {
    public static void main(String[] args) {
        //find unique Number in array, which is not repeating
        int[] arr = {2,3,4,6,4,3,2};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique=0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
