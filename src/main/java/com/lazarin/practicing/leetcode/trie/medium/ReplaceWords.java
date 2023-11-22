package com.lazarin.practicing.leetcode.trie.medium;

import java.util.List;

//https://leetcode.com/problems/replace-words/
public class ReplaceWords {

    public String replaceWords(List<String> dictionary, String sentence) {

        Trie trie = new Trie();

        for(String word : dictionary){
            trie.insert(word);
        }

        StringBuilder answer = new StringBuilder();

        String[] sentenceArr = sentence.split("\\s+");
        for(String word : sentenceArr){
            if(answer.length() > 0){
                answer.append(" ");
            }
            answer.append(trie.search(word));
        }

        return answer.toString();
    }

    class Trie{

        TrieNode rootNode;

        public Trie(){
            rootNode = new TrieNode();
        }

        //T: O(N) where N is the length of root
        public void insert(String root){
            TrieNode node = rootNode;
            for(char c : root.toCharArray()) {
                if(!node.containsKey(c)){
                    node.putKey(c, new TrieNode());
                }
                node = node.getKey(c);
            }
            node.setWord(root);
        }

        //T: O(N) where N is the length of prefix
        public String search(String word){
            TrieNode node = rootNode;
            for(char letter : word.toCharArray()){
                if(!node.containsKey(letter) || node.getWord() != null){
                    break;
                }
                node = node.getKey(letter);
            }
            return node.getWord() != null ? node.getWord() : word;
        }

    }

    class TrieNode {

        TrieNode children[];
        String word;

        public TrieNode() {
            children = new TrieNode[26];
        }

        public boolean containsKey(char key) {
            return children[key - 'a'] != null;
        }

        public void putKey(char key, TrieNode node) {
            children[key - 'a'] = node;
        }

        public TrieNode getKey(char key) {
            return children[key - 'a'];
        }

        public void setWord(String wrd) {
            this.word = wrd;
        }

        public String getWord() {
            return this.word;
        }

    }

}
