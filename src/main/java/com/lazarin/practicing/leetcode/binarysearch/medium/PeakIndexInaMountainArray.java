package com.lazarin.practicing.leetcode.binarysearch.medium;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInaMountainArray {

    //approach 1 - linear search
    //T:O(N); S:O(1)
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        while (arr[i] < arr[i + 1]) {
            i++;
        }
        return i;
    }


    //approach 2 - binary search
    //T: O(logN) where N is the length of input array
    //S: O(1)
    public int peakIndexInMountainArray_2(int[] arr) {
        int left = 0, right = arr.length - 1;

        while(left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
