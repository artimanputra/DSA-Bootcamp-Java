package com.company;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius and height of cone");
        int r = input.nextInt();
        int h = input.nextInt();
        float Vol = (3.14f*r*r*h)/3;
        System.out.println("The Volume of cone is " +Vol);
    }
}
