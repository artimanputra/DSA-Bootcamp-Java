package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Principal value, Rate and Year");
        int P = input.nextInt();
        int Y = input.nextInt();
        float R = input.nextFloat();

        float Si = P*R*Y;
        System.out.println("Simple Interest is " + Si);

    }
}
