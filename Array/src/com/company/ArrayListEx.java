package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList <Integer> List= new ArrayList<Integer>(10);

        Scanner in = new Scanner(System.in);
//        List.add(34);
//        List.add(340);
//        List.add(314);
//        List.add(354);
//        List.add(3540);

//        System.out.println(List.contains(34)); //True
//        System.out.println(List.contains(347)); //False

//        System.out.println(List);
//        List.set(0, 99);
//        List.remove(3);
//        System.out.println(List);

        System.out.println("Enter 5 integers");
        for (int i = 0; i < 5; i++) {
            List.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(List.get(i));
        }

        System.out.println(List +" ");
    }
}
