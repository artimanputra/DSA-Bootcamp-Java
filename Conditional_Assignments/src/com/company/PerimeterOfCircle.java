package com.company;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius of circle");
        int r = input.nextInt();
        float per = 2*3.14f *r;
        System.out.println("The perimeter of circle is " +per);
    }
}
