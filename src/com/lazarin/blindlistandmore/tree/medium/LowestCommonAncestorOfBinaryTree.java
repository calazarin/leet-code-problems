package com.lazarin.blindlistandmore.tree.medium;

import com.lazarin.blindlistandmore.tree.TreeNode;
import com.sun.source.tree.Tree;

public class LowestCommonAncestorOfBinaryTree {

    public static void main(String args[]){

    }

    /**
     * We can resort to a normal tree traversal to search for the two nodes.
     * Once we reach the desired nodes p and q, we can backtrack and find the lowest common ancestor.
     *
     *
     *
     * approach 1 - recursive
     *  T: O(N) where N is the number of nodes in the tree
     *  S: O(N)
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        var result = dfs(root, p, q);
        return result;
    }

    /** Tip: whenever we are working a tree problem, first focus on a single node
     * Then, we go from bottom to top
    **/
    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){

        if(root == null){
            return null;
        }

        if(root.val == p.val || root.val == q.val){
            return root;
        }

        var leftSearchResult = dfs(root.left, p, q);

        var rightSearchResult = dfs(root.right, p, q);

        //analyse the result from recursive call..
        if(leftSearchResult == null) return rightSearchResult;
        if(rightSearchResult == null) return leftSearchResult;

        //if left and right is found; root is the LCA
        return root;
    }
}
