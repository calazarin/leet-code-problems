package com.lazarin.practicing.leetcode.twopointers.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/partition-labels/description/
public class PartitionLabels {

    /**
     * for each letter encountered, process the last occurrence of
     that letter, extending the current portion appropriately
     T:O(N); S:O(N)
     */
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];

        for(int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        int j = 0, anchor = 0; //start and end of current partition
        List<Integer> ans = new ArrayList();
        for(int i = 0; i < s.length(); i++) {
            //extend j until the last occurrence of given char
            j = Math.max(j, last[s.charAt(i) - 'a']);
            if(i == j) {//end of the partition
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }
}
