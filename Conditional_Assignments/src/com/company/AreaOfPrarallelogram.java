package com.company;

import java.util.Scanner;

public class AreaOfPrarallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base and height");
        int b = input.nextInt();
        int h = input.nextInt();
        float area = b*h;
        System.out.println("The area of circle is " +area);
    }
}
