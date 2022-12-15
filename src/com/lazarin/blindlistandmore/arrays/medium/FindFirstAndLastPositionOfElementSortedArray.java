package com.lazarin.blindlistandmore.arrays.medium;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementSortedArray {

    public static void main(String args[]){

        FindFirstAndLastPositionOfElementSortedArray
                fflpesa = new FindFirstAndLastPositionOfElementSortedArray();

        //nums = [5,7,7,8,8,10]
        //target = 8
        //output = [3,4]
        System.out.print(Arrays.toString(
                fflpesa.searchRange2(new int[]{5,7,7,8,8,10}, 8)));

        //nums = [5,5,7,7,8,8,10]
        //target = 6
        //output = [-1,-1]
        System.out.print(Arrays.toString(
                fflpesa.searchRange(new int[]{5,5,7,7,8,8,10}, 6)));

        //nums = []
        //target = 0
        //output = [-1,-1]
        System.out.print(Arrays.toString(
                fflpesa.searchRange(new int[]{}, 0)));
    }

    //T: O(N)
    //S: O(1)
    public int[] searchRange(int[] nums, int target){
        //        0 1 2 3 4 5 6
        //nums = [5,7,7,8,8,10]
        //target = 8
        //output = [3,4]

        if(nums == null || nums.length == 0){
            return new int[]{-1, -1};
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == target && nums[i] == nums[i - 1]){
                return new int[]{i - 1, i};
            }
        }

        return new int[]{-1, -1};
    }

    //T: O(N)
    //S: O(1)
    public int[] searchRange2(int[] nums, int target) {

        int firstOccurrence = this.findBound(nums, target, true);

        if (firstOccurrence == -1) {
            return new int[]{-1, -1};
        }

        int lastOccurrence = this.findBound(nums, target, false);

        return new int[]{firstOccurrence, lastOccurrence};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int N = nums.length;
        int begin = 0, end = N - 1;

        while (begin <= end) {

            int mid = (begin + end) / 2;

            if (nums[mid] == target) {

                if (isFirst) {

                    // This means we found our lower bound.
                    if (mid == begin || nums[mid - 1] != target) {
                        return mid;
                    }

                    // Search on the left side for the bound.
                    end = mid - 1;

                } else {

                    // This means we found our upper bound.
                    if (mid == end || nums[mid + 1] != target) {
                        return mid;
                    }

                    // Search on the right side for the bound.
                    begin = mid + 1;
                }

            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;
    }
}
