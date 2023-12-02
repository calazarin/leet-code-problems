package com.lazarin.practicing.leetcode.trie.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/search-suggestions-system
public class SearchSuggestionSystem {

    /**
     * approach 1 - binary search
     * T: O(nlog(n)) + O(mlog(n)); n is the length of products nad m is the length of each word
     * S: betwen O(1) and O(n) where n is the length of products
     */
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        //first sort the input array
        Arrays.sort(products); //O(nlog(n))

        List<List<String>> answers = new ArrayList<>();
        int start = 0, bsStart = 0, n = products.length;

        String prefix = new String();
        for(char c : searchWord.toCharArray()){
            prefix += c;
            //O(mlog(n))
            start = lowerBound(products, bsStart, prefix);
            answers.add(new ArrayList());

            for(int i = start; i < Math.min(start + 3, n); i++){
                if(products[i].length() < prefix.length() ||
                        !products[i].substring(0, prefix.length()).equals(prefix)){
                    break;
                }
                answers.get(answers.size() - 1).add(products[i]);
            }

            bsStart = Math.abs(start);
        }

        return answers;
    }

    private int lowerBound(String[] products, int start, String word){
        int i = start, j = products.length, mid;
        while(i < j) {

            mid = (i + j) / 2;
            if(products[mid].compareTo(word) >= 0) { //O(1)
                j = mid;
            } else {
                i = mid + 1;
            }

        }
        return i;
    }

    /**
     * approach 2 - trie
     * T: O(M) to build the trie where M is total number of characters in products
     * and O(len(prefix) to find a possible representative + dfs
     * S: O(n) with n nodes in the three (26 alphabet characters)
     */
    public List<List<String>> suggestedProducts_2(String[] products, String searchWord) {

        List<List<String>> answers = new ArrayList<>();

        Trie trie = new Trie();
        trie.insert(products);

        String prefix = new String();
        for(Character c : searchWord.toCharArray()){
            prefix += c;
            answers.add(trie.search(prefix));
        }
        return answers;
    }

    private class Trie{

        private TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public void insert(String[] words){
            for(String word : words) {
                TrieNode curr = root;
                for(int i  = 0; i < word.length(); i++){
                    char c = word.charAt(i);
                    if(!curr.contains(c)){
                        curr.put(c, new TrieNode());
                    }
                    curr = curr.get(c);
                }
                curr.setIsWord(true);
            }
        }

        public List<String> search(String prefix){
            TrieNode curr = root;
            List<String> partialResult = new ArrayList<>();

            for(Character c : prefix.toCharArray()) {
                if(!curr.contains(c)){
                    return partialResult;
                }
                curr = curr.get(c);
            }

            dfs(curr, prefix, partialResult);
            return partialResult;
        }

    }

    //dfs from given prefix and all complete words limiting it to 3
    private void dfs(TrieNode node, String prefix, List<String> partialResult){
        if(partialResult.size() == 3){
            return;
        }
        if(node.isWord()){
            partialResult.add(prefix);
        }
        //run dfs on all possible paths
        for(char c = 'a'; c <= 'z'; c++){
            if(node.get(c) != null){
                dfs(node.get(c), prefix + c, partialResult);
            }
        }
    }

    private class TrieNode{
        private TrieNode[] links = new TrieNode[26];
        private boolean isWord = false;

        public TrieNode[] getLinks(){
            return links;
        }

        public boolean contains(char c){
            return links[c - 'a'] != null;
        }

        public void put(char c, TrieNode node) {
            links[c - 'a'] = node;
        }

        public TrieNode get(char c){
            return links[c - 'a'];
        }

        public boolean isWord(){
            return this.isWord;
        }

        public void setIsWord(boolean flag){
            this.isWord = flag;
        }
    }
}
