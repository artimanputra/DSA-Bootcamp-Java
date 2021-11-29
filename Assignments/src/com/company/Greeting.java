package com.company;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
         String name = input.next();
        System.out.println("Hello there " + name);
    }
}
