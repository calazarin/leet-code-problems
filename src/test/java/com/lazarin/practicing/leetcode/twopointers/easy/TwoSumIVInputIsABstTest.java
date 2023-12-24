package com.lazarin.practicing.leetcode.twopointers.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link TwoSumIVInputIsABst}
 */
public class TwoSumIVInputIsABstTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        TwoSumIVInputIsABst solution = new TwoSumIVInputIsABst();

        TwoSumIVInputIsABst.TreeNode root = new TwoSumIVInputIsABst().new TreeNode(5);
        root.left = new TwoSumIVInputIsABst(). new TreeNode(3,
                new TwoSumIVInputIsABst(). new TreeNode(2),
                new TwoSumIVInputIsABst(). new TreeNode(4));
        root.right = new TwoSumIVInputIsABst(). new TreeNode(6, null, new TwoSumIVInputIsABst(). new TreeNode(7));

        assertThat(solution.findTarget(root, 9), is(true));
        assertThat(solution.findTarget(root, 28), is(true));
    }
}
