package com.company;

public class EvenDigits {
    public static void main(String[] args) {
      int[] nums = {2,45,667,123,1674,65};
//        System.out.println(findNumbers(nums));
//        System.out.println(digits(-5475));
        System.out.println(digits2(23456));
    }

    static  int findNumbers(int[] nums){
        int count =0;
        for(int num : nums){
            if(Even(num)){
                count++;
            }
        }
        return count;
    }

     //Function to check whether a number contains even digits or not
    static boolean Even(int num){
     int NumberOfDigits = digits(num);
     /*
     if(NumberOfDigits %2==0){
         return true;
     }
     */
      return NumberOfDigits % 2==0;
    }
    //count number of digits in a number
    static int digits(int num){
        int count =0;
        if(num<0){
            num = num * -1;
        }

        if(num==0){
            return 1;
        }
     while(num>0){
     count++;
     num=num/10;
     }
     return count;
    }

    static int digits2(int num){
        if(num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) +1;
    }
}
