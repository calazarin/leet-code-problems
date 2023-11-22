package com.lazarin.practicing.leetcode.trie.medium;

public class Trie {

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode lastVisitedNode = root;
        for(int i = 0; i < word.length(); i++){
            var c = word.charAt(i);
            TrieNode node = lastVisitedNode.getNodes().get(c);
            if(node != null){
                lastVisitedNode = node;
            } else {
                TrieNode newNode = new TrieNode();
                lastVisitedNode.getNodes().put(c, newNode);
                lastVisitedNode = newNode;
            }
        }
        lastVisitedNode.setWordEnding(true);
    }

    public boolean search(String word) {
        if(root.getNodes().isEmpty()) return false;

        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            var c = word.charAt(i);

            TrieNode searchNode = node.getNodes().get(c);
            if(searchNode == null){
                return false;
            }
            node = searchNode;
        }
        return node.isWordEnding();
    }

    public boolean startsWith(String prefix) {
        if(root.getNodes().isEmpty()) return false;
        TrieNode node = root;
        for(int i = 0; i < prefix.length(); i++){
            var c = prefix.charAt(i);
            TrieNode currentNode = node.getNodes().get(c);
            if(currentNode != null){
                node = currentNode;
            } else {
                return false;
            }
        }
        return true;
    }

}
