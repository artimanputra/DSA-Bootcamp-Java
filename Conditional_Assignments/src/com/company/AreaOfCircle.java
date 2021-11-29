package com.company;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius of circle");
        int r = input.nextInt();
        float area = 3.14f *r*r;
        System.out.println("The area of circle is " +area);
    }
}
