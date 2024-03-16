package com.lazarin.practicing.leetcode.tree.medium;

//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/
public class ConstructBinarySearchTreeFromPreorderTraversal {

    /**
     * approach: efficient solution - O(N) using upper bound
     * Pre-order: root->left->right
     * Possible solutions:
     * 1st - naive insert left and right based on its value
     * 2nd - using in-order array (sort elements); if pre-order and in order element we can create a BST (https://www.youtube.com/watch?v=aZNaLrVebKQ)
     * 3tr - more efficient - using an upper bound -> T:O(N); S:O(1)
     */
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorderAux(preorder, Integer.MAX_VALUE, new int[]{0});
    }

    //using index as an array just to pass the index variable as reference not value
    private TreeNode bstFromPreorderAux(int[] nums, int bound, int[] index) {
        if(index[0] == nums.length || nums[index[0]] > bound){
            return  null;
        }
        TreeNode root = new TreeNode(nums[index[0]]);
        index[0] = index[0] + 1;
        root.left = bstFromPreorderAux(nums, root.val, index);
        root.right = bstFromPreorderAux(nums, bound, index);
        return root;
    }

    /**
     * approach - using pre-order + in-order
     */
    public TreeNode bstFromPreorder2(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int start, int end){

        if(start > end) return null;

        TreeNode node = new TreeNode(preorder[start]);
        int i;
        for (i = start; i <= end; i++) {
            if (preorder[i] > node.val) {
                break;
            }
        }
        node.left = helper(preorder, start + 1, i - 1);
        node.right = helper(preorder, i, end);
        return node;
    }

    //approach - construct the tree iteratively
    public TreeNode bstFromPreorder3(int[] preorder){

        if(preorder == null) {
            return null;
        }

        int size = preorder.length;
        if(size == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        for(int i = 1; i < size; i++){
            generateBst(preorder[i], root);
        }

        return root;
    }

    private void generateBst(int target, TreeNode subTree) {
        TreeNode root = subTree;
        TreeNode node = new TreeNode(target);

        while (root != null) {
            if(target < root.val) { //if the value < root all to the left
                if(root.left == null) {
                    root.left = node;
                    break;
                } else {
                    root = root.left;
                }
            } else { //otherwise, all to the right
                if(root.right == null) {
                    root.right = node;
                    break;
                } else {
                    root = root.right;
                }
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
