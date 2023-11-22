package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

/**
 * {@link BinaryTreeLevelOrderTraversal}
 */
public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        assertThat(solution.levelOrder(createTree()), hasItems(
                Arrays.asList(3),
                Arrays.asList(9,20),
                Arrays.asList(15,7)
        ));
    }

    private TreeNode createTree(){
        TreeNode tree = new TreeNode(3);
        TreeNode tree9 = new TreeNode(9);
        TreeNode tree20 = new TreeNode(20);
        TreeNode tree15 = new TreeNode(15);
        TreeNode tree7 = new TreeNode(7);
        tree20.left = tree15;
        tree20.right = tree7;
        tree.left = tree9;
        tree.right = tree20;
        return tree;
    }
}
