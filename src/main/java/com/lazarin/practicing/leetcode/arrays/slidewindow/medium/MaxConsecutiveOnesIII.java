package com.lazarin.practicing.leetcode.arrays.slidewindow.medium;

//https://leetcode.com/problems/max-consecutive-ones-iii
public class MaxConsecutiveOnesIII {

    public static void main(String args[]){
        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();
        /*Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
        Output: 6*/
        System.out.println(solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));

       /* Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
        Output: 10*/
        System.out.println(solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));

        /*Input: nums = [0,0,1,1,1,0,0]
        Output: k = 2*/
        System.out.println(solution.longestOnes3(new int[]{0, 0, 1, 1, 1, 0, 0}, 0));
    }

    //approach 1 - sliding window (1)
    //T: O(N)
    //S: O(1)
    public int longestOnes(int[] nums, int k) {

        int window_counter = 0, answer = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                window_counter++;
            } else if(nums[i] == 0 && k > 0) {
                nums[i] = -1; //flipping current position
                k--;
                window_counter++;
            } else { //I need to shrink my window in the left
                while (window_counter > 0 && k <= 0) {
                    if(nums[i - window_counter] == -1) {
                        k++;
                        nums[i - window_counter] = 0;
                    }
                    window_counter--;
                }
                if(k > 0){
                    nums[i] = -1;
                    k--;
                    window_counter++;
                }
            }
            answer = Math.max(window_counter, answer);
        }
        return answer;
    }

    //approach 2 - sliding window (2)
    //T: O(N)
    //S: O(1)
    public int longestOnes2(int[] nums, int k) {
        int i = 0, j;
        for (j = 0; j < nums.length; ++j) {
            if (nums[j] == 0) {
                k--;
            }
            if (k < 0 && nums[i++] == 0) {
                k++;
            }
        }
        return j - i;
    }

    //approach 3 - sliding window (3)
    //T: O(N)
    //S: O(1)
    public int longestOnes3(int[] nums, int k) {

        int i = 0, j = 0;
        while(i < nums.length){
            if(nums[i] == 0) {
                k--;
            }
            if(k < 0){
                if(nums[j] == 0){
                    k++;
                }
                j++;
            }
            i++;
        }
        return i - j;
    }

    //approach 4 - sliding window (4)
    //T: O(N)
    //S: O(1)
    public int longestOnes4(int[] A, int K) {
        int left = 0;
        int right = 0;
        int max = 0;

        int numZeroes = 0;
        for (right= 0; right<A.length; right++) {

            if (A[right]==0) numZeroes++;

            if (numZeroes > K) {
                if (A[left]==0) numZeroes--;
                left ++;
            }
            if (numZeroes <= K) {
                // this is probably what I could come up during interview...
                max = Math.max(max, right-left +1 );
            }
        }
        return max;
    }
}
