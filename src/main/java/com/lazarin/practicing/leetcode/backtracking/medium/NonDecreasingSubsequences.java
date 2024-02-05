package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/non-decreasing-subsequences/description/
public class NonDecreasingSubsequences {

    /**
     * approach - backtracking
     * 2 choices - include or not include an element
     * T: O(2^N); S: O(2^N)
     */
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> ansSet = new HashSet<>();
        backtrack(0, nums, ansSet, new ArrayList<>());
        return new ArrayList<>(ansSet);
    }

    private void backtrack(int index, int[] nums, HashSet<List<Integer>> ansSet, List<Integer> currSeq){
        if(index == nums.length) {
            if(currSeq.size() >= 2) {
                ansSet.add(new ArrayList<>(currSeq));
            }
            return;
        }
        //take
        if(currSeq.isEmpty() || currSeq.get(currSeq.size() - 1) <= nums[index]) {
            currSeq.add(nums[index]);
            backtrack(index + 1, nums, ansSet, currSeq);
            currSeq.remove(currSeq.size() - 1);
        }
        //not take
        backtrack(index + 1, nums, ansSet, currSeq);
    }

    /**
     * approach 2 - backtracking without hash set
     * 2 choices - include or not include an element
     * T: O(2^N); S: O(2^N)
     */
    public List<List<Integer>> findSubsequences_2(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack_2(0, nums, new ArrayList<>(), Integer.MIN_VALUE, answer);
        return answer;
    }

    private void backtrack_2(int index, int[] nums, ArrayList<Integer> currSeq, int prev, List<List<Integer>> answer) {
        if(index == nums.length) {
            if(currSeq.size() >= 2) {
                answer.add(new ArrayList<>(currSeq));
            }
            return;
        }

        if(nums[index] >= prev) {
            currSeq.add(nums[index]);
            backtrack_2(index + 1, nums, currSeq, nums[index], answer);
            currSeq.remove(currSeq.size() - 1);
        }

        if(nums[index] == prev){
            return;
        }

        backtrack_2(index + 1, nums, currSeq, prev, answer);
    }

}
