package com.lazarin.practicing.leetcode.backtracking.medium;

//https://leetcode.com/problems/beautiful-arrangement/description/
public class BeautifulArrangement {

    int count = 0;
    public int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1];
        backtrack(n, 1, visited);
        return count;
    }

    private void backtrack(int n, int pos, boolean[] visited){
        if(pos > n) count++;

        for(int j = 1; j <= n; j++) {
            if(!visited[j] && (pos % j == 0 || j % pos == 0)){
                visited[j] = true;
                backtrack(n, pos + 1, visited);
                visited[j] = false;
            }
        }
    }
}
