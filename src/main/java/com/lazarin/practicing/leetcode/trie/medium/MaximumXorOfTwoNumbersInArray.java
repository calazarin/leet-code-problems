package com.lazarin.practicing.leetcode.trie.medium;

//https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
public class MaximumXorOfTwoNumbersInArray {

    public int findMaximumXOR(int[] nums) {

        Trie trie = new Trie();
        for(int number : nums){
            trie.insert(number);
        }

        int max = Integer.MIN_VALUE;
        for(int number : nums){
            max = Math.max(max, trie.getMax(number));
        }
        return max;
    }


    //insert: O(N x 32) where N is the size of Array 1
    //find max: O(M x 32) where M is the size of Array 2
    private class Trie{

        private TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public void insert(int number){
            TrieNode curr = this.root;
            for(int i = 31; i >= 0; i--) {
                int currBit = (number >> i) & 1; //if bit != 0, the bit is set (right shift last most right digit & 1)
                if(!curr.containsKey(currBit)) {
                    curr.put(currBit,new TrieNode());
                }
                curr = curr.get(currBit);
            }
        }

        public int getMax(int number){
            TrieNode node = this.root;
            int maxNum = 0;
            for(int i = 31; i >= 0; i--){
               int requiredBit = 1 - ((number >> i) & 1);
                if(node.containsKey(requiredBit)) {
                    maxNum = maxNum | ( 1 << i ); //left shift 1 in i positions and | (or) to get the most significant digit
                    node = node.get(requiredBit);
                } else {
                    node = node.get(1 - requiredBit);
                }
            }
            return maxNum;
        }
    }

     class TrieNode{

         TrieNode[] links;

        public TrieNode(){
            links = new TrieNode[2]; ///0 or 1
        }

        public boolean containsKey(int bit){
            return links[bit] != null;
        }

        public TrieNode get(int bit){
            return links[bit];
        }

        public void put(int bit, TrieNode node){
            links[bit] = node;
        }
    }
}
