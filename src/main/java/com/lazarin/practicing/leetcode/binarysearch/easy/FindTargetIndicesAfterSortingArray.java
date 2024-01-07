package com.lazarin.practicing.leetcode.binarysearch.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-target-indices-after-sorting-array/description/
public class FindTargetIndicesAfterSortingArray {

    //approach 1 - brute force
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums); //nlogn
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }

    /**
     * sort the array. O(nlogn)
     * find out left most occurrence of target element. O(logn)
     * find out right most occurrence of target element. 0(logn)
     * now from leftmost to right index traverse and add target element that number of times. 0(n)
     */
    public List<Integer> targetIndices_2(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> out = new ArrayList<>();

        int low = 0;
        int high = nums.length - 1;
        int ansl = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ansl = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        low = 0;
        high = nums.length - 1;
        int ansr = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ansr = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        if (ansl == -1) {
            return out;
        }
        for (int i = ansl; i <= ansr; i++) {
            out.add(i);
        }

        return out;
    }

    private int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int m = l + (r - l) / 2;
            if(nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] == target){
                return m;
            }
        }
        return -1;
    }

}
