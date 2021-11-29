package com.company;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        Vote(age);
    }
    static void Vote(int age){
        if(age>=18){
            System.out.println("Hureehh!! You are eligible for voting");
        }
        else{
            System.out.println("So sad !You are not eliegible for voting");
        }
    }
}
