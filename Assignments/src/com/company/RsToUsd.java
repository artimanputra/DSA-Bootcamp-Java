package com.company;

import java.util.Scanner;

public class RsToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Rupees");
        int Rs = input.nextInt();

        float Usd = Rs/61.06f;
        System.out.println("Dollars you have are " + Usd) ;
    }
}
