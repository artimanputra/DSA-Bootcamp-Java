package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        //Break down into smaller problems
//        System.out.println(fibo(50));
        for (int i = 0; i < 10; i++) {
            System.out.println(FiboFormula(i));
        }
//        System.out.println(FiboFormula(50));
    }
    static int FiboFormula(int n){
       return (int)(Math.pow(((1 + Math.sqrt(5))/2), n)/ Math.sqrt(5));
    }
    static int fibo(int n){
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
