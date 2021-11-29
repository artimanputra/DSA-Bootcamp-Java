package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

//        Approch 1:-
//        int max =a;
//        if(b>a){
//            max = b;
//            System.out.println("Maximum is " +b);
//        }
//        else if(b>c){
//            max =b;
//            System.out.println("Maximum is " +b);
//        }
//        else if(c>a){
//            max = c;
//            System.out.println("Maximum is "+ c);
//        }
//        else{
//            System.out.println("Maximum is " + a);
//        }
        int max = Math.max(d,Math.max(c,Math.max(a,b)));
        System.out.println(max);

//        Approach 2:-
//        if(a>b && a>c){
//            System.out.println("Maximum is " +a);
//        }
//        else if(b>c){
//            System.out.println("Maximum is " +b);
//        }
//        else{
//            System.out.println("Maximum is " +c);
//        }
    }
}
