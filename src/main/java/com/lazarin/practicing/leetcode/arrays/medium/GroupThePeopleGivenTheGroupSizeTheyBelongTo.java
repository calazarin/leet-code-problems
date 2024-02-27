package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {

    //approach 1 = use a hashmap to assign people to the respective group/size
    //T: O(N); S: O(N)
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < groupSizes.length; i++) {

            int size = groupSizes[i];

            if(map.containsKey(size)) {
                List<Integer> nums = map.get(size);
                if(nums.size() == size) {
                    ans.add(nums);
                    List<Integer> newList = new ArrayList<>();
                    newList.add(i);
                    map.put(size, newList);
                } else {
                    nums.add(i);
                    map.put(size, nums);
                }
            } else {
                List<Integer> nums = new ArrayList<>();
                nums.add(i);
                map.put(size, nums);
            }

        }
        ans.addAll(map.values());


        return ans;
    }
}
