package com.company;

import javax.swing.*;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day");
//        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wenesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            default -> System.out.println("Wrong day");
//        }

        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1:
                System.out.println("Arti");
                break;
            case 2:
                System.out.println("Pavan");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT management");
                    case "CS" -> System.out.println("CS department");
                    default -> System.out.println("No value");
                }
                break;
            default:
                System.out.println("No value");
                break;
        }
    }
}
