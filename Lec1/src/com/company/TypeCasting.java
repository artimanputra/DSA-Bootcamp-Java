package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//         float num = input.nextFloat();
//        type casting
//        int num = (int)(23.45f);
//        System.out.println(num);

//        Automatic type promotion in expresions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a = 20;
//        byte b = 20;
//        byte c = 100;
//        int sum = a*b/c;
//        System.out.println(sum);

//        byte b =40;
//        b = b *2;
//         int number = 'A';
//        System.out.println(number);

//        Unicode values
//        System.out.println("नमस्ते");

        byte b = 42;
        char c ='A';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 01234d;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b) +" "+ (i/c)+" " + (d*s));
        System.out.println(result);
    }
}
