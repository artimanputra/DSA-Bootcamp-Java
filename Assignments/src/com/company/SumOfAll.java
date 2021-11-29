package com.company;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");

        int x =0;
        int sum =0;
        for (int i =0; i<=x; i++){
           x  = input.nextInt();

           sum = sum +i;
        }
        System.out.println(sum);
    }
}
