package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link SameTree}
 */
public class SameTreeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        SameTree solution = new SameTree();
        assertThat(solution.isSameTree(createTree1(), createTree2()), is(false));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        SameTree solution = new SameTree();
        assertThat(solution.isSameTree2(createTree1(), createTree2()), is(false));
    }

    private TreeNode createTree1(){
        TreeNode rootTree1 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        rootTree1.left = n1;
        rootTree1.right = n2;
        return rootTree1;
    }

    private TreeNode createTree2(){
        TreeNode rootTree2 = new TreeNode(1);
        TreeNode n1_1 = new TreeNode(1);
        TreeNode n2_2 = new TreeNode(2);
        rootTree2.left = n1_1;
        rootTree2.right = n2_2;
        return rootTree2;
    }
}
