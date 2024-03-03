package com.lazarin.practicing.leetcode.twopointers.medium;

import java.util.LinkedList;

//https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
public class PartitionArrayAccordingToGivenPivot {

    //approach 1 - traverse array + queue
    //T: O(N); S:O(N)
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        LinkedList<Integer> queue = new LinkedList<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                ans[j] = nums[i];
                j++;
            }
            if(nums[i] > pivot) {
                queue.add(nums[i]);
            }
            if(nums[i] == pivot){
                queue.addFirst(nums[i]);
            }
        }
        while(!queue.isEmpty()){
            ans[j] = queue.pop();
            j++;
        }
        return ans;
    }

    //approach 2 - 3 loops, 2 pointers
    //T: O(N); O(N)
    public int[] pivotArray_2(int[] nums, int pivot) {
        int[] arr  = new int[nums.length];
        int count = 0; //counts pivot
        int k = 0; //support nums < pivot

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot) {
                arr[k++] = nums[i];
            }
            if(nums[i] == pivot) {
                count++;
            }
        }

        for(int i = 0; i < count; i++) {
            arr[k++] = pivot;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > pivot) {
                arr[k++] = nums[i];
            }
        }
        return arr;

    }
}
