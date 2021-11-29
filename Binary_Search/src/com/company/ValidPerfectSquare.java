package com.company;

public class ValidPerfectSquare {
    public static void main(String[] args) {
     boolean ans = isPerfectSquare(16);
        System.out.println(ans);
    }
    static boolean isPerfectSquare(int num) {
        int s =0;
        int e = num;

        while(s<=e){
            int mid = s +(e-s)/2;
            if(num<mid*mid){
                e = mid -1;
            }
            else if(num>mid*mid){
                s = mid+1;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
