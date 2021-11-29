package com.company.Strings;

import java.util.ArrayList;

public class ASCII_Char {
    public static void main(String[] args) {
//      char ch='a';
//        System.out.println((int)(ch));
//        SubSeqAscii("","abc");
        System.out.println(SubSeqRetAscii("","abc"));
    }
    static void SubSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubSeqAscii(p+ch,up.substring(1));
        SubSeqAscii(p,up.substring(1));
        SubSeqAscii(p+(ch + 0),up.substring(1));

    }
    static ArrayList<String> SubSeqRetAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String > first= SubSeqRetAscii(p+ch,up.substring(1));
        ArrayList<String> second= SubSeqRetAscii(p,up.substring(1));
        ArrayList<String> third= SubSeqRetAscii(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
