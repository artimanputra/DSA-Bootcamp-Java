package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();

        if(year%4==0 || year%400==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " This is Not leap year");
        }
    }
}
