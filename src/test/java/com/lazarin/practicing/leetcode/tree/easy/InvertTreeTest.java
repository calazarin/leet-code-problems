package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link InvertTree}
 */
public class InvertTreeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        InvertTree solution = new InvertTree();
        assertThat(solution.invertTree(createTree()), is(createExpectedTree()));
    }

    private TreeNode createExpectedTree(){
        TreeNode rootTree2 = new TreeNode(1);
        TreeNode n1_1 = new TreeNode(1);
        TreeNode n2_2 = new TreeNode(2);
        rootTree2.left = n1_1;
        rootTree2.right = n2_2;
        return rootTree2;
    }

    private TreeNode createTree(){
        TreeNode rootTree1 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        rootTree1.left = n1;
        rootTree1.right = n2;
        return rootTree1;
    }
}
