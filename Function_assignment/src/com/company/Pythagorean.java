package com.company;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
         Triplet(a,b,c);
    }

    static  void Triplet(int x, int y, int z){
        if((x*x) + (y*y) == (z*z)){
            System.out.println("It is a triplet");
        }
        else{
            System.out.println("It is not a triplet");
        }
    }
}
