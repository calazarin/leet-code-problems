package com.lazarin.learning.leetcode.disjointsets.pathcompreesion.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Disjoint set with path compression; union by rank and union by size
 * both are O(1)
 */
public class DisjointSet {

    private List<Integer> rank = new ArrayList<>();
    private List<Integer> parent = new ArrayList<>();

    private List<Integer> size = new ArrayList<>();

    public DisjointSet(int n){
        //it works for 0-based and 1-based graphs
        for(int i = 0; i <= n; i++){
            rank.add(0); //all node initialized with rank as 0
            parent.add(i); //first sets the ultimate parent as itself
            size.add(1); //at the beginning all node have size 1 (itself)
        }
    }

    public int findUltParent(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ultParent = findUltParent(parent.get(node));
        //patch compression
        parent.set(node, ultParent);
        return parent.get(node);
    }

    public void unionByRank(int u, int v){
        int ultParentU = findUltParent(u);
        int ultParentV = findUltParent(v);
        if(ultParentU == ultParentV){
            return;
        }
        if(ultParentU < ultParentV){
            //smaller node goes under larger one
            parent.set(ultParentU, ultParentV);
        } else if(ultParentV < ultParentU){
            parent.set(ultParentV, ultParentU);
        } else {
            parent.set(ultParentV, ultParentU);
            int rankU = rank.get(ultParentU);
            rank.set(rankU, rankU + 1);
        }
    }

    public void unionBySize(int u, int v){
        int ultParentU = findUltParent(u);
        int ultParentV = findUltParent(v);
        if(ultParentU == ultParentV) return;
        if(size.get(ultParentU) < size.get(ultParentV)){
            parent.set(ultParentU, ultParentV);
            size.set(ultParentV, size.get(ultParentU) + size.get(ultParentV));
        } else {
            parent.set(ultParentV, ultParentU);
            size.set(ultParentU, size.get(ultParentU) + size.get(ultParentV));
        }
    }

    public boolean connected(int u, int v){
        return findUltParent(u) == findUltParent(v);
    }
}
