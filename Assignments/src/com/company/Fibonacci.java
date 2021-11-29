package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int f1 =0;
        int f2 =1;
        for (int i =0; i<=num; i++){

            System.out.println(f1 +",");
            int nextTerm = f1+f2;
                    f1=f2;
                    f2=nextTerm;

        }
    }
}
