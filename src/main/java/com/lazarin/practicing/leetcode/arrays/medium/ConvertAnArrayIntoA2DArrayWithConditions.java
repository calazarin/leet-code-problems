package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
public class ConvertAnArrayIntoA2DArrayWithConditions {

    /*
     * approach 1 - map counting freq + result matrix creation
     * T: O(N^2)
     * S: O(N)
     */
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer num = entry.getKey(); //4
            Integer freq = entry.getValue(); //1
            //distribute the numbers across row based on its freq
            //freq = 1, row 0
            //freq = 2, row 1
            //freq = 3, row 2 and so on
            for(int i = 1; i <= freq; i++){
                if(ans.size() < i){
                    List<Integer> newList = new ArrayList<>();
                    newList.add(num);
                    ans.add(newList);
                } else {
                    List<Integer> list = ans.get(i - 1);
                    list.add(num);
                }
            }
        }

        return ans;
    }

    /*
     * approach 2 - use a array of frequency to create rows
     * T: O(N)
     * S: O(N)
     */
    public List<List<Integer>> findMatrix_2(int[] nums) {

        int freq[] = new int[nums.length + 1];

        ArrayList<List<Integer>> ans = new ArrayList<>();

        for(int e : nums) {
            if(freq[e] >= ans.size()) {
                ans.add(new ArrayList<>());
            }
            ans.get(freq[e]).add(e);
            freq[e]++;
        }
        return ans;
    }
}
