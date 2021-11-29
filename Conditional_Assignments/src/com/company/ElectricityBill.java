package com.company;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Power and Time");
        float P = in.nextFloat();
        float t = in.nextFloat();

        float Elec = (P*t)/1000;
        System.out.println("Electrical Consumption is " + Elec);
    }
}
