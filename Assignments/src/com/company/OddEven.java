package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num  = input.nextInt();
        if(num%2==0){
            System.out.println(num +" it is even");
        }
        else{
            System.out.println(num +" it is odd");
        }
    }
}
