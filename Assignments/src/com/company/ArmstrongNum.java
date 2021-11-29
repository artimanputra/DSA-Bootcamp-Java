package com.company;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        while(num>0){
            int r = num%10;
            int sum = (r*r*r);
            num= num/10;
            if(sum ==num){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not ");
            }
        }
    }
}
