package com.lazarin.learning.leetcode.trie;

/**
 * A trie is a data structure with 3 methods:
 * 1) insert
 * 2) search
 * 3) startsWith
 *
 * I also has a trie node with 2 attributes:
 * 1) an array with size as 26
 * 2) a flag indicating if it is a terminator
 */
public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    //T: O(N) where N is the length of given word
    public void insert(String word){
        TrieNode node = root;

        for(int i  = 0; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new TrieNode());
            }
            //moves to the next trie node
            node = node.getTrieNodeAt(word.charAt(i));
        }

        node.setEnd();
    }

    //T: O(N) where N is the length of given word
    public boolean search(String word){
        TrieNode node = root;

        for(int i = 0; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.getTrieNodeAt(word.charAt(i));
        }

        return node.isEnd();
    }

    //T: O(N) where N is the length of given word
    public boolean startsWith(String prefix){

        TrieNode node = root;

        for(int i = 0; i < prefix.length(); i++){
            if(!node.containsKey(prefix.charAt(i))){
                return false;
            }
            node = node.getTrieNodeAt(prefix.charAt(i));
        }

        return true;
    }

}
