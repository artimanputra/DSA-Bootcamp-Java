package com.company;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num  = input.nextInt();
         for (int i = 1 ; i<=10 ;i++){
             System.out.println(i*num);
         }
    }
}
