package com.lazarin.practicing.leetcode.tree.medium.trie;

public class WordDictionary {
    //Trie => prefix tree
    //
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    //Adds word to the data structure, it can be matched later.
    //T: O(M) where M is the key length
    //S: O(M) we might need to add at the maximum M new nodes if they don't exist in the trie
    public void addWord(String word) {

        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){

            if(node.getNodes().containsKey(word.charAt(i))){
                node = node.getNodes().get(word.charAt(i));
            } else {
                TrieNode newNode = new TrieNode();
                node.getNodes().put(word.charAt(i), newNode);
                node = newNode;
            }
        }
        node.setWordEnding(true);
    }

    //Returns true if there is any string in the data structure that matches word or false otherwise.
    // word may contain dots '.' where dots can be matched with any letter.
    public boolean search(String word) {
        return searchWorld(root, word);
    }

    private boolean searchWorld(TrieNode node, String word){
        for(int i = 0; i < word.length(); i++){
            if(!node.getNodes().containsKey(word.charAt(i))){
                // if the current character is '.'
                // check all possible nodes at this level
                if(word.charAt(i) ==  '.'){
                    for(Character key : node.getNodes().keySet()){
                        if(searchWorld(node.getNodes().get(key), word.substring(i + 1))){
                            return true;
                        }
                    }
                }
                // if no nodes lead to answer
                // or the current character != '.'
                return false;
            } else {
                // if the character is found
                // go down to the next level in trie
                node = node.getNodes().get(word.charAt(i));
            }
        }
        return node.isWordEnding();
    }
}
