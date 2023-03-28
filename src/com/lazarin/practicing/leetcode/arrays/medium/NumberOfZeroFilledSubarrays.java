package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/number-of-zero-filled-subarrays/
public class NumberOfZeroFilledSubarrays {

    public static void main(String args[]) {

        /*Input: nums = [1,3,0,0,2,0,0,4]
        Output: 6
        Explanation:
        There are 4 occurrences of [0] as a subarray.
        There are 2 occurrences of [0,0] as a subarray.
        There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.*/
        System.out.println(zeroFilledSubarray(new int[]{1,3,0,0,2,0,0,4}));

      /*  Input: nums = [0,0,0,2,0,0]
        Output: 9
        Explanation:
        There are 5 occurrences of [0] as a subarray.
        There are 3 occurrences of [0,0] as a subarray.
        There is 1 occurrence of [0,0,0] as a subarray.
        There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.*/
        System.out.println(zeroFilledSubarray(new int[]{0,0,0,2,0,0}));

        /*Input: nums = [2,10,2019]
        Output: 0
        Explanation: There is no subarray filled with 0. Therefore, we return 0.*/
        System.out.println(zeroFilledSubarray(new int[]{2,10,2019}));
    }

    //T: O(n)
    //S: (1)
    public static long zeroFilledSubarray(int[] nums) {

        int pointer = 0;
        long result = 0;

        while(pointer < nums.length){
            int counter = 0;

            while(pointer < nums.length && nums[pointer] == 0){
                counter++;
                pointer++;
                result+=counter;
            }

            pointer++;
        }

        return result;
    }

    //other way of coding it
    // T: O(n)
    //S: (1)
    public static long zeroFilledSubarray2(int[] nums) {

        long result = 0;
        int counter = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                counter++;
            } else {
                counter = 0;
            }
            result += counter;
        }
        return result;
    }
}