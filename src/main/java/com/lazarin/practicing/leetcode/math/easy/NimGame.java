package com.lazarin.practicing.leetcode.math.easy;

//https://leetcode.com/problems/nim-game/description/
public class NimGame {

    public static void main(String args[]){
        NimGame nimGame = new NimGame();

        System.out.println(nimGame.canWinNim(4));
        /*Input: n = 4
        Output: false
        Explanation: These are the possible outcomes:
        1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
        2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
        3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
        In all outcomes, your friend wins.*/

       /* Input: n = 1
        Output: true*/
        System.out.println(nimGame.canWinNim(1));

       /* Input: n = 2
        Output: true*/
        System.out.println(nimGame.canWinNim(2));
    }

    //approach 1 - You can always win a Nim game if the number of stones nnn in the pile is not divisible by 444.
    //T: O(1)
    //S: O(1)
    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}
