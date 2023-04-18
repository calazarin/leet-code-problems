package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/permutations-ii/description/
public class Permutations2 {

    public static void main(String args[]){
        Permutations2 solution = new Permutations2();
       /* Input: nums = [1,1,2]
        Output:
        [[1,1,2],
         [1,2,1],
         [2,1,1]]*/
        //var resp = solution.permuteUnique(new int[]{1, 1, 2});
        var resp = solution.permuteUnique2(new int[]{1, 1, 2});
        resp.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });

        System.out.print("\n");

       /* Input: nums = [1,2,3]
        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]*/
        var resp2 = solution.permuteUnique(new int[]{1, 2, 3});
        resp2.stream().forEach(a -> {
            a.forEach(p -> System.out.printf("%d,", p));
            System.out.print("\n");
        });
    }

    //approach 1
    // a count hash map can be used to track duplicates
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            if(count.containsKey(n)){
                count.replace(n, count.get(n) + 1);
            }else {
                count.put(n, 1);
            }
        }

        dfs(nums, count, new ArrayList<>(), permutations);
        return permutations;
    }

    public void dfs(int[] nums, HashMap<Integer, Integer> count, List<Integer> currPerm, List<List<Integer>> allPerm){

        //bound function
        if(currPerm.size() >= nums.length){
            allPerm.add(new ArrayList<>(currPerm));
            return;
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() > 0){
                currPerm.add(entry.getKey());
                count.replace(entry.getKey(), entry.getValue() - 1);
                dfs(nums, count, currPerm, allPerm);
                count.replace(entry.getKey(), entry.getValue() + 1);
                currPerm.remove(currPerm.size() - 1);
            }
        }
    }

    //approach 2
    // sorting the array and using a boolean array to check if there are duplicates
    public List<List<Integer>> permuteUnique2(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        // create a boolean array which track the certain indexed integer is present in out temp list or not
        dfs(answer, new ArrayList<>(), nums, new boolean[nums.length]); // helper method
        return answer; // return output
    }

    private void dfs(List<List<Integer>> ans, List<Integer> temp, int[] nums, boolean[] visited) {

        if(nums.length == temp.size()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++) {

            if(visited[i]){
                continue;
            }

            if(i > 0 && !visited[i - 1] && nums[i] == nums[i-1]) {
                continue;
            }

            visited[i] = true;
            temp.add(nums[i]);

            dfs(ans, temp, nums, visited);

            // backtracking
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}
