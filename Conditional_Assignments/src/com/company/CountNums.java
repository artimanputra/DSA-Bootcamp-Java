package com.company;

public class CountNums {
    public static void main(String[] args) {
        int n = 1233456;
        int count =0;

        while (n>0){
            int rem = n%0;
            if(rem == 3){
                count++;
            }
            n= n/10;
        }
        System.out.println(count);
    }
}
