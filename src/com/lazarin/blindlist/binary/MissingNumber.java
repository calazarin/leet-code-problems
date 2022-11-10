package com.lazarin.blindlist.binary;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

    public static void main(String args[]){

        /*Input: nums = [3,0,1]
        Output: 2*/
       // System.out.println(missingNumber(new int[]{3,0,1}));

        /*Input: nums = [0,1]
        Output: 2*/
     //   System.out.println(missingNumber(new int[]{0,1}));

        /*Input: nums = [9,6,4,2,3,5,7,0,1]
        Output: 8*/
        System.out.println(missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}));

    }

    public static int missingNumber(int[] nums) {

        int[] check = new int[nums.length + 1];

        //n == nums.length
        for(int i = 0;  i < nums.length; i++){
            var number = nums[i];
            check[number] = 1;
        }
        for(int j = 0; j < check.length; j++){
            if(check[j] == 0) {
                return j;
            }
        }
        return 0;
    }

    public static int missingNumber2(int[] nums) {

        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++){
            if(nums[i] != i) return i;
        }
        return 0;
    }

    public static int missingNumber3(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(Integer n: numbers){
            numbers.add(n);
        }
        for(int i =0 ; i <= nums.length; i++){
            if(!numbers.contains(i)){
                return i;
            }
        }
        return  -1;
    }
}
