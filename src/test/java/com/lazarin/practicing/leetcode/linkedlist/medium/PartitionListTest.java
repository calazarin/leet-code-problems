package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * {@link PartitionList}
 */
public class PartitionListTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        PartitionList solution = new PartitionList();

        ListNode head = ListNode.createList(new int[]{1,4,3,2,5,2}, 0);
        ListNode expected = ListNode.createList(new int[]{1,2,2,4,3,5}, 0);
        assertThat(solution.partition(head, 3), equalTo(expected));

        ListNode head2 = ListNode.createList(new int[]{2,1}, 0);
        ListNode expected2 = ListNode.createList(new int[]{1,2}, 0);
        assertThat(solution.partition(head2, 2), equalTo(expected2));

    }
}
