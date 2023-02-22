package com.lazarin.learning.head.fundamentals;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeadFundamentals {

    public static void main(String args[]){
        //min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //O(logN)
        minHeap.add(5);
        //getting the most top element - O(1)
        minHeap.peek();
        //deleting the top element of a heap - O (log N)
        minHeap.poll();
        //length of min heap - O (1)
        minHeap.size();

        //max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        //O(logN)
        maxHeap.add(5);
        //getting the most top element - O(1)
        maxHeap.peek();
        //deleting the top element of a heap - O (log N)
        maxHeap.poll();
        //length of max heap - O (1)
        maxHeap.size();

        //heapfy
        PriorityQueue<Integer> heapWithValues = new PriorityQueue<>(Arrays.asList(3,2,1));
    }
}
