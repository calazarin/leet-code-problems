package com.lazarin.practicing.leetcode.stack.medium;

import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures
public class DailyTemperatures {

    /**
     * approach 1 - brute force - T: O(n^2)
     */
    public int[] dailyTemperatures(int[] temperatures) {

        int[] resp = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {

            int currTemp = temperatures[i];
            int counter = 0;
            boolean foundTemp = false;
            for(int j = i + 1; j < temperatures.length; j++) {

                if(temperatures[j] < currTemp) {
                    counter++;
                } else {
                    foundTemp = true;
                    counter++;
                    break;
                }
            }
            resp[i] = foundTemp ? counter : 0;
        }

        return resp;
    }

    /**
     * approach 2 - optimal with monotonic decreasing stack
     * Stack will store the index used to calculate the distance
     *
     * T: O(N)
     * S: O(N)
     * */
    public int[] dailyTemperatures_2(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] resp = new int[temperatures.length];

        for(int i = temperatures.length - 1; i >=0; i--) {

            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                resp[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return resp;
     }
}
