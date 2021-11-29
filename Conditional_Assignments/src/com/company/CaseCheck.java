package com.company;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = input.next().trim().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println(ch +" is lowercase caharacter");
        }
        else {
            System.out.println(ch +" is Upperercase caharacter");
        }
    }
}
