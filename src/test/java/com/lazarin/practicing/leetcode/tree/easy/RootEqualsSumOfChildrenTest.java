package com.lazarin.practicing.leetcode.tree.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link RootEqualsSumOfChildren}
 */
public class RootEqualsSumOfChildrenTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        RootEqualsSumOfChildren solution = new RootEqualsSumOfChildren();
        assertThat(solution.checkTree(createTree()), is(true));
    }

    private RootEqualsSumOfChildren.TreeNode createTree(){
        RootEqualsSumOfChildren.TreeNode rootTree1 = new RootEqualsSumOfChildren(). new TreeNode(10);
        RootEqualsSumOfChildren.TreeNode n1 = new RootEqualsSumOfChildren(). new TreeNode(4);
        RootEqualsSumOfChildren.TreeNode n2 = new RootEqualsSumOfChildren(). new TreeNode(6);
        rootTree1.left = n2;
        rootTree1.right = n1;
        return rootTree1;
    }
}
