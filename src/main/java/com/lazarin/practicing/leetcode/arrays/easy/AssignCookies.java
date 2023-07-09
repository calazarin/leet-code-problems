package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.Arrays;

//https://leetcode.com/problems/assign-cookies/
public class AssignCookies {

    //T: O(N)
    //S: O(1)
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int gp = 0, sp = 0, hc = 0;
        while(gp < g.length && sp < s.length){
            if (s[sp] < g[gp]){
                sp++;
            } else {
                hc++;
                gp++;
                sp++;
            }
        }

        return hc;
    }
}
