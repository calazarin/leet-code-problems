package com.lazarin.learning.graph.disjointsets.unionbyrank;

public class UnionFindByRank {

    private int[] root;
    private int[] rank;

    public UnionFindByRank(int size){
        root = new int[size];
        rank = new int[size];
        for(int i = 0; i < size; i++){
            root[i] = i;
            rank[i] = 1;
        }
    }

    //finds a root of given node
    public int find(int node){
        int currentNode = node;
        while(currentNode != root[currentNode]){
            currentNode = root[currentNode];
        }
        return currentNode;
    }

    public void union(int nodeA, int nodeB){
        var rootA = find(nodeA);
        var rootB = find(nodeB);

        if (rootA != rootB){

            if(rank[rootA] > rank[rootB]){
                root[nodeB] = nodeA;
            } else if(rank[nodeA] < rank[nodeB]){
                root[nodeA] = nodeB;
            } else {
                root[nodeB] = nodeA;
                rank[nodeA] += 1;
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

}
