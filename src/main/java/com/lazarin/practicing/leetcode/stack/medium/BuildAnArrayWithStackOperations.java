package com.lazarin.practicing.leetcode.stack.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

//https://leetcode.com/problems/build-an-array-with-stack-operations/
public class BuildAnArrayWithStackOperations {

    /**
     * approach 1 - using a set
     * T: O(N); S:O(N)
     */
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        Set<Integer> targetSet = new HashSet<>();
        for(int i : target){
            targetSet.add(i);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i <=n; i++) {
            stack.push(i);
            ans.add("Push");
            if(!targetSet.contains(i)){
                ans.add("Pop");
                stack.pop();
            }
            if(stack.size() == targetSet.size()){
                break;
            }
        }
        return ans;
    }

    /**
     * approach 2
     * if current target and n[i] are equals -> push
     * if n[i] < current target -> push and pop
     * T: O: (N); S: O(N)
     */
    public List<String> buildArray_2(int[] target, int n) {

        List<String> ans = new ArrayList<>();
        int cur = 1; //target is in a strictly increasing order

        for(int t : target) {
            while(cur < t) {
                ans.add("Push");
                ans.add("Pop");
                cur += 1;
            }
            ans.add("Push"); //when curr == t
            cur += 1;
        }

        return ans;
    }
}
