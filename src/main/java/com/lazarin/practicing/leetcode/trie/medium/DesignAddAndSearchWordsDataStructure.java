package com.lazarin.practicing.leetcode.trie.medium;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/design-add-and-search-words-data-structure/
public class DesignAddAndSearchWordsDataStructure {

    public class WordDictionary {

        private TrieNode root;

        public WordDictionary() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            if (word != null && word != "") {
                TrieNode current = root;
                for (Character c : word.toCharArray()) {
                    if (!current.containsKey(c)) {
                        current.putKey(c, new TrieNode());
                    }
                    current = current.getNode(c);
                }
                current.setEnd();
            }
        }

        public boolean search(String word) {
            return dfs(word, root);
        }

        private boolean dfs(String word, TrieNode root){
            TrieNode current = root;
            for(int i = 0 ; i < word.length(); i++) {
                if(word.charAt(i) == '.') {
                    Map<Character, TrieNode> currMap = current.getMap();
                    for(TrieNode node : currMap.values()){
                        if(dfs(word.substring(i + 1), node)){
                            return true;
                        }
                    }
                    return false;
                } else {
                    if (!current.containsKey(word.charAt(i))){
                        return false;
                    }
                    current = current.getNode(word.charAt(i));
                }
            }
            return current.isEnd();
        }

    }

    private class TrieNode{

        private Map<Character, TrieNode> map;
        private boolean end;

        public TrieNode(){
            end = false;
            map = new HashMap<>();
        }

        public void putKey(Character key, TrieNode node){
            map.putIfAbsent(key, node);
        }

        public boolean containsKey(Character key){
            return map.containsKey(key);
        }

        public TrieNode getNode(Character key){
            return map.get(key);
        }

        public void setEnd(){
            this.end = true;
        }

        public boolean isEnd(){
            return end;
        }

        public Map<Character, TrieNode> getMap(){
            return map;
        }
    }

}


