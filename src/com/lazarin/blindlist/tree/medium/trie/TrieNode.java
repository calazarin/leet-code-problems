package com.lazarin.blindlist.tree.medium.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private Map<Character, TrieNode> nodes;
    private boolean isWordEnding;

    public TrieNode(){
        this.nodes = new HashMap<>();
        this.isWordEnding = false;
    }

    public Map<Character, TrieNode> getNodes() {
        return nodes;
    }

    public void setNodes(Map<Character, TrieNode> nodes) {
        this.nodes = nodes;
    }

    public boolean isWordEnding() {
        return isWordEnding;
    }

    public void setWordEnding(boolean wordEnding) {
        isWordEnding = wordEnding;
    }
}
