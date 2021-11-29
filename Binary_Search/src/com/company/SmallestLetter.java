package com.company;

public class SmallestLetter {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target < letters[mid]){
                end = mid -1;
            }
            else if(target > letters[mid]){
                start = mid +1;
            }

        }
        //when while loop breaks start = end + 1
        //next big number when No answer is found = start
        return letters[start %letters.length];
    }
}
