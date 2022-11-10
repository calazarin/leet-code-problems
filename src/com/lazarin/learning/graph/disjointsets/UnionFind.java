package com.lazarin.learning.graph.disjointsets;

public class UnionFind {

    private int[] root;

    //paren: 0 - 0 - 1 - 3 - 4 - 5 - 6
    //index: 0 - 1 - 2 - 3 - 4 - 5 - 6
    public UnionFind(int size){
        root = new int[size];
        for(int i = 0; i < size; i++){
            root[i] = i;
        }
    }

    //unions two vertices and makes their root nodes the same
    public void union(int nodeA, int nodeB){
        var rootNodeA = find(nodeA);
        var rootNodeB = find(nodeB);

        if(rootNodeA != rootNodeB){
            for(int i = 0; i < root.length; i++){
                if(root[i] == nodeB){
                    root[i] = rootNodeA;
                }
            }
        }
    }

    //T: O(1)
    public boolean connected(int nodeA, int nodeB){
        return find(nodeA) == find(nodeB);
    }

    // finds the root node of a given vertex.
    //T: O(N)
    public int find2(int vertex){
        int root = this.root[vertex];
        while(root != vertex){
            root = this.root[root];
        }
        return root;
    }

    //with quick find, during union operation we replace the root for the most root
    //element
    //T: O(1)
    public int find(int vertex){
        return root[vertex];
    }

    //quick union operation
    //T: O(N)
    public void union2(int nodeA, int nodeB){
        int rootA = find2(nodeA);
        int rootB = find2(nodeB);
        if(rootA != rootB){
            root[nodeB] = rootA;
        }
    }
}
