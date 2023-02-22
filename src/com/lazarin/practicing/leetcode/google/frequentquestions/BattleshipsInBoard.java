package com.lazarin.googlequestions.interviewprocess;

//https://leetcode.com/problems/battleships-in-a-board/
public class BattleshipsInBoard {

    public static void main(String args[]){

    }

    public int countBattleships(char[][] board) {

        int counter = 0;
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] == 'X'){
                    counter++;
                    sink(r, c, board);
                }
            }
        }
        return counter;
    }

    private void sink(int r, int c, char[][] board){

        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == '.'){
            return;
        }

        board[r][c] = '.';

        sink(r, c + 1, board);
        sink(r, c - 1, board);
        sink(r - 1, c, board);
        sink(r + 1, c, board);

    }
}
