package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CountCompleteTreeNodes}
 */
public class CountCompleteTreeNodesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();
        assertThat(solution.countNodes(createTree()), is(6));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();
        assertThat(solution.countNodes_2(createTree()), is(6));
    }

    private CountCompleteTreeNodes.TreeNode createTree(){
        CountCompleteTreeNodes.TreeNode rootTree1 = new CountCompleteTreeNodes(). new TreeNode(1);
        CountCompleteTreeNodes.TreeNode n1 = new CountCompleteTreeNodes(). new TreeNode(2);
        CountCompleteTreeNodes.TreeNode n2 = new CountCompleteTreeNodes(). new TreeNode(3);
        CountCompleteTreeNodes.TreeNode n3 = new CountCompleteTreeNodes(). new TreeNode(4);
        CountCompleteTreeNodes.TreeNode n4 = new CountCompleteTreeNodes(). new TreeNode(5);
        CountCompleteTreeNodes.TreeNode n5 = new CountCompleteTreeNodes(). new TreeNode(6);
        n2.left = n5;
        n1.left = n3;
        n1.right = n4;
        rootTree1.left = n1;
        rootTree1.right = n2;
        return rootTree1;
    }
}
