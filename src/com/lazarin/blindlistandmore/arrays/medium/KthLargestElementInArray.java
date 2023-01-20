package com.lazarin.blindlistandmore.arrays.medium;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElementInArray {

    public static void main(String args[]){

       /* Input: nums = [3,2,1,5,6,4], k = 2
        Output: 5*/

        /*Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
        Output: 4*/
    }

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

// 0 1 2 3 4 5
//[3,2,1,5,6,4]
//right = 5
//mid = 3
//left=[3,2,1]
//right=[5,6,4]

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

    //approach 2 -
    //with priority queue (min/max) heap
    //max heap = O(N + klogn) => n to build, k to remove and long to heapfy)
    public int findKthLargest2(int[] nums, int k) {


        return -1;
    }

    //approach 3 -
    //quick select - O(n)
    public int findKthLargest3(int[] nums, int k) {


        return -1;
    }
}
