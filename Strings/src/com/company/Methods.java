package com.company;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Arti Manputra";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('t'));

        System.out.println("          Arti    ".strip());
        System.out.println(Arrays.toString(name.split("r")));
    }
}
