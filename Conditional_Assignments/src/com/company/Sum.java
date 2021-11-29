package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;

        while (true) {
            int n = in.nextInt();
            ans = ans +n;
            if(n ==0){
                break;
            }

        }
        System.out.println(ans);


    }
}
