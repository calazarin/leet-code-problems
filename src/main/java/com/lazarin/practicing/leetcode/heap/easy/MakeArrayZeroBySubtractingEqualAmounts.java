package com.lazarin.practicing.leetcode.heap.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

//https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
public class MakeArrayZeroBySubtractingEqualAmounts {

    //approach 1  - min heap
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        for(int i : nums) {
            if(i != 0) minHeap.offer(i);
        }
        int op = 0;
        while(!minHeap.isEmpty()) {
            int curr = minHeap.peek();
            List<Integer> calcList = new ArrayList<>();

            while(!minHeap.isEmpty()){
                int e = minHeap.poll();
                int res = e - curr;
                if(res > 0) calcList.add(res);
            }

            for(Integer j : calcList){
                minHeap.offer(j);
            }

            op += 1;
        }
        return op;
    }

    //approach 2 - optimal solution - just pick unique elements != 0 and count them
    //T: O(N); S: O(N)
    public int minimumOperations_2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(i != 0) set.add(i);
        }
        return set.size();
    }
}
