package com.lazarin.practicing.leetcode.disjointset.medium;


//https://leetcode.com/explore/featured/card/graph/618/disjoint-set/3845/
public class NumberOfProvinces {

    /**
     * approach - using disjoint set and counting the amount ultimate parents
     */
    public int findCircleNum(int[][] isConnected) {
        if (isConnected == null || isConnected.length == 0) {
            return 0;
        }

        int n = isConnected.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    uf.union(i, j);
                }
            }
        }

        int count = 0;
        for(int i = 0; i <  isConnected.length; i++){
            if(uf.root[i] == i){
                count++;
            }
        }
        return count;
    }

    private class UnionFind{

        public int[] root;
        public int[] rank;

        public UnionFind(int size){
            root = new int[size];
            rank = new int[size];
            for(int i = 0; i < size; i++){
                root[i] = i;
                rank[i] = 1;
            }
        }

        ///find root node with path compression
        public int find(int val){
            if(val == root[val]){
                return val;
            }
            return root[val] = find(root[val]);
        }

        //union by rank
        public void union(int x, int y){
            int root_x = find(x);
            int root_y = find(y);

            if(root_x != root_y){
                if(rank[root_x] > rank[root_y]){
                    root[y] = root_x;
                } else if(rank[root_y] > rank[root_x]){
                    root[x] = root_y;
                } else {
                    root[y] = root_x;
                    rank[root_x] += 1;
                }
            }
        }

        public boolean isConnected(int x, int y){
            return find(x) == find(y);
        }
    }
}
