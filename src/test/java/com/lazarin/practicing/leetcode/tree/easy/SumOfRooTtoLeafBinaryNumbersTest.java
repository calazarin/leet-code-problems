package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link SumOfRooTtoLeafBinaryNumbers}
 */
public class SumOfRooTtoLeafBinaryNumbersTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        SumOfRooTtoLeafBinaryNumbers solution = new SumOfRooTtoLeafBinaryNumbers();
        assertThat(solution.sumRootToLeaf(createTree()), is(22));
    }

    private SumOfRooTtoLeafBinaryNumbers.TreeNode createTree(){
        SumOfRooTtoLeafBinaryNumbers.TreeNode rootTree1 = new SumOfRooTtoLeafBinaryNumbers(). new TreeNode(1);
        SumOfRooTtoLeafBinaryNumbers.TreeNode n1 = new SumOfRooTtoLeafBinaryNumbers(). new TreeNode(0);
        SumOfRooTtoLeafBinaryNumbers.TreeNode n2 = new SumOfRooTtoLeafBinaryNumbers(). new TreeNode(1);
        SumOfRooTtoLeafBinaryNumbers.TreeNode n3 = new SumOfRooTtoLeafBinaryNumbers(). new TreeNode(0);
        SumOfRooTtoLeafBinaryNumbers.TreeNode n4 = new SumOfRooTtoLeafBinaryNumbers(). new TreeNode(1);
        SumOfRooTtoLeafBinaryNumbers.TreeNode n5 = new SumOfRooTtoLeafBinaryNumbers(). new TreeNode(0);
        SumOfRooTtoLeafBinaryNumbers.TreeNode n6 = new SumOfRooTtoLeafBinaryNumbers(). new TreeNode(1);

        n1.left = n3;
        n1.right = n4;

        n2.left = n5;
        n2.right = n6;

        rootTree1.left = n2;
        rootTree1.right = n1;

        return rootTree1;
    }
}
