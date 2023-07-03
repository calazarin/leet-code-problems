package com.lazarin.practicing.leetcode.backtracking.easy;

//https://leetcode.com/problems/sum-of-all-subset-xor-totals/
public class SumOfAllSubsetXORTotals {

    public static void main(String args[]){

        SumOfAllSubsetXORTotals problemSolver = new SumOfAllSubsetXORTotals();

      /*  Input: nums = [1,3]
        Output: 6
        Explanation: The 4 subsets of [1,3] are:
        - The empty subset has an XOR total of 0.
                - [1] has an XOR total of 1.
                - [3] has an XOR total of 3.
                - [1,3] has an XOR total of 1 XOR 3 = 2.
        0 + 1 + 3 + 2 = 6*/
        System.out.println(problemSolver.subsetXORSum(new int[]{1, 3}));

        /*Input: nums = [5,1,6]
        Output: 28
        Explanation: The 8 subsets of [5,1,6] are:
        - The empty subset has an XOR total of 0.
                - [5] has an XOR total of 5.
                - [1] has an XOR total of 1.
                - [6] has an XOR total of 6.
                - [5,1] has an XOR total of 5 XOR 1 = 4.
                - [5,6] has an XOR total of 5 XOR 6 = 3.
                - [1,6] has an XOR total of 1 XOR 6 = 7.
                - [5,1,6] has an XOR total of 5 XOR 1 XOR 6 = 2.
        0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28*/

        System.out.println(problemSolver.subsetXORSum(new int[]{5, 1, 6}));

        /*
        Input: nums = [3,4,5,6,7,8]
        Output: 480
        Explanation: The sum of all XOR totals for every subset is 480.*/
        System.out.println(problemSolver.subsetXORSum(new int[]{3,4,5,6,7,8}));
    }

    /**
     * approach 1 - using backtracking
     * when considering a state space, have in mind we have 2 options (user or not use a given number)
     */
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int index, int currentXor) {
        // return currentXor when all elements in nums are already considered
        if (index == nums.length) return currentXor;

        // calculate sum of xor with current element
        int withElement = helper(nums, index + 1, currentXor ^ nums[index]);

        // calculate sum of xor without current element
        int withoutElement = helper(nums, index + 1, currentXor);

        // return sum of xors from recursion
        return withElement + withoutElement;
    }
}
