package com.lazarin.practicing.leetcode.linkedlist.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/design-hashset/
public class DesignHashSet {

    //approach 1
    public class MyHashSet {

        private int size;
        private List<List<Integer>> buckets;

        public MyHashSet() {
            size = 1000;
            buckets = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                //Each index of the bucket will contain a linked list or a similar data structure to store the elements with the same hash value.
                buckets.add(new LinkedList<>());
            }
        }

        //calculate the hash value of the key and insert it into the corresponding bucket if it doesn't already exist.
        //collisions are handled by chaining (linked list)
        public void add(int key) {
            int index = hash(key);
            List<Integer> bucket = buckets.get(index);
            if (!bucket.contains(key)) {
                bucket.add(key);
            }
        }

        //calculate the hash value of the key, find the corresponding bucket, and remove the element from it if it exists.
        public void remove(int key) {
            int index = hash(key);
            List<Integer> bucket = buckets.get(index);
            bucket.remove(Integer.valueOf(key));
        }

        public boolean contains(int key) {
            int index = hash(key);
            List<Integer> bucket = buckets.get(index);
            return bucket.contains(key);
        }

        //hashing function to map the keys to specific indices in the bucket.
        private int hash(int key) {
            return key % size;
        }
    }


    //approach 2 (slower than approach 1 and not space efficient)
    public class MyHashSet2 {
        private boolean[] mp;

        public MyHashSet2() {
            mp = new boolean[1000001];
        }

        public void add(int key) {
            mp[key] = true;
        }

        public void remove(int key) {
            mp[key] = false;
        }

        public boolean contains(int key) {
            return mp[key];
        }
    }
}
