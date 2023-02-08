package com.lazarin.blindlistandmore.arrays.easy;


//https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSumQueryImmutable {

    public static void main(String args[]){

      /*  Input:
        ["NumArray", "sumRange", "sumRange", "sumRange"]
        [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
        Output:
        [null, 1, -1, -3]

        Explanation:
        NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
        numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
        numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
        numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

        */
        NumArray n = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(n.sumRange(0, 2));
        System.out.println(n.sumRange(2, 5));
        System.out.println(n.sumRange(0, 5));

    }

    private static class NumArray{

        int[] sums;

        public NumArray(int[] nums) {
            //first sum up inputs
            sums = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
        }

        //best approach to sum range = cumulative sum
        //T: O(1)
        public int sumRange(int i, int j) {
            var a = sums[j + 1];
            var b = sums[i];
            return b - a;
        }
    }
}
