package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/letter-tile-possibilities/description/
public class LetterTilePossibilities {

    /**
     * Combination of Subsets II and Permutations II problems
     *
     * They key here to solve this problem is removing duplicated elements and counting distinct
     * sub-permutations (we can sort the array and compare with the previous one)
     *
     */
    int count;
    public int numTilePossibilities(String tiles) {
        count = 0;
        char[] tilesArr = tiles.toCharArray();
        Arrays.sort(tilesArr); //sort to remove duplicates
        helper(tilesArr, new boolean[tilesArr.length]);
        return count - 1;
    }

    private void helper(char[] tilesArr, boolean[] visited){
        count++;
        for(int i = 0; i < tilesArr.length; i++) {
            if(visited[i] || (i > 0  && tilesArr[i] == tilesArr[i - 1] &&
                    !visited[i - 1])){
                continue;
            }
            visited[i] = true;
            helper(tilesArr, visited);
            visited[i] = false;
        }
    }

    //approach 2 - using a set
    public int numTilePossibilities_2(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        String curr = "";
        permute(set, curr, visited, tiles);
        return set.size() - 1;
    }

    private void permute(Set<String> set, String curr, boolean[] visited, String tiles){
        set.add(curr);
        for(int i = 0; i < tiles.length(); i++) {
            if(!visited[i]){
                visited[i] = true;
                permute(set, curr + tiles.charAt(i), visited, tiles);
                visited[i] = false;
            }
        }
    }

}
