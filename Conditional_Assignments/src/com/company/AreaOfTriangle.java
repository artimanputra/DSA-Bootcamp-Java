package com.company;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base and height of triangle");
        int b = input.nextInt();
        int h = input.nextInt();
        float area = 0.5f *b*h;
        System.out.println("The area of circle is " +area);
    }
}
