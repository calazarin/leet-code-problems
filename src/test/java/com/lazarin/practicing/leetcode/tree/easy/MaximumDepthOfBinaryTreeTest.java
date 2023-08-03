package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;
import com.lazarin.practicing.leetcode.tree.TreeNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaximumDepthOfBinaryTree}
 */
public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        assertThat(solution.maxDepth(createTree()), is(3));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        assertThat(solution.maxDepth2(createTree()), is(3));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {

        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        assertThat(solution.maxDepth3(createTree()), is(3));

    }

    private TreeNode createTree(){
        TreeNode root = new TreeNode(3);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(15);
        TreeNode n4 = new TreeNode(7);
        n2.right = n4;
        n2.left = n3;
        root.left = n1;
        root.right = n2;
        return root;
    }
}
