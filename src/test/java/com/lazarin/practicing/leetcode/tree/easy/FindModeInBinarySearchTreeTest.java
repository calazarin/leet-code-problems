package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindModeInBinarySearchTree}
 */
public class FindModeInBinarySearchTreeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        FindModeInBinarySearchTree solution = new FindModeInBinarySearchTree();
        assertThat(solution.findMode(createTree()), is(new int[]{2}));
    }

    private FindModeInBinarySearchTree.TreeNode createTree(){
        FindModeInBinarySearchTree.TreeNode rootTree1 = new FindModeInBinarySearchTree(). new TreeNode(1);
        FindModeInBinarySearchTree.TreeNode n1 = new FindModeInBinarySearchTree(). new TreeNode(2);
        FindModeInBinarySearchTree.TreeNode n2 = new FindModeInBinarySearchTree(). new TreeNode(2);
        n1.left = n2;
        rootTree1.right = n1;
        return rootTree1;
    }
}
