package com.company;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println('a');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        //after some steps it is same as "a" + "1"
        //when integer is concatenated with string it will be converted into wrapper class Integer

        System.out.println("Arti" + new ArrayList<>());
        System.out.println("Arti" + new Integer(56));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
