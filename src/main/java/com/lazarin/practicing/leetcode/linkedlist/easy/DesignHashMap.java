package com.lazarin.practicing.leetcode.linkedlist.easy;

//https://leetcode.com/problems/design-hashmap/description/
public class DesignHashMap {

    /**
     * approach - use an array with a LinkedList for chaining to avoid key collision
     */
    class MyHashMap {

        int size = 10^6;
        ListNode[] map = new ListNode[size];

        public MyHashMap() {
            for(int i = 0; i < map.length; i++){
                map[i] = new ListNode(-1);
            }
        }

        //hash function
        private int hash(int key){
            return key % size;
        }

        public void put(int key, int value) {
            int index = hash(key);
            ListNode curr = map[index];
            while (curr.next != null) { //skipping initial dummy node
                if(curr.next.key == key){
                    curr.next.value = value;
                    return;
                }
                curr = curr.next;
            }
            curr.next = new ListNode(key, value);
        }

        public int get(int key) {
            int index = hash(key);
            ListNode curr = map[index].next;
            while (curr != null) {
                if(curr.key == key){
                    return curr.value;
                }
                curr = curr.next;
            }
            return -1;
        }

        public void remove(int key) {
            int index = hash(key);
            ListNode curr = map[index];
            while (curr != null && curr.next != null){
                if(curr.next.key == key) {
                    curr.next = curr.next.next;
                    return;
                }
                curr = curr.next;
            }
        }
    }

    class ListNode{
        private int key;
        private int value;
        private ListNode next;

        public ListNode(int value){
            this.value = value;
        }

        public ListNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
}
