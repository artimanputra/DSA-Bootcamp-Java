package com.company;

import java.util.Scanner;

public class InputPri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollNo = input.nextInt();
        System.out.println("Your roll number is " + rollNo);
    }
}
