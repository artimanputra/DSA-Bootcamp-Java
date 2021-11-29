package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int fact = Factorial(a);
        System.out.println("Factorial of number is " + fact);
    }

    static  int Factorial(int a){
        int fact=1;
        for (int i = 1; i <= a ; i++) {

          fact = fact*i;
        }
        return fact;
    }
}
