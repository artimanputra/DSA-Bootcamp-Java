package com.company;

public class OddEven {

    public static void main(String[] args) {
	// write your code here
        int  n =87;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) ==1;
    }
}
