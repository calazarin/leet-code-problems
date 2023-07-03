package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/find-the-highest-altitude
public class FindTheHighestAltitude {

    public static void main(String args[]){
        FindTheHighestAltitude solution =
                new FindTheHighestAltitude();
       /* Input: gain = [-5,1,5,0,-7]
        Output: 1*/
        System.out.println(solution.largestAltitude(new int[]{-5,1,5,0,-7}));

        /*Input: gain = [-4,-3,-2,-1,4,3,2]
        Output: 0*/
        System.out.println(solution.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    //T: O(N)
    //S: O(1)
    public int largestAltitude(int[] gain) {
        int sum = 0, highest = sum;

        for(int i = 0; i < gain.length; i++){
            sum = sum + gain[i];
            highest = Math.max(sum, highest);
        }

        return highest;
    }
}
