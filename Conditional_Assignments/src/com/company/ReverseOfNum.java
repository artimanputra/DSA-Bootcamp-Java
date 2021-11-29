package com.company;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
//        int n = 1234;
        int count=0;
        while(n>0){
            int rem = n%10;
            System.out.println(rem);
            count++;

            n = n/10;
        }
    }
}
