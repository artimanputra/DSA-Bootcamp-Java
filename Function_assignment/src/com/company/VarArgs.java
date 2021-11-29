package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        Fun(10,20,30,40,50,60);
    }

    static  void Fun(int ...v){

        System.out.println(Arrays.toString(v));
    }
}
