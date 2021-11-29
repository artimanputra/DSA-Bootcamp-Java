package com.company;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length and breadth of rectangle");
        int l = input.nextInt();
        int b = input.nextInt();
        float area = l*b;
        System.out.println("The area of circle is " +area);
    }
}
