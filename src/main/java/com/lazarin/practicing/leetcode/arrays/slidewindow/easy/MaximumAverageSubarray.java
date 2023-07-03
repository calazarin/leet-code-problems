package com.lazarin.practicing.leetcode.arrays.slidewindow.easy;

//https://leetcode.com/problems/maximum-average-subarray-i
public class MaximumAverageSubarray {

    public static void main(String args[]){
        MaximumAverageSubarray solution = new MaximumAverageSubarray();
       /* Input: nums = [1,12,-5,-6,50,3], k = 4
        Output: 12.75000*/
        System.out.println(solution.findMaxAverage2(new int[]{1, 12, -5, -6, 50, 3}, 4));

       /* Input: nums = [5], k = 1
        Output: 5.00000*/
        System.out.println(solution.findMaxAverage2(new int[]{5}, 1));

        /* Input: nums = [-1], k = 1
        Output: -1.00000*/
        //System.out.println(solution.findMaxAverage(new int[]{-1}, 1));
    }

    // approach 1 - not too much optimal
    public double findMaxAverage(int[] nums, int k) {
        int leftP = 0, rightP = leftP + (k - 1);
        double maxAvg = Double.NEGATIVE_INFINITY;
        int i = leftP;
        while(rightP < nums.length){
            double currSum = nums[i];
            while(i < rightP) {
                currSum += nums[i + 1];
                i++;
            }
            double currAvg = currSum / k;
            maxAvg = Math.max(maxAvg, currAvg);
            leftP++;
            rightP++;
            i = leftP;
        }
        return maxAvg;
    }

    /**
     * approach 2 - splidding window; more optimal, linear time
     * T: O(n)
     * S: O(1)
     **/
    public double findMaxAverage2(int[] nums, int k) {

        double globalMax = Double.NEGATIVE_INFINITY; // Decision holder, which will be compared against localMax
        double localMax = 0; // Sum of one group of k elements


        // Iterate through the whole array elements
        for (int i = 0; i < nums.length; ++i) {

            // Add up all k elements of a particular group
            localMax += nums[i];
            // If k number of elements are summed up
            // check whether their average is greater than the max average so far
            if (i >= k - 1) {
                // if so, new max average will be assigned
                globalMax = Math.max(globalMax, localMax / k);
                // In order to calculate new k number of elements
                // remove first value of 1....k elements from the localMax
                int indexToRemove = i - k + 1;
                localMax -= nums[indexToRemove];
            }
        }
        // Going to be maximum average
        return globalMax;
    }
}
