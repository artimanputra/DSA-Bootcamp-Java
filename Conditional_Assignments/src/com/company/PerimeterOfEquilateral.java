package com.company;

import java.util.Scanner;

public class PerimeterOfEquilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side of triangle");
        int r = input.nextInt();
        float per = 3*r;
        System.out.println("The perimeter of triangle is " +per);
    }
}
