package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/surrounded-regions/
public class SurroundedRegions {

    public void solve(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'O'){
                    flipRegion(i, j, board);
                }
            }
        }
    }

    private void flipRegion(int i, int j, char[][] board){
        //check if is on the border
        if (i > 0 && i < board.length - 1 && j > 0 && j < board[i].length - 1){
            board[i][j] = 'X';
        }
    }

    //T: O(n*m)
    public void solve2(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        //1. (DFS) capture unsurrounded regions (O -> T)
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == 'O' && ((i == 0 || i == rows - 1) ||
                        j == 0 || j == cols - 1)){
                    dfs(i, j, board);
                }

            }
        }

        //2. capture surrounded regions (O -> X)
        for(int i = 0 ; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

        //3. Uncapture unsurrounded regions (T -> O)
        for(int i = 0 ; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(int r, int c, char[][] board){
        if(r < 0 || c < 0 || r == board.length || c == board[r].length ||
        board[r][c] != 'O'){
            return; //best case
        }
        board[r][c] = 'T';
        dfs(r, c + 1, board);
        dfs(r, c - 1, board);
        dfs(r + 1, c, board);
        dfs(r - 1, c, board);
    }
}
