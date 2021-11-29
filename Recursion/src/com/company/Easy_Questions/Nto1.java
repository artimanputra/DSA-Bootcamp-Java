package com.company;

public class Nto1 {
    public static void main(String[] args) {
        int n= 5;
//        System.out.println(Fun(n));
//        Fun(5);
//        FunReverse(5);
        FunNto1and1toN(5);
    }


     static void Fun(int n) {
         if (n == 0) {
//             System.out.println(5);
             return;
         }
         System.out.println(n);
         Fun(n-1);
    }
    static void FunReverse(int n) {
         if (n == 0) {
//             System.out.println(5);
             return;
         }

        FunReverse(n-1);
        System.out.println(n);
    }
    static void FunNto1and1toN(int n) {
         if (n == 0) {
//             System.out.println(5);
             return;
         }
        System.out.println(n);
        FunReverse(n-1);
        System.out.println(n);
    }
}
