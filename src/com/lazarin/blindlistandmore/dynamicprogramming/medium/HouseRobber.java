package com.lazarin.blindlistandmore.dynamicprogramming.medium;

public class HouseRobber {

    //https://leetcode.com/problems/house-robber/
    public static void main(String args[]){

      /*  Input: nums = [1,2,3,1]
        Output: 4
        Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
        Total amount you can rob = 1 + 3 = 4.*/
        System.out.println(rob(new int[]{1, 2, 3, 1}));

      /*  Input: nums = [2,7,9,3,1]
        Output: 12
        Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
        Total amount you can rob = 2 + 9 + 1 = 12.*/
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));

        System.out.println(rob(new int[]{0}));
    }

    /*public static int rob(int[] nums) {

        int rob1 = 0, rob2 = 0;

        for(int n: nums){
            int temp = Math.max(n + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;
    }*/

    public static int rob(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < dp.length; i++){
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length-1];
    }

}
