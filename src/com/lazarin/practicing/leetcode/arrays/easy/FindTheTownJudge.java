package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-the-town-judge/description/
public class FindTheTownJudge{

    public static void main(String args[]){

        /*Input: n = 2, trust = [[1,2]]
        Output: 2*/
        System.out.println(findJudge2(2, new int[][]{{1,2}}));

        /*Input: n = 3, trust = [[1,3],[2,3]]
        Output: 3*/
        System.out.println(findJudge2(3, new int[][]{{1,3}, {2,3}}));

       /* Input: n = 3, trust = [[1,3],[2,3],[3,1]]
        Output: -1*/
        System.out.println(findJudge2(3, new int[][]{{1,3}, {2,3}, {3,1}}));
    }

    //T: O(N) where N is the amount of items in the trust matrix
    //S: O(1) as I don't use extra space
    public int findJudge(int n, int[][] trust) {

        HashMap<Integer, List<Integer>> adj = new HashMap<>();

        //initialize my map with an emppty list for each person
        for(int i = 0; i < n; i++){
            adj.put(i+1, new ArrayList());
        }

        for(int[] trusts : trust){
            adj.get(trusts[0]).add(trusts[1]);
        }

        int judge = -1;
        for(Map.Entry<Integer, List<Integer>> entry : adj.entrySet()){
            if(entry.getValue().isEmpty()){
                judge = entry.getKey();
                break;
            }
        }

        boolean isValidJudge = true;
        if(judge != -1){
            for(Map.Entry<Integer, List<Integer>> entry : adj.entrySet()){
                if(entry.getKey() != judge && !entry.getValue().contains(judge)){
                    isValidJudge = false;
                    break;
                }
            }
        }

        return judge != -1 && isValidJudge ? judge : -1;
    }

    //approach 2
    public static int findJudge2(int n, int[][] trust) {
        int[] count = new int[n+1];
        for(int[] t : trust){
            count[t[0]]--;
            count[t[1]]++;
        }
        for(int i = 1; i <= n; i++){
            if(count[i] == n - 1){
                return i;
            }
        }
        return -1;
    }
}
