package com.lazarin.practicing.leetcode.design.easy;

import java.util.LinkedList;

//https://leetcode.com/problems/number-of-recent-calls
public class NumberOfRecentCalls {

    final int cut = 3000;
    LinkedList<Integer> input;

    public NumberOfRecentCalls() {
        input = new LinkedList<Integer>();
    }

    //T:O(1) with at maximum 3000 iterations
    //S: O(1)
    public int ping(int t) { //642,1849
        input.addLast(t);
        int lowerLimit = t - cut; //1921  [1921, 4921]
        while(input.getFirst()  < lowerLimit){
            input.removeFirst();
        }
        return input.size();
    }
}
