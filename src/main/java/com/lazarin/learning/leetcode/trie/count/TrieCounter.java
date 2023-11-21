package com.lazarin.learning.leetcode.trie.count;


/**
 * Trie counting prefix and words
 */
public class TrieCounter {

    private TrieNodeCounter root;

    public TrieCounter(){
        root = new TrieNodeCounter();
    }

    public void insert(String word){
        TrieNodeCounter node = root;
        for(int i = 0; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new TrieNodeCounter());
            }
            node = node.getNode(word.charAt(i));
            node.incrementCountPrefix();
        }
        node.incrementCountWord();
    }

    public int countWordsEqualTo(String word){
        TrieNodeCounter node = root;
        for(int i = 0; i < word.length(); i++){
            if(node.containsKey(word.charAt(i))){
                node = node.getNode(word.charAt(i));
            } else {
                return 0;
            }
        }
        return node.getCountWord();
    }

    public int countWordsStartingWith(String word){
        TrieNodeCounter node = root;
        for(int i = 0; i < word.length(); i++){
            if(node.containsKey(word.charAt(i))){
                node = node.getNode(word.charAt(i));
            } else {
                return 0;
            }
        }
        return node.getCountPrefix();
    }

    public void erase(String word){
        TrieNodeCounter node = root;
        for(int i  = 0; i < word.length(); i++){
            if(node.containsKey(word.charAt(i))){
                node = node.getNode(word.charAt(i));
                node.deletePrefix();
            } else {
                return;
            }
        }
        node.deleteWord();
    }
}
