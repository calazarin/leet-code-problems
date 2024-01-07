package com.lazarin.practicing.leetcode.binarysearch.easy;

import java.util.Arrays;

//https://leetcode.com/problems/longest-subsequence-with-limited-sum/description/
public class LongestSubsequenceWithLimitedSum   {

    /**
     * approach
     * sort, prefix sum, then binary search find the position we can exceed
     * why prefix sum? it is always better to take the smallest elements to have a bigger subsequence
     * T: O(mlogn + n) where n is the nums size and m the queries size
     * O: O(N)
     */
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        //binary search
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int index = binarySearch(queries[i], prefixSum);
            ans[i] = index + 1; //sum 1 because array is 0-indexed
        }

        return ans;

    }

    private int binarySearch(int val, int[] arr){
        int start = 0, end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] == val) {
                return mid;
            } else if(arr[mid] > val){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //returning index needs to be less or equal to val
        if(arr[mid] > val){
            return mid - 1;
        }
        return mid;
    }

    /**
     * approach 2 - prefix sum without binary search
     * T: O(nm)
     * S: O(1)
     */
    public int[] answerQueries_2(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int size = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= queries[i]) {
                    queries[i] -= nums[j];
                    size++;
                } else {
                    break;
                }
            }
            ans[i] = size;
        }
        return ans;
    }
}
