package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/max-number-of-k-sum-pairs
public class MaxNumberOfKsumPairs {

    public static void main(String args[]){

        MaxNumberOfKsumPairs solution = new MaxNumberOfKsumPairs();
        /*Input: nums = [3,1,3,4,3], k = 6
        Output: 1*/
        System.out.println(solution.maxOperations2(new int[]{3,1,3,4,3}, 6));

        /*Input: nums = [1,2,3,4], k = 5
        Output: 2*/
        System.out.println(solution.maxOperations3(new int[]{1,2,3,4}, 5));
    }

    //approach 1
    //T: O(n^2)
    //S: O(n)
    public int maxOperations(int[] nums, int k) {
        int counter = 0;
        boolean[] rn = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++){

            if(rn[i]) continue;

            for(int j = i + 1; j < nums.length; j++){

                if(nums[i] + nums[j] == k && !rn[i] && !rn[j]){
                    counter++;
                    rn[i] = true;
                    rn[j] = true;
                    break;
                }
            }
        }
        return counter;
    }

    //approach 2 - optimal but still with extra space
    //T: O(n)
    //S: O(n)
    public int maxOperations2(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for(int i : map.keySet()){

            if(map.containsKey(i) && map.containsKey(k - i)){

                if(i != k - i){
                    count += Math.min(map.get(i), map.get(k - 1));
                    map.put(k - i, 0);
                } else {
                    count += Math.floor(map.get(i) / 2);
                }
                map.put(i, 0);
            }
        }

        return count;
    }

    //approach 3 - sorting; no extra space needed
    //T: O(n log n)
    //S: O(1)
    public int maxOperations3(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1, count = 0;
        while(left < right){

            int sum = nums[left] + nums[right];

            if(sum > k){
                right--;
            } else if(sum < k){
                left++;
            } else {
                left++;
                right--;
                count++;
            }
        }
        return count;
    }
}
