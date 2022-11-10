package com.lazarin.blindlist.arrays.medium;

public class MaxContiguousSubarraySum {

    public static void main(String args[]){
      /*  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.*/
       System.out.println(maxContiguousSubarraySum2(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        /*Input: nums = [1]
        Output: 1*/
      //  System.out.println(maxContiguousSubarraySum2(new int[]{1}));

      /*  Input: nums = [5,4,-1,7,8]
        Output: 23*/
        //System.out.println(maxContiguousSubarraySum2(new int[]{5,4,-1,7,8}));

    }

    //O(n) time complexity
    //O(1) space complexity
    public static int maxContiguousSubarraySum(int[] nums)
    {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            // Did we beat the 'maxSoFar' with the 'maxEndingHere'?
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

        }
        return maxSoFar;
    }

    //brute force solution O(n^2)
    public static int maxContiguousSubarraySum2(int[] nums)
    {
        var maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            var currentSum = 0;
            for(int j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

        }
        return maxSum;
    }
}
