package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summarty-range/
public class SummaryRanges {

    //T: O(N)
    public List<String> summaryRanges(int[] nums) {
        List<String> resp = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int start = nums[i];
            while(i + 1 < n && (nums[i + 1] == nums[i] + 1)){
                i++;
            }
            if(start != nums[i]){
                resp.add(start+"->"+nums[i]);
            } else {
                resp.add(String.valueOf(nums[i]));
            }
        }
        return resp;
    }
}
