package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/
public class Subsets {

    public static void main(String args[]){

        /*Input: nums = [1,2,3]
        Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]*/


       /* Input: nums = [0]
        Output: [[],[0]]*/
    }

    //approach recursively
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        //new ArrayList is the new sub list we are creating
        generateSubsets(0, nums, new ArrayList<>(), subsets);
        return subsets;
    }

    //t: O(2n) => 2 choices each steps
    //s: O(n) => deeper is the number os numbers we have
    //index = current index we are in nums
    private void generateSubsets(int index, int[] nums, ArrayList<Integer> current,
                                 List<List<Integer>> subsets) {

        //add a copy because we are going to modify current later on
        subsets.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++){
            //decide now if we take or not take the number
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, subsets);
            current.remove(current.size() - 1); //remove last add element and try a new one (backtracking
        }

    }
}
