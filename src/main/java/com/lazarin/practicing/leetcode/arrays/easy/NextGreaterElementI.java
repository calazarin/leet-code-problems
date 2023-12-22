package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-i/
public class NextGreaterElementI {

    //approach 1 - brute force; T: O(n * m); S: O(M)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    answer[i] = findGreatest(j + 1, nums1[i], nums2);
                    break;
                }
            }
        }
        return answer;
    }

    private int findGreatest(int startIndex, int value, int[] nums2){
        int greatest = -1;
        for(int i = startIndex; i < nums2.length; i++){
            if(nums2[i] > value){
                greatest = nums2[i];
                break;
            }
        }
        return greatest;
    }

    //brute force 2 - using hash map
    public int[] nextGreaterElement_2(int[] nums1, int[] nums2) {

        int[] answers = new int[nums1.length];
        Arrays.fill(answers, -1);

        //value, index
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], i);
        }

        for(int j = 0; j < nums2.length; j++){

            if(!map.containsKey(nums2[j])){
                continue;
            }
            for (int i = j + 1; i < nums2.length; i++){
                if(nums2[i] > nums2[j]){
                    int index = map.get(nums2[j]);
                    answers[index] = nums2[i];
                    break;
                }
            }
        }

        return answers;
    }

    //approach 3 - optimized using monotonic stack  - T: O(n + m); S: O(m)
    public int[] nextGreaterElement_3(int[] nums1, int[] nums2) {

        int[] answers = new int[nums1.length];
        Arrays.fill(answers, -1);

        //value, index
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], i);
        }

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums2.length; i++){
            int curr = nums2[i];

            while(!stack.isEmpty() && curr > stack.peek()){
                int val = stack.pop();
                int index = map.get(val);
                answers[index] = curr;
            }

            if(map.containsKey(curr)){
                stack.push(curr);
            }
        }

        return answers;

    }
}
