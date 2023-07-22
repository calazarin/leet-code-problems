package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * {@link OddEvenLinkedList}
 */
public class OddEvenLinkedListTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        OddEvenLinkedList solution = new OddEvenLinkedList();

        ListNode head = ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode expected = ListNode.createList(new int[]{1,3,5,2,4}, 0);
        assertThat(solution.oddEvenList(head), equalTo(expected));

        ListNode head2 = ListNode.createList(new int[]{2,1,3,5,6,4,7}, 0);
        ListNode expected2 = ListNode.createList(new int[]{2,3,6,7,1,5,4}, 0);
        assertThat(solution.oddEvenList(head2), equalTo(expected2));

    }
}
