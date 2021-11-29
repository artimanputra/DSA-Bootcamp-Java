package com.company;

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side of triangle");
        int r = input.nextInt();
        float area = 0.5f *r*r;
        System.out.println("The area of isosceles triangle is " +area);
    }
}
