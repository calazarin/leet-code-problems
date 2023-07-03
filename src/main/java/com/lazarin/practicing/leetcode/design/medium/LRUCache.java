package com.lazarin.practicing.leetcode.design.medium;

import java.util.HashMap;

//https://leetcode.com/problems/lru-cache/
public class LRUCache {

    private int capacity = 0;
    private HashMap<Integer, Node> cache = new HashMap<>();

    //LRU (least recently used) pointer
    private Node left;
    //MRU (most recently used) pointer
    private Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        //left = LRU
        //right = MRU
        left = new Node(0,0);
        right = new Node(0,0);
        left.next = right;
        right.prev = left;
    }

    //remove from list (removing from the middle of our two pointers)
    private void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;

        prev.next =  next;
        next.prev = prev;
    }

    //insert at right (insert in the middle of our two pointers)
    private void insert(Node node){
        Node prev = right.prev;
        Node next = right;

        prev.next = node;
        next.prev = node;

        node.next = next;
        node.prev = prev;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Node curr = cache.get(key);
            //update double linked list removing the node from left and inserting in the right
            remove(curr);
            insert(curr);
            return curr.value;
        }
        return -1;
    }

    //how do we define a "used" key?
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node curr = cache.get(key);
            //update double linked list removing the node from left
            remove(curr);
        }
        Node newNode = new Node(key, value);
        cache.put(key,newNode);
        insert(newNode);

        if(cache.size() > capacity){
            //remove from the list and delete the LRU from cache
            Node lur = left.next;
            remove(lur);
            cache.remove(lur.key);
        }
    }
}
