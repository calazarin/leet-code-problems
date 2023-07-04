package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElementInArray {

    //approach 1 - O(nlogn)
    public int findKthLargest(int[] nums, int k) {
        int[] sortedArr = mergeSort(nums);
        return sortedArr[k - 1];
    }

    private int[] mergeSort(int[] nums){

        if(nums.length < 2){
            return nums;
        }

        //take a mid point
        int mid = nums.length / 2;

        //get left part
        int[] leftArr = new int[mid];
        for(int i = 0; i < leftArr.length; i++){
            leftArr[i] = nums[i];
        }

        //get right part
        int[] rightArr = new int[nums.length - mid];
        for(int j = 0; j < rightArr.length; j++){
            rightArr[j] = nums[mid + j];
        }

        //sort left
        int[] leftS = mergeSort(leftArr);
        //sort right
        int[] rightS = mergeSort(rightArr);
        //merge them
        return merge(leftS, rightS);
    }

    private int[] merge(int[] left, int[] right){

        int i = 0, j = 0, k = 0;
        int[] merged = new int[left.length + right.length];

        while(i < left.length && j < right.length){
            if(left[i] > right[j]){
                merged[k] = left[i];
                i++;
            } else{
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            merged[k] = left[i];
            k++;
            i++;
        }

        while(j < right.length){
            merged[k] = right[j];
            k++;
            j++;
        }

        return merged;
    }
}
