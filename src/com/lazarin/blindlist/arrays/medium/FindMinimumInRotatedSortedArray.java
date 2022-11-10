package com.lazarin.blindlist.arrays.medium;

//LeetCode 153
public class FindMinimumInRotatedSortedArray {

    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public static void main(String args[]){
       /* Input: nums = [3,4,5,1,2]
        Output: 1
        Explanation: The original array was [1,2,3,4,5] rotated 3 times.*/
        System.out.println(findMin(new int[]{3,4,5,1,2}));

        /*Input: nums = [4,5,6,7,0,1,2]
        Output: 0
        Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.*/
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));

        /* Input: nums = [11,13,15,17]
        Output: 11
        Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
        */
        System.out.println(findMin(new int[]{11,13,15,17}));

    }

    public static int findMin(int[] nums) {

        var res = nums[0];
        int left = 0 , right = nums.length - 1;
        while(left <= right) {
            if(nums[left] < nums[right]){ //if the array is sorted
                res = Math.min(res, nums[left]);
                break;
            }
            var mid = (left + right) / 2;
            res = Math.min(res, nums[mid]);

            //binary search part
            if(nums[mid] >= nums[left]){ //look into right portion
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }


    public static int findMin3(int[] nums) {
        return findMinAux2(nums, 0, nums.length - 1);
    }

    private static int findMinAux2(int[] nums, int leftIndex, int rightIndex){

        int minLeftSide = 0, minRightSide = 0;
        while(leftIndex <= rightIndex ){
            int middlePoint = (rightIndex + leftIndex) / 2;
         //   minLeftSide = findMinAux(nums, leftIndex, middlePoint - 1);
            minRightSide = findMinAux2(nums, middlePoint, nums.length - 1);

        }

        if(minLeftSide < minRightSide) {
            return minLeftSide;
        } else {
            return minRightSide;
        }
    }

    //Brute force
    //O(n) time complexity
    //O(1) space complexity
    public static int findMin2(int[] nums) {
        var min = Integer.MAX_VALUE;
        for(Integer n : nums){
            if (n < min) min =n;
        }
        return min;
    }
}
