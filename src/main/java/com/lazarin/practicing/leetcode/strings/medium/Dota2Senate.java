package com.lazarin.practicing.leetcode.strings.medium;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/dota2-senate/
public class Dota2Senate {

    /**
     * approach 2 - two queues storing indexes of senators
     * T: O(N)
     * S: O(N)
     */
    public String predictPartyVictory(String senate) {
        int n = senate.length();

        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        for(int i = 0; i < n; i++){ //O(N)
            if(senate.charAt(i) == 'R'){
                rQueue.add(i);
            } else {
                dQueue.add(i);
            }
        }

        while(!rQueue.isEmpty() && !dQueue.isEmpty()){

            int rTurn = rQueue.poll(); //O(1)
            int dTurn = dQueue.poll();

            if(dTurn < rTurn){
                dQueue.add(dTurn + n);
            } else {
                rQueue.add(rTurn + n);
            }

        }


        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
