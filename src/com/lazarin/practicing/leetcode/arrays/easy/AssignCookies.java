package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.Arrays;

//https://leetcode.com/problems/assign-cookies/
public class AssignCookies {

    public static void main(String args[]){

        AssignCookies ac = new AssignCookies();

       /* Input: g = [1,2,3], s = [1,1]
        Output: 1
        Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
        And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
        You need to output 1.*/
        System.out.println(ac.findContentChildren(new int[]{1,2,3}, new int[]{1,1}));

        /*Input: g = [1,2], s = [1,2,3]
        Output: 2
        Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
        You have 3 cookies and their sizes are big enough to gratify all of the children,
        You need to output 2.*/
        System.out.println(ac.findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }

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
