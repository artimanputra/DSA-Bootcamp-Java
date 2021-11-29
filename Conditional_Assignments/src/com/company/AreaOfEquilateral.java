package com.company;

import java.util.Scanner;

public class AreaOfEquilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side of triangle");
        int a = input.nextInt();
        float area = (1.732f/4) *a*a;
        System.out.println("The area of circle is " +area);
    }
}
