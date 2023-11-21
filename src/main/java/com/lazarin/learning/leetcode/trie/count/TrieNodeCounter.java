package com.lazarin.learning.leetcode.trie.count;

public class TrieNodeCounter {

    private TrieNodeCounter links[];
    private int countPrefix;
    private int countWord;

    public TrieNodeCounter(){
        links = new TrieNodeCounter[26];
        countPrefix = 0;
        countWord = 0;
    }

    public void incrementCountWord(){
        countWord++;
    }

    public void incrementCountPrefix(){
        countPrefix++;
    }

    public int getCountPrefix(){
        return countPrefix;
    }

    public int getCountWord(){
        return countWord;
    }

    public void deleteWord(){
        this.countWord--;
    }

    public void deletePrefix(){
        this.countPrefix--;
    }

    public boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }

    public TrieNodeCounter getNode(char ch){
        return links[ch - 'a'];
    }

    public void put(char ch, TrieNodeCounter node){
        this.links[ch - 'a'] = node;
    }
}
