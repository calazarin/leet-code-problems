package com.lazarin.practicing.leetcode.linkedlist.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

/**
 * {@link ReorderList}
 */
public class ReorderListTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        ReorderList solution = new ReorderList();

        ListNode input = ListNode.createList(new int[]{1, 2, 3, 4}, 0);
        solution.reorderList(input);
        ListNode expected = ListNode.createList(new int[]{1, 4, 2, 3}, 0);
        assertThat(input, is(expected));

    }
}
