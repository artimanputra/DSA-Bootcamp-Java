package com.company;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if(n ==0){
            return;
        }
        System.out.println(n);
//        n-- vs --n
//        fun(n--);  //this will give a stackoverflow error
        fun(--n);
    }
}
