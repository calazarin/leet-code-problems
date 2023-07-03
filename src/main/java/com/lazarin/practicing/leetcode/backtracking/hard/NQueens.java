package com.lazarin.practicing.leetcode.backtracking.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/n-queens/
public class NQueens {

    public static void main(String args[]){
        NQueens nq = new NQueens();
       /* Input: n = 4
        Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
        Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above*/
        var resp = nq.solveNQueens(4);
        printAnswers(resp);

        System.out.print("\n\n");

        var resp3 = nq.solveNQueens3(4);
        printAnswers(resp3);


      /*  Input: n = 1
        Output: [["Q"]]*/
        /*var resp2 = nq.solveNQueens(1);
        printAnswers(resp2);*/
    }

    private static void printAnswers(List<List<String>> resp){
        resp.forEach(innerList -> {
            innerList.forEach(row ->{
                System.out.print(row + " , ");
            });
            System.out.print("\n");
        });
    }

    //approach 1
    //using positive and negative diagonals
    public List<List<String>> solveNQueens(int n) {

        HashSet<Integer> cols = new HashSet<>();
        HashSet<Integer> posDiag = new HashSet<>();
        HashSet<Integer> negDiag = new HashSet<>();

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];
        for(char[] rows : board){
            Arrays.fill(rows,'.');
        }

        backtrack(board, 0, n, result, cols,  posDiag, negDiag);
        return result;
    }

    private void backtrack(char[][] board, int r, int n,
                           List<List<String>> result,
                           HashSet<Integer> cols,
                           HashSet<Integer> posDiag,
                           HashSet<Integer> negDiag){

        if(r == n){ //we found a solution, lets construct our result
            result.add(constructResult(board));
            return;
        }

        for(int c = 0; c < n; c++){

            //validation function
            if(cols.contains(c) || posDiag.contains(r + c) || negDiag.contains(r - c)){
                continue; //this is our bound function
            }

            cols.add(c);
            posDiag.add(r + c);
            negDiag.add(r - c);
            board[r][c] = 'Q';

            backtrack(board, r + 1, n, result, cols, posDiag, negDiag);
            //backtracking
            cols.remove(c);
            posDiag.remove(r + c);
            negDiag.remove(r - c);
            board[r][c] = '.';
        }

    }

    private List<String> constructResult(char[][] board) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            res.add(String.valueOf(board[i]));
        }
        return res;
    }

    //approach 2 - without negative and positive diagonals
    public List<List<String>> solveNQueens2(int n) {

        char[][] board = new char[n][n];

        for(char[] rows : board){
            Arrays.fill(rows,'.');
        }

        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res);
        return res;

    }

    private void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if(colIndex == board.length) {
            res.add(construct(board));
            return;
        }

        for(int i = 0; i < board.length; i++) {
            if(validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, colIndex + 1, res);
                //backtrack
                board[i][colIndex] = '.';
            }
        }
    }

    private boolean validate(char[][] board, int x, int y) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < y; j++) {
                if(board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    //approach 1 with boolean arrays instead of hashsets
    //using positive and negative diagonals
    //a little faster than using hash sets
    public List<List<String>> solveNQueens3(int n) {

        boolean[] cols = new boolean[n];
        boolean[] posDiag = new boolean[2*n - 1];
        boolean[] negDiag = new boolean[2*n - 1];

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];
        for(char[] rows : board){
            Arrays.fill(rows,'.');
        }

        backtrackWithBooleanArrays(board, 0, n, result, cols,  posDiag, negDiag);
        return result;
    }

    private void backtrackWithBooleanArrays(char[][] board, int r, int n,
                           List<List<String>> result,
                           boolean[] cols,
                           boolean[] posDiag,
                           boolean[] negDiag){

        if(r == n){ //we found a solution, lets construct our result
            result.add(constructResult(board));
            return;
        }

        for(int c = 0; c < n; c++){

            if(cols[c] == true || posDiag[r + c] || negDiag[r - c + n-1]){
                continue; //this is our bound function
            }

            cols[c] = true;
            posDiag[r + c] = true;
            negDiag[r - c + n - 1] = true;
            board[r][c] = 'Q';

            backtrackWithBooleanArrays(board, r + 1, n, result, cols, posDiag, negDiag);
            //backtracking

            cols[c] = false;
            posDiag[r + c] = false;
            negDiag[r - c + n - 1] = false;
            board[r][c] = '.';
        }

    }
}
