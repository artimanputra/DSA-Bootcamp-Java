package com.company;

public class Comparison {
    public static void main(String[] args) {
        String a= "Arti";
        String b= "Arti";
        System.out.println(a==b);

        String name1 = new String("Arti1");
        String name2 = new String("Arti1");
//        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
    }
}
