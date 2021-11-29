package com.company;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int mult = Multi(a,b);
        System.out.println("Product of two numbers is " +mult);
    }

    static int Multi(int x, int y){
       int fact = x*y;
       return fact;
    }
}
