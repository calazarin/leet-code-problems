package com.lazarin.learning.leetcode.trie;


public class TrieNode {

    private boolean flag;
    private TrieNode links[];

    public TrieNode(){
        links = new TrieNode[26];
        flag = false;
    }

    public boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }

    public void put(char ch, TrieNode node){
        links[ch - 'a'] = node;
    }

    public TrieNode getTrieNodeAt(char ch){
        return links[ch - 'a'];
    }

    public void setEnd(){
        this.flag = true;
    }

    public boolean isEnd(){
        return flag;
    }
}
