package com.lazarin.blindlistandmore.tree.easy;

import com.lazarin.blindlistandmore.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-paths/
public class BinaryTreePaths {

    public static void main(String args[]){

        TreeNode root =  new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        n2.right = n5;
        root.left = n2;
        root.right = n3;
        List<String> res = binaryTreePaths(root);
        System.out.println(res);
    }

    //approach 1 - with String: so for every recursive state we have a new string hence backtracking is not required
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        dfs(root, "", answer);
        return answer;
    }

    private static void dfs(TreeNode root,String path, List<String> answer){

        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
           answer.add(path + root.val);
        }

        if(root.left != null){
            dfs(root.left, path + root.val + "->", answer);
        }

        if(root.right != null){
            dfs(root.right, path + root.val + "->", answer);
        }
    }

    //approach 2 - with StringBuilder: whereas in case of StringBuilder we have String object which pervasive
    // through all the states (such we use same object across all the states)...so
    // here while backtracking we need to set the length explicitly to restrict the values
    // from previous state while going to next recursive state
    public static List<String> binaryTreePaths2(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs2(res, root, sb);
        return res;
    }

    private static void dfs2(List<String> res, TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }

        int len = sb.length();
        sb.append(root.val);

        if(root.left == null && root.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            dfs2(res, root.left, sb);
            dfs2(res, root.right, sb);
        }
        sb.setLength(len);
    }
}
