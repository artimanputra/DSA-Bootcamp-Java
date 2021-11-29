package com.company;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        reversDigits(a);
    }
//    static void Palindrome(int a){
//        int count=0, n=0;
//        while (a>0){
//            n= a/10;
//            count ++;
//        }
//        if(a==n){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not");
//        }
//    }

    static void reversDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
//        return rev_num;
        if(rev_num==num){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }

}
