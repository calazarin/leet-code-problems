package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link CountNodesEqualToAverageOfSubtree}
 */
public class CountNodesEqualToAverageOfSubtreeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1( ) {
        CountNodesEqualToAverageOfSubtree solution =
                new CountNodesEqualToAverageOfSubtree();

        assertThat(solution.averageOfSubtree(createTree()), is(5));
    }

    private CountNodesEqualToAverageOfSubtree.TreeNode createTree(){
        CountNodesEqualToAverageOfSubtree solution = new CountNodesEqualToAverageOfSubtree();
        CountNodesEqualToAverageOfSubtree.TreeNode root =
                solution.new TreeNode(4);
        root.left = solution. new TreeNode(8,solution.new TreeNode(0), solution.new TreeNode(1));
        root.right = solution. new TreeNode(5,null, solution.new TreeNode(6));
        return root;
    }
}
