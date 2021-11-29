package com.company.Array;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        //Q:- Linear search with recursion
        int[] arr= {1,2,5,5,3,5,7,};
//        System.out.println(search(arr,5, 0));
//        System.out.println(search2(arr,5, 0));
//        System.out.println(search3(arr,5, arr.length-1));
//        searchAllOcurrances(arr,8,0);
//        System.out.println(list);

//       ArrayList<Integer> ans =  searchAllOcurrances(arr,5,0,new ArrayList<>());
//        System.out.println(ans);

        System.out.println(searchAllOcurrances2(arr,5,0));
    }
    static boolean search(int[] arr,int target, int index){
        //base condition
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }

    static int search2(int[] arr,int target, int index){
        //base condition
        //if we want to return index
        if(index == arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return search2(arr,target,index+1);
    }
    static int search3(int[] arr,int target, int index){
        //base condition
        if(index == -1){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return search3(arr,target,index-1);
    }

    static ArrayList<Integer> list= new ArrayList<>();
    static void searchAllOcurrances(int[] arr,int target, int index){
        //Multiple Occurances
        //base condition
        //if we want to return index
        if(index == arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
         searchAllOcurrances(arr,target,index+1);
    }
    static ArrayList<Integer> searchAllOcurrances(int[] arr,int target, int index,ArrayList<Integer> list){
        //Multiple Occurances
        //base condition

        if(index == arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
         return searchAllOcurrances(arr,target,index+1,list);
    }
    static ArrayList<Integer> searchAllOcurrances2(int[] arr,int target, int index){
        //Multiple Occurances
        //base condition
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if (arr[index]==target){
            list.add(index);
        }
         ArrayList<Integer> ansBelowCalls = searchAllOcurrances2(arr,target,index+1);
        list.addAll(ansBelowCalls);
        return list;
    }





}
