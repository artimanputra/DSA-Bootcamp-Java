package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();

        float area = Area(r);
        float circum = Circumference(r);

        System.out.println("Area of circle is " +area);
        System.out.println("Circumference of circle is " +circum);
    }
    static float Area(float r){
        float area = 3.14f * r;
        return area;
    }

    static  float Circumference(float r){
        float circum = 2 * 3.14f * r;
        return  circum;
    }
}
