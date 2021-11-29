package com.company;

public class MaxWealth {
    public static void main(String[] args) {
//        int[][] accounts = [[1,2,3],[3,2,1]];
        int[][] accounts ={
                {1,5},
                {3,2,1},
                {0,1}
        };
        System.out.println(MaximumWealth(accounts));
    }
    static int MaximumWealth(int[][] accounts){
        //person = row
        //account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++) {
             sum = sum+ accounts[person][account];
            }
            if(sum> ans){
                ans=sum;
            }
        }
        return  ans;
    }
}
