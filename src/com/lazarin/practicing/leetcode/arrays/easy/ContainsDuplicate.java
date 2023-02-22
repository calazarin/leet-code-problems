package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

    public static void main(String args[]){

        var result = containsDuplicate(new int[]{1,2,3,1});
        System.out.println(result);

        var result2 = containsDuplicate(new int[]{ 1,2,3,4 });
        System.out.println(result2);

        var result3 = containsDuplicate(new int[]{ 1,1,1,3,3,4,3,2,4,2 });
        System.out.println(result3);
    }

    //Time - O(n); Space O(n)
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numberSet = new HashSet<>();
        for(int n : nums) {
            var added = numberSet.add(n);
            if(!added){
                return true;
            }
        }
        return false;
    }
}
