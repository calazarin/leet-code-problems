package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/
public class Permutations {

    //recursive solution
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> dataStrct = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurPermute(nums, dataStrct, answer, freq);
        return answer;
    }

    private void recurPermute(int[] nums, List<Integer> dataStrct, List<List<Integer>> answer, boolean[] freq) {
        if(dataStrct.size() == nums.length){
            answer.add(new ArrayList<>(dataStrct));
            return;
        }

        for(int i = 0 ; i < nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                dataStrct.add(nums[i]);
                recurPermute(nums, dataStrct, answer, freq);
                dataStrct.remove(dataStrct.size() - 1);
                freq[i] = false;
            }
        }
    }

    //approach 2
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
