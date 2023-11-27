package com.lazarin.practicing.leetcode.trie.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/word-search-ii/
public class WordSearchII {

    //approach 1 - using Trie (prefix tree); T: O(nmm *nm)
    public List<String> findWords(char[][] board, String[] words) {

        Trie trie = new Trie();
        //populates the prefix tree with all provided words
        for(String word : words){
            trie.insert(word);
        }

        int rows = board.length;
        int columns = board[0].length;

        List<String> answers = new ArrayList<>();
        //search words in the board
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                dfs(r, c, board, answers, trie.root);
            }
        }

        return answers;
    }

    private void dfs(int r, int c, char[][] board, List<String> answers, TrieNode node){

        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length
                ||  board[r][c] == '#'
                || !node.containsKey(board[r][c])){
            return;
        }


        char curr = board[r][c];
        node = node.getNode(curr);

        if(node.isEndWord()){
            answers.add(node.getWord());
            node.setEndWord(false);
        }

        board[r][c] = '#';

        dfs(r, c + 1, board, answers, node);
        dfs(r, c - 1, board, answers, node);
        dfs(r + 1, c, board, answers, node);
        dfs(r - 1, c, board, answers, node);

        //backtrack
        board[r][c] =  curr;
    }

    public  class Trie{
        private TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public void insert(String word){
            TrieNode curr = root;
            for(Character ch : word.toCharArray()){
                if(!curr.containsKey(ch)){
                    curr.putKey(ch, new TrieNode());
                }
                curr = curr.getNode(ch);
            }
            curr.setEndWord(true);
        }
    }

    public class TrieNode{
        private HashMap<Character, TrieNode> child;
        private boolean endWord;
        private String word;

        public TrieNode(){
            child = new HashMap<>();
            word = "";
        }

        public boolean containsKey(Character key){
            return child.containsKey(key);
        }

        public TrieNode getNode(Character key){
            return child.get(key);
        }

        public void putKey(Character key, TrieNode node){
            this.child.put(key, node);
            node.word = this.word + key;
        }

        public void setEndWord(boolean flag){
            this.endWord = flag;
        }

        public boolean isEndWord(){
            return endWord;
        }

        public String getWord(){
            return this.word;
        }
    }
}
