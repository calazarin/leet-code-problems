package com.lazarin.practicing.leetcode.greedy.medium;

import java.util.Arrays;

//https://leetcode.com/problems/gas-station/
public class GasStation {

    public static void main(String args[]){

       /* Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
        Output: 3
        Explanation:
        Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
        Travel to station 4. Your tank = 4 - 1 + 5 = 8
        Travel to station 0. Your tank = 8 - 2 + 1 = 7
        Travel to station 1. Your tank = 7 - 3 + 2 = 6
        Travel to station 2. Your tank = 6 - 4 + 3 = 5
        Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
        Therefore, return 3 as the starting index.*/


       /* Input: gas = [2,3,4], cost = [3,4,3]
        Output: -1
        Explanation:
        You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
        Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
        Travel to station 0. Your tank = 4 - 3 + 2 = 3
        Travel to station 1. Your tank = 3 - 3 + 3 = 3
        You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
        Therefore, you can't travel around the circuit once no matter where you start.*/

    }

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