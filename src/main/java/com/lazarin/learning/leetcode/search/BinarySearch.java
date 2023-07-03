package com.lazarin.learning.leetcode.search;

public class BinarySearch {


    public static void main(String args[]){
        // 0,1,2,3, 4
        //[1,5,9,20,25]
        System.out.println(new BinarySearch().binarySearch(new int[]{1,5,9,20,25}, 40));
    }


    public int binarySearch(int[] arr, int target){

        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = (right + left) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return - 1;
    }

}
