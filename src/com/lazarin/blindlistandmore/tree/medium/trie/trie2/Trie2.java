package com.lazarin.blindlistandmore.tree.medium.trie.trie2;

public class Trie2 {

    TrieNode2 root;

    public Trie2(){
        root = new TrieNode2();
    }

    // Inserts a word into the trie.
    //Time complexity : O(m)O(m), where m is the key length.
    //Space complexity : O(m)O(m).
    public void insert(String word) {
        TrieNode2 node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new TrieNode2());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }
}
