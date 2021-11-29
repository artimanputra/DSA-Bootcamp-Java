package com.company;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float discount = in.nextFloat();
        float ListPrice = in.nextFloat();
        float DiscPer= (discount/ListPrice)*100;
        System.out.println("Discount on a product is " + discount +"%");

    }
}
