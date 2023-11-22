package com.lazarin.practicing.leetcode.google.frequentquestions;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

public class StepByStepDirectionsFromBinaryTreeNodetoAnother2 {

    public static void main(String args[]){

       /* Input: root = [5,1,2,3,null,6,4], startValue = 3, destValue = 6
        Output: "UURL"
        Explanation: The shortest path is: 3 → 1 → 5 → 2 → 6.*/
        TreeNode n6 = new TreeNode(6);
        TreeNode n4 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        n2.left = n6;
        n2.right = n4;
        TreeNode n3 = new TreeNode(3);
        TreeNode n1 = new TreeNode(1);
        n1.left = n3;
        TreeNode n5 = new TreeNode(5);
        n5.left = n1;
        n5.right = n2;
        System.out.println(getDirections(n5, 3, 6));

       /* Input: root = [2,1], startValue = 2, destValue = 1
        Output: "L"
        Explanation: The shortest path is: 2 → 1.*/

    }

    public static String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode ancestor = lowestCommonAncestor(root, startValue, destValue);

        StringBuilder startSb = new StringBuilder(), destinationSb = new StringBuilder();

        getDirection(ancestor, startValue, startSb);
        getDirection(ancestor, destValue, destinationSb);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < startSb.length(); i++) {
            sb.append("U");
        }

        for (char ch : destinationSb.toString().toCharArray()) {
            var j = startSb.length();
            sb.insert(j, ch);
        }
        return sb.toString();
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null || p == root.val || q == root.val) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        } else {
            return left == null ? right : left;
        }
    }

    private static boolean getDirection(TreeNode n, int val, StringBuilder sb) {
        if (n.val == val) {
            return true;
        }
        if (n.left != null && getDirection(n.left, val, sb)) {
            sb.append("L");
        } else if (n.right != null && getDirection(n.right, val, sb)){
            sb.append("R");
        }
        return sb.length() > 0;
    }
}