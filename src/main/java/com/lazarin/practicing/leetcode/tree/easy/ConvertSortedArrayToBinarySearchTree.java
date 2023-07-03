package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.tree.TreeNode;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class ConvertSortedArrayToBinarySearchTree {


    //Notes:
    //1. the tree should be height-balanced, i.e. the depths of the two subtrees of every node never differ by more than 1.
    //2. It's known that inorder traversal of BST is an array sorted in the ascending order.
    //3. From these traversals one could restore the inorder one: inorder = sorted(postorder) = sorted(preorder)
    //4. Basically, the height-balanced restriction means that at each step one has to pick up the number in the middle as a root.
    public static void main(String args[]){

    }

    int[] nums;


    //T: O(N): since we visit each node exactly once.
    //S: O(logN): recursion stack requires O(\log N)O(logN) space because the tree is height-balanced.
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }

    public TreeNode helper(int left, int right) {
        if (left > right) return null;

        // always choose left middle node as a root
        int p = (left + right) / 2;

        // preorder traversal: node -> left -> right
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }

}
