package com.lazarin.practicing.leetcode.tree.medium.trie;

import java.util.HashMap;

//https://leetcode.com/problems/map-sum-pairs/
public class MapSumPairs {

    //approach 1 - brute force
    public class MapSum {
        HashMap<String, Integer> map;

        public MapSum() {
            map = new HashMap<>();
        }

        //T: O:(1)
        public void insert(String key, int val) {
            map.put(key, val);
        }

        //T: O(N*P) where N is the size of map and P the prefix length
        public int sum(String prefix) {
            int ans = 0;
            for (String key: map.keySet()) {
                if (key.startsWith(prefix)) {
                    ans += map.get(key);
                }
            }
            return ans;
        }
    }
}
