package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ValidateBinarySearchTree}
 */
public class ValidateBinarySearchTreeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        ValidateBinarySearchTree solution = new ValidateBinarySearchTree();
        assertThat(solution.isValidBST(createTree()),is(false));
    }

    private TreeNode createTree(){
        TreeNode t5 = new TreeNode(5);
        TreeNode t4 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t3 = new TreeNode(3);
        t6.left = t3;
        t6.right = t7;
        t5.left = t4;
        t5.right = t6;
        return t5;
    }
}
