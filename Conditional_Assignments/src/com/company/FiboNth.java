package com.company;

import java.util.Scanner;

public class FiboNth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Nth number");
        int n = input.nextInt();
        int a =0;
        int b =1;
        int count =2;
        while(count<=n){
            int temp = b;
            b+=a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }
}
