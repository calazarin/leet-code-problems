package com.lazarin.practicing.leetcode.heap.easy;

import java.util.PriorityQueue;

//https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/description/
public class LargestNumberAfterDigitSwapsByParity {

    //approach - min and max heaps
    //T: O(N) where N is the amount of digits in num
    //S: O(N)
    public int largestInteger(int num) {

        PriorityQueue<Integer> maxQueueOdd = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> maxQueueEven = new PriorityQueue<>((a, b) -> b - a);

        String numStr = String.valueOf(num);

        for(int i  = 0; i < numStr.length(); i++) {
            int currNum = Character.getNumericValue(numStr.charAt(i));
            if(isOdd(currNum)){
                maxQueueOdd.add(currNum);
            } else {
                maxQueueEven.add(currNum);
            }
        }

        StringBuilder finalNum = new StringBuilder();
        for(int i  = 0; i < numStr.length(); i++) {
            int currNum = Character.getNumericValue(numStr.charAt(i));
            if(isOdd(currNum)){
                finalNum.append(maxQueueOdd.poll());
            } else {
                finalNum.append(maxQueueEven.poll());
            }
        }

        return Integer.valueOf(finalNum.toString());
    }

    private boolean isOdd(int num) {
        return num % 2 != 0;
    }

}
