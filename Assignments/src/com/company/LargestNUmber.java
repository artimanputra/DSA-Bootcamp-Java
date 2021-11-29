package com.company;

import java.util.Scanner;

public class LargestNUmber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("Maximum is " + num1);
        }
        else{
            System.out.println("Maximum is "+ num2);
        }
    }
}
