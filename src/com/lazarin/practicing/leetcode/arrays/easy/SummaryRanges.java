package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summarty-range/
public class SummaryRanges {

    public static void main(String args[]){

       /* Input: nums = [0,1,2,4,5,7]
        Output: ["0->2","4->5","7"]
        Explanation: The ranges are:
                [0,2] --> "0->2"
                [4,5] --> "4->5"
                [7,7] --> "7"*/

        /*Input: nums = [0,2,3,4,6,8,9]
        Output: ["0","2->4","6","8->9"]
        Explanation: The ranges are:
                [0,0] --> "0"
                [2,4] --> "2->4"
                [6,6] --> "6"
                [8,9] --> "8->9"*/
    }

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
