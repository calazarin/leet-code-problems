package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link RangeSumOfBst}
 */
public class RangeSumOfBstTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        RangeSumOfBst solution = new RangeSumOfBst();
        assertThat(solution.rangeSumBST(createTree(), 7, 15), is(32));
    }

    private RangeSumOfBst.TreeNode createTree(){
        RangeSumOfBst.TreeNode rootTree1 = new RangeSumOfBst(). new TreeNode(10);
        RangeSumOfBst.TreeNode n1 = new RangeSumOfBst(). new TreeNode(5);
        RangeSumOfBst.TreeNode n2 = new RangeSumOfBst(). new TreeNode(15);
        RangeSumOfBst.TreeNode n3 = new RangeSumOfBst(). new TreeNode(3);
        RangeSumOfBst.TreeNode n4 = new RangeSumOfBst(). new TreeNode(7);
        RangeSumOfBst.TreeNode n5 = new RangeSumOfBst(). new TreeNode(15);

        n1.left = n3;
        n1.right = n4;
        n2.right = n5;
        rootTree1.left = n1;
        rootTree1.right = n2;

        return rootTree1;
    }
}
