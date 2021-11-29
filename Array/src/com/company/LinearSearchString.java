package com.company;

public class LinearSearchString {
    public static void main(String[] args) {
        String str = "Aarti";
        char target = 'r';
        System.out.println(SearchString(str, target));
    }


    static boolean SearchString(String str , char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return  true;
            }
        }
        return false;
    }
    static boolean SearchString2(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch== target){
                return  true;
            }
        }
        return false;
    }


}
