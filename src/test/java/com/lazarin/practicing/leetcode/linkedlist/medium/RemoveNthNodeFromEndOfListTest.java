package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;

/**
 * {@link RemoveNthNodeFromEndOfList}
 */
public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

        ListNode head = ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode expected = ListNode.createList(new int[]{1,2,3,5}, 0);
        assertThat(solution.removeNthNodeFromEndOfList(head, 2), equalTo(expected));

        ListNode head2 = ListNode.createList(new int[]{1}, 0);
        assertThat(solution.removeNthNodeFromEndOfList(head2, 2), is(nullValue()));

        ListNode head3 = ListNode.createList(new int[]{1,2}, 0);
        ListNode expected3 = ListNode.createList(new int[]{1}, 0);
        assertThat(solution.removeNthNodeFromEndOfList(head3, 1), equalTo(expected3));

    }
}
