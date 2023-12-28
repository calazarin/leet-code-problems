package com.lazarin.practicing.leetcode.stack.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NaryTreePreorderTraversal}
 */
public class NaryTreePreorderTraversalTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        NaryTreePreorderTraversal solution = new NaryTreePreorderTraversal();

        NaryTreePreorderTraversal.Node root = new NaryTreePreorderTraversal(). new Node(1,
                Arrays.asList(
                        new NaryTreePreorderTraversal(). new Node(3,
                                Arrays.asList(
                                        new NaryTreePreorderTraversal(). new Node(5),
                                        new NaryTreePreorderTraversal(). new Node(6)
                                )),
                        new NaryTreePreorderTraversal(). new Node(2),
                        new NaryTreePreorderTraversal(). new Node(4)
                ));

        assertThat(solution.preorder(root), is(Arrays.asList(1,3,5,6,2,4)));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        NaryTreePreorderTraversal solution = new NaryTreePreorderTraversal();

        NaryTreePreorderTraversal.Node root = new NaryTreePreorderTraversal(). new Node(1,
                Arrays.asList(
                        new NaryTreePreorderTraversal(). new Node(3,
                                Arrays.asList(
                                        new NaryTreePreorderTraversal(). new Node(5, new ArrayList<>()),
                                        new NaryTreePreorderTraversal(). new Node(6, new ArrayList<>())
                                )),
                        new NaryTreePreorderTraversal(). new Node(2, new ArrayList<>()),
                        new NaryTreePreorderTraversal(). new Node(4, new ArrayList<>())
                ));

        assertThat(solution.preorder_2(root), is(Arrays.asList(1,3,5,6,2,4)));
    }
}
