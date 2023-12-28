package com.lazarin.practicing.leetcode.stack.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NaryTreePostorderTraversal}
 */
public class NaryTreePostorderTraversalTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        NaryTreePostorderTraversal solution = new NaryTreePostorderTraversal();

        NaryTreePostorderTraversal.Node root = new NaryTreePostorderTraversal(). new Node(1,
                Arrays.asList(
                        new NaryTreePostorderTraversal(). new Node(3,
                                Arrays.asList(
                                        new NaryTreePostorderTraversal(). new Node(5, new ArrayList<>()),
                                        new NaryTreePostorderTraversal(). new Node(6, new ArrayList<>())
                                )),
                        new NaryTreePostorderTraversal(). new Node(2, new ArrayList<>()),
                        new NaryTreePostorderTraversal(). new Node(4, new ArrayList<>())
                ));

        assertThat(solution.postorder(root), is(Arrays.asList(5,6,3,2,4,1)));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        NaryTreePostorderTraversal solution = new NaryTreePostorderTraversal();

        NaryTreePostorderTraversal.Node root = new NaryTreePostorderTraversal(). new Node(1,
                Arrays.asList(
                        new NaryTreePostorderTraversal(). new Node(3,
                                Arrays.asList(
                                        new NaryTreePostorderTraversal(). new Node(5, new ArrayList<>()),
                                        new NaryTreePostorderTraversal(). new Node(6, new ArrayList<>())
                                )),
                        new NaryTreePostorderTraversal(). new Node(2, new ArrayList<>()),
                        new NaryTreePostorderTraversal(). new Node(4, new ArrayList<>())
                ));

        assertThat(solution.postorder_2(root), is(Arrays.asList(5,6,3,2,4,1)));
    }

}
