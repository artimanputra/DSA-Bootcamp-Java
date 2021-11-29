package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();


        oddEven(a);
    }
    static  void oddEven(int a){
      if(a%2==0){
          System.out.println("It is even number");
      }
      else
      {
          System.out.println("It is Odd number");
      }
    }
}
