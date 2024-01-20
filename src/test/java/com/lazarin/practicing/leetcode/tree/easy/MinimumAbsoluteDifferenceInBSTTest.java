package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MinimumAbsoluteDifferenceInBST}
 */
public class MinimumAbsoluteDifferenceInBSTTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        MinimumAbsoluteDifferenceInBST solution = new MinimumAbsoluteDifferenceInBST();
        assertThat(solution.getMinimumDifference(createTree()), is(1));
    }

    private MinimumAbsoluteDifferenceInBST.TreeNode createTree(){
        MinimumAbsoluteDifferenceInBST.TreeNode rootTree1 = new MinimumAbsoluteDifferenceInBST(). new TreeNode(4);
        MinimumAbsoluteDifferenceInBST.TreeNode n1 = new MinimumAbsoluteDifferenceInBST(). new TreeNode(2);
        MinimumAbsoluteDifferenceInBST.TreeNode n2 = new MinimumAbsoluteDifferenceInBST(). new TreeNode(6);
        MinimumAbsoluteDifferenceInBST.TreeNode n3 = new MinimumAbsoluteDifferenceInBST(). new TreeNode(1);
        MinimumAbsoluteDifferenceInBST.TreeNode n4 = new MinimumAbsoluteDifferenceInBST(). new TreeNode(3);

        n1.left = n3;
        n1.right = n4;
        rootTree1.left = n1;
        rootTree1.right = n2;
        return rootTree1;
    }
}
