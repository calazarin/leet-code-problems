package com.lazarin.practicing.leetcode.heap.easy;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class MaximumProductOfTwoElementsInAnArray {

    //approach 1 - max heap
    //T: O(N); S:O(N)
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(int n : nums){
            maxHeap.offer(n);
        }

        int num1 = maxHeap.poll();
        int num2 = maxHeap.poll();

        return (num1 - 1) * (num2 - 1);
    }

    //approach 2 - find the largest and the second largest
    public int maxProduct_2(int[] nums) {
        // Initialize
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the two largest elements.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                // If the current element is greater than the largest, update both largest and secondLargest.
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest) {
                // If the current element is greater than the second largest, update only secondLargest.
                secondLargest = nums[i];
            }
        }

        // Calculate the maximum product of two largest elements minus 1.
        int ans = (largest - 1) * (secondLargest - 1);
        return ans;
    }

    //approach 3 - sorting the input array
    public int maxProduct_3(int[] nums) {

        Arrays.sort(nums);
        int x = nums[nums.length - 1];
        int y = nums[nums.length - 2];

        return (x - 1) * ( y - 1);
    }
}
