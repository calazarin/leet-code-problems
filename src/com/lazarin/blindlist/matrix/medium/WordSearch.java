package com.lazarin.blindlist.matrix.medium;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/word-search/
public class WordSearch {

    public static void main(String args[]){

       /* Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
        Output: true*/
        System.out.println(exist(new char[][]{},"ABCCED"));

        /*Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
        Output: true*/
        System.out.println(exist(new char[][]{},"ABCCED"));

      /*  Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
        Output: false*/
        System.out.println(exist(new char[][]{},"ABCCED"));

    }

    //T: O(NxM)
    //S: O(1)
    public static boolean exist(char[][] board, String word) {

        if(board == null || board.length == 0){
            return false;
        }
        int letterIndex = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){

                if(board[i][j] == word.charAt(letterIndex)){

                    boolean found = searchLetter(i, j, board,
                            word.charAt(letterIndex + 1));
                    if(found){
                        letterIndex++;
                    }
                    if(letterIndex == word.length() - 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean searchLetter(int i, int j, char[][] board, char findIt){

        if(i < 0 || j < 0 || i >= board.length || j > board[0].length){
            return false;
        }

        if(board[i][j] == findIt){
            return true;
        }

        if(searchLetter(i, j+1, board, findIt)){
            return true;
        }
        if(searchLetter(i,j-1,board, findIt)){
            return true;
        }
        if(searchLetter(i - 1, j, board, findIt)){
            return true;
        }
        if(searchLetter(i + 1, j, board, findIt)){
            return true;
        }

        return false;
    }

    //T: O (N) - n is the number of cells in the grid
    //S: O (N) - we might need to do a recusive call for every position if our word taks the entire board
    public static boolean exist2(char[][] board, String word) {

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, int i, int j, int count, String word){

        if(count == word.length()) {
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' '; //take care that we are not reusing the same cell
        boolean found =  dfs(board, i + 1, j, count + 1, word)
                || dfs(board, i - 1, j, count + 1, word)
                || dfs(board, i, j + 1, count + 1, word)
                || dfs(board, i, j - 1, count + 1, word);
        board[i][j] = temp;
        return found;
    }

    //backtracking dfs
    //T: O (n * m * dfs); dfs =  4^length(word) => 4^N
    public static boolean exist3(char[][] board, String word) {

        int rows = board.length;
        int columns = board[0].length;
        Set<String> path = new HashSet<>();

        for(int r  = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                if(backtrackingDfs(r, c, 0, board, path, word)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean backtrackingDfs(int r, int c, int i, char[][] board, Set<String> path, String word){
        if(i == word.length()){
            return true;
        }
        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length
            || board[r][c] != word.charAt(i)
            || path.contains(r+","+c)){
            return false;
        }
        path.add(r+","+c);
        boolean result = backtrackingDfs(r, c + 1, i + 1, board, path, word) ||
                backtrackingDfs(r, c - 1, i + 1, board, path, word) ||
                backtrackingDfs(r + 1, c, i + 1, board, path, word) ||
                backtrackingDfs(r -1 , c, i + 1, board, path, word);

        path.remove(r+","+c);
        return result;
    }

}
