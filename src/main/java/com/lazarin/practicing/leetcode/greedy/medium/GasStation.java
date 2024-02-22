package com.lazarin.practicing.leetcode.greedy.medium;

import java.util.Arrays;

//https://leetcode.com/problems/gas-station/
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        var gasSum = Arrays.stream(gas).sum();
        var costSum = Arrays.stream(cost).sum();

        if(gasSum < costSum){
            return -1;
        }

        int total = 0, res = 0;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            if (total < 0){
                total = 0;
                res = i + 1;
            }
        }
        return res;
    }
}
