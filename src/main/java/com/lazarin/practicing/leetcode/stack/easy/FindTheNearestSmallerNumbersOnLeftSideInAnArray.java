package com.lazarin.practicing.leetcode.stack.easy;

import java.util.Stack;

//https://www.geeksforgeeks.org/find-the-nearest-smaller-numbers-on-left-side-in-an-array/
public class FindTheNearestSmallerNumbersOnLeftSideInAnArray {

    //T: O(N)
    public int[] solution(int[] nums){

        int[] answer = new int[nums.length];

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums.length; i++){

            int currNum = nums[i];

            if(stack.isEmpty() || currNum == 0){
                answer[i] = -1;
                stack.push(currNum);
            } else {

                while(!stack.isEmpty() && stack.peek() > currNum) {
                    stack.pop();
                }
                answer[i] = stack.peek();
                if(!stack.isEmpty() && stack.peek() < currNum){
                    stack.push(currNum);
                }
           }
        }
        return answer;
    }
}
