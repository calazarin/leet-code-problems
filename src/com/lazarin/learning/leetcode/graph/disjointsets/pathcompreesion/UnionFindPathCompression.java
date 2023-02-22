package com.lazarin.learning.graph.disjointsets.pathcompreesion;

public class UnionFindPathCompression {

    int[] root;

    public UnionFindPathCompression(int size){
        root = new int[size];
        for(int i = 0; i < size; i++){
            root[i] = i;
        }
    }

    //find a node using path compression
    public int find(int val){
        if(val == root[val]){
            return val;
        }
        return root[val] = find(root[val]);
    }

    public void union(int x, int y){
        var rootX = find(x);
        var rootY = find(y);
        if(rootX != rootY){
            root[y] = rootX;
        }
    }

    public boolean connected(int x, int y){
        return find(x) == find(y);
    }
}
