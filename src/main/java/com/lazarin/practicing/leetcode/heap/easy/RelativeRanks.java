package com.lazarin.practicing.leetcode.heap.easy;

import java.util.PriorityQueue;

//https://leetcode.com/problems/relative-ranks/description/
public class RelativeRanks {

    //approach 1 - max heap
    //T: O(N)
    //S: O(N)
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        String[] fp = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        PriorityQueue<Rank> maxHeap = new PriorityQueue<>((r1, r2) -> r2.value - r1.value);

        for(int i = 0; i < score.length; i++) {
            Rank rank = new Rank(score[i], i);
            maxHeap.offer(rank);
        }
        int rank = 1;
        while(!maxHeap.isEmpty()) {
            Rank curr = maxHeap.poll();
            if(rank <= 3) {
                answer[curr.index] = fp[rank - 1];
            } else {
                answer[curr.index] = String.valueOf(rank);
            }

            rank++;
        }
        return answer;
    }

    public class Rank{
        private int value;
        private int index;
        public Rank(int val, int idx) {
            value = val;
            index = idx;
        }
    }
}
