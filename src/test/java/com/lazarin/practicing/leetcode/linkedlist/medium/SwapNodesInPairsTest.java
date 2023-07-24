package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link SwapNodesInPairs}
 */
public class SwapNodesInPairsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        SwapNodesInPairs solution = new SwapNodesInPairs();

        ListNode input = ListNode.createList(new int[]{1,2,3,4}, 0);
        ListNode expected = ListNode.createList(new int[]{2,1,4,3}, 0);
        assertThat(solution.swapPairs(input), is(expected));

        ListNode input2 = ListNode.createList(new int[]{1}, 0);
        ListNode expected2 = ListNode.createList(new int[]{1}, 0);
        assertThat(solution.swapPairs(input2), is(expected2));

    }

}
