package com.lazarin.practicing.leetcode.bitmanipulation.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/single-number
public class SingleNumber {

    /**
     * approach 1 - set - not optimal
     */
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        return set.stream().findAny().get();
    }

    //approach 2 - optimal using XOR - O(N)
    public int singleNumber_2(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res = n ^ res;
        }
        return res;
    }
}