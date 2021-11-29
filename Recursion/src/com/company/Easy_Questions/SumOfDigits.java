package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int n =1234;
        int ans = digits(n);
        System.out.println(ans);
    }

    static int digits(int n) {
        if(n==0){
            return 0;
        }
        return (n%10) + digits(n/10) ;
    }
}
