package com.company;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a breadth,length and height of prism");
        int b = input.nextInt();
        int l = input.nextInt();
        int h = input.nextInt();
        float Vol = 0.5f*b*h*l;
        System.out.println("The Volume of cone is " +Vol);
    }
}
