package com.lazarin.practicing.leetcode.tree.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MaximumBinaryTree}
 */
public class MaximumBinaryTreeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        MaximumBinaryTree solution = new MaximumBinaryTree();
        MaximumBinaryTree.TreeNode resp = solution.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        assertThat(inOrder(resp), is(Arrays.asList(3,2,1,6,0,5)));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        MaximumBinaryTree solution = new MaximumBinaryTree();
        MaximumBinaryTree.TreeNode resp = solution.constructMaximumBinaryTree_2(new int[]{3,2,1,6,0,5});
        assertThat(inOrder(resp), is(Arrays.asList(3,2,1,6,0,5)));

    }

    private List<Integer> inOrder(MaximumBinaryTree.TreeNode root){
        List<Integer> nums = new ArrayList<>();
        helper(root, nums);
        return nums;
    }

    private void helper(MaximumBinaryTree.TreeNode root, List<Integer> nums) {
        if(root == null) return;;
        helper(root.left, nums);
        nums.add(root.val);
        helper(root.right, nums);
    }
}
