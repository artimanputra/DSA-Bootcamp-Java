package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



//       Max();
       Min();

    }

    static void Max() {
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c) {
            System.out.println("Max is " + a);
        } else if (b > c) {
            System.out.println("Max is " + b);
        } else {
            System.out.println("Max is " + c);
        }
    }
    static void Min() {
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a < b && a < c) {
            System.out.println("Min is " + a);
        } else if (b < c) {
            System.out.println("Min is " + b);
        } else {
            System.out.println("Min is " + c);
        }
    }
}
