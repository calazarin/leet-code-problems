package com.lazarin.practicing.leetcode.design.medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//https://leetcode.com/problems/smallest-number-in-infinite-set
public class SmallestInfiniteSet {

    private PriorityQueue<Integer> minPrQueue;
    private Set<Integer> set;

    public SmallestInfiniteSet() {
        //initializes it with all positive integers
        minPrQueue = new PriorityQueue<>(1000);
        set = new HashSet<>(1000);
        for(int i = 1; i <= 1000; i++){
            minPrQueue.add(i);
            set.add(i);
        }
    }

    public int popSmallest() {
        //removes and returns the smallest integer
        int smallest = minPrQueue.poll();
        set.remove(smallest);
        return smallest;
    }

    public void addBack(int num) {
        if(!set.contains(num)){ //set contains is O(1)
            minPrQueue.add(num);
            set.add(num);
        }
    }
}
