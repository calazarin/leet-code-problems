package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/
public class Permutations {

    //approach 1 - recursive solution
    //T: O(n! * n)
    //S: O(n) + O(n)
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        recurPermute(nums, perm, answer, visited);
        return answer;
    }

    private void recurPermute(int[] nums, List<Integer> perm, List<List<Integer>> answer, boolean[] visited) {
        if(perm.size() == nums.length){
            answer.add(new ArrayList<>(perm));
            return;
        }

        for(int i = 0 ; i < nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                perm.add(nums[i]);
                recurPermute(nums, perm, answer, visited);
                perm.remove(perm.size() - 1);
                visited[i] = false;
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
