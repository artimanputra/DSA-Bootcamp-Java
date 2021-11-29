package com.company;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side of triangle");
        int a = input.nextInt();
        int b = input.nextInt();
        float per = 2*(a+b);
        System.out.println("The perimeter of triangle is " +per);
    }
}
