package com.company.Strings;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
//       Permutation("", "abc");
        System.out.println(PermutationList("","abcd"));
        System.out.println(PermutationCount("","abcd"));
    }
    static void Permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first= p.substring(0,i);
            String second= p.substring(i,p.length());
            Permutation(first + ch+ second, up.substring(1));
        }
    }
    static ArrayList<String> PermutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first= p.substring(0,i);
            String second= p.substring(i,p.length());
            ans.addAll(PermutationList(first + ch+ second, up.substring(1)));
        }
        return ans;
    }
      //to return number of permutation
    static int PermutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count =0;
        for (int i = 0; i <= p.length(); i++) {
            String first= p.substring(0,i);
            String second= p.substring(i,p.length());
            count= count+ PermutationCount(first + ch+ second, up.substring(1));
        }
        return  count;
    }
}
