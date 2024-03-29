package com.lazarin.practicing.leetcode.slidingwindow.easy;

import java.util.HashMap;

//https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate2 {

    //approach 1 -
    //T: O(n^2)
    //S: O(1)
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i = 0; i < nums.length - 1; i++){
            int j = i + 1;
            for( ; j < nums.length; j++){
                if(nums[i] == nums[j] && (j - i <= k)){
                    return true;
                }
            }
        }
        return false;
    }

    //approach 2
    //whenever we need to check if something occur, a hash map or hash set might be useful
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i  < nums.length; i++){
            int current = nums[i];
            if(map.containsKey(current) && i - map.get(current) <= k){
                return true;
            } else {
                map.put(current, i);
            }
        }
        return false;
    }
}
