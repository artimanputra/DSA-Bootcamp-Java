package com.company;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int num = Prime(a, b);
    }
    static int Prime(int a, int b){
        int sum=0;
        for (int i = a; i < b; i++) {

        }
        return sum;
    }
}
