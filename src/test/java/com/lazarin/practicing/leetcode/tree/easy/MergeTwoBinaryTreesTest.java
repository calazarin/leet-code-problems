package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MergeTwoBinaryTrees}
 */
public class MergeTwoBinaryTreesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        MergeTwoBinaryTrees solution = new MergeTwoBinaryTrees();
        MergeTwoBinaryTrees.TreeNode resp = solution.mergeTrees(createTree_1(), createTree_2());
        List<Integer> expected = new ArrayList<>();
        inOrder(createTree_3(), expected);
        List<Integer> returned = new ArrayList<>();
        inOrder(resp, returned);
        assertThat(returned, is(expected));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        MergeTwoBinaryTrees solution = new MergeTwoBinaryTrees();
        MergeTwoBinaryTrees.TreeNode resp = solution.mergeTrees(createTree_1(), createTree_2());
        List<Integer> expected = new ArrayList<>();
        inOrder(createTree_3(), expected);
        List<Integer> returned = new ArrayList<>();
        inOrder(resp, returned);
        assertThat(returned, is(expected));
    }

    private void inOrder(MergeTwoBinaryTrees.TreeNode root, List<Integer> values){
        if(root == null) return;
        inOrder(root.left,values);
        values.add(root.val);
        inOrder(root.right, values);
    }

    private MergeTwoBinaryTrees.TreeNode createTree_1(){
        MergeTwoBinaryTrees.TreeNode rootTree1 = new MergeTwoBinaryTrees(). new TreeNode(1);
        MergeTwoBinaryTrees.TreeNode n1 = new MergeTwoBinaryTrees(). new TreeNode(3);
        MergeTwoBinaryTrees.TreeNode n2 = new MergeTwoBinaryTrees(). new TreeNode(2);
        MergeTwoBinaryTrees.TreeNode n3 = new MergeTwoBinaryTrees(). new TreeNode(5);
        n1.left = n3;
        rootTree1.left = n1;
        rootTree1.right = n2;
        return rootTree1;
    }

    private MergeTwoBinaryTrees.TreeNode createTree_2(){
        MergeTwoBinaryTrees.TreeNode rootTree1 = new MergeTwoBinaryTrees(). new TreeNode(2);
        MergeTwoBinaryTrees.TreeNode n1 = new MergeTwoBinaryTrees(). new TreeNode(1);
        MergeTwoBinaryTrees.TreeNode n2 = new MergeTwoBinaryTrees(). new TreeNode(3);
        MergeTwoBinaryTrees.TreeNode n3 = new MergeTwoBinaryTrees(). new TreeNode(4);
        MergeTwoBinaryTrees.TreeNode n4 = new MergeTwoBinaryTrees(). new TreeNode(7);
        n1.right = n3;
        n2.right = n4;
        rootTree1.left = n1;
        rootTree1.right = n2;
        return rootTree1;
    }

    private MergeTwoBinaryTrees.TreeNode createTree_3(){
        MergeTwoBinaryTrees.TreeNode rootTree1 = new MergeTwoBinaryTrees(). new TreeNode(3);
        MergeTwoBinaryTrees.TreeNode n1 = new MergeTwoBinaryTrees(). new TreeNode(4);
        MergeTwoBinaryTrees.TreeNode n2 = new MergeTwoBinaryTrees(). new TreeNode(5);

        MergeTwoBinaryTrees.TreeNode n3 = new MergeTwoBinaryTrees(). new TreeNode(5);
        MergeTwoBinaryTrees.TreeNode n4 = new MergeTwoBinaryTrees(). new TreeNode(4);

        MergeTwoBinaryTrees.TreeNode n5 = new MergeTwoBinaryTrees(). new TreeNode(7);

        n1.right = n4;
        n1.left = n3;
        n2.right = n5;

        rootTree1.left = n1;
        rootTree1.right = n2;
        return rootTree1;
    }
}
