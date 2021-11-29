package com.company.Strings;

public class SkipCharacter {
    public static void main(String[] args) {
//        skip("", "bcaadda");
        System.out.println(skip2("bcaadd"));
        System.out.println(skipString("bcapplegf"));
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip2(String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return "";
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return skip2(up.substring(1));
        }
        else{
            return ch+ skip2(up.substring(1));
        }
    }
    static String skipString(String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return "";
        }
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }
        else{
            return up.charAt(0)+ skipString(up.substring(1));
        }
    }
}
