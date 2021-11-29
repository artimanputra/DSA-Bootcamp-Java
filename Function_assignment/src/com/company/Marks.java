package com.company;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Marks(a);
    }

    static void Marks(int a){
        if(a>=91 && a<=100){
            System.out.println("Grades are AA");
        }
        else if(a>=81 && a<=90){
            System.out.println("Grades are AB");
        }
        else if(a>=71 && a<=80){
            System.out.println("Grades are BB");
        }
        else if(a>=61 && a<=70){
            System.out.println("Grades are BC");
        }
        else if(a>=51 && a<=60){
            System.out.println("Grades are CD");
        }
        else if(a>=41 && a<=50){
            System.out.println("Grades are DD");
        }
        else{
            System.out.println("Oops You are Fail");
        }

    }
}
