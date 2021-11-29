package com.company;

import java.util.Scanner;

public class DistBetTwoPts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x1, x2, y1 & y2 coordinates");
//        int x1 = in.nextInt();
//        int x2 = in.nextInt();
//        int y1 = in.nextInt();
//        int y2 = in.nextInt();
//        double result = Math.sqrt(((x2 - x1)*(x2 - x1)) +((y2 - y1)*(y2 - y1)));
//        System.out.println("Distance between two points is " +result);

//Power in java
        int a = in.nextInt();
        int b = in.nextInt();
        double pow = Math.pow(a,b);
        System.out.println(pow);
    }
}
