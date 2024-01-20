package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link AverageOfLevelInBinaryTree}
 */
public class AverageOfLevelInBinaryTreeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        AverageOfLevelInBinaryTree solution = new AverageOfLevelInBinaryTree();
        assertThat(solution.averageOfLevels(createTree()), is(Arrays.asList(3d, 14.5d, 11d)));
    }


    private AverageOfLevelInBinaryTree.TreeNode createTree(){
        AverageOfLevelInBinaryTree.TreeNode rootTree1 = new AverageOfLevelInBinaryTree(). new TreeNode(3);
        AverageOfLevelInBinaryTree.TreeNode n1 = new AverageOfLevelInBinaryTree(). new TreeNode(9);
        AverageOfLevelInBinaryTree.TreeNode n2 = new AverageOfLevelInBinaryTree(). new TreeNode(20);
        AverageOfLevelInBinaryTree.TreeNode n3 = new AverageOfLevelInBinaryTree(). new TreeNode(15);
        AverageOfLevelInBinaryTree.TreeNode n4 = new AverageOfLevelInBinaryTree(). new TreeNode(7);

        n1.left = n3;
        n1.right = n4;
        rootTree1.left = n1;
        rootTree1.right = n2;
        return rootTree1;
    }
}
