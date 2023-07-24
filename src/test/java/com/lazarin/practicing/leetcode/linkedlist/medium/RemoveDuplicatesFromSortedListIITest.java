package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static com.lazarin.practicing.leetcode.linkedlist.ListNode.createList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * {@link RemoveDuplicatesFromSortedListII}
 */
public class RemoveDuplicatesFromSortedListIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();

        ListNode input = createList(new int[]{1,2,3,3,4,4,5}, 0);
        ListNode expected = createList(new int[]{1,2,5}, 0);
        assertThat(solution.deleteDuplicates(input), equalTo(expected));

        ListNode input2 = createList(new int[]{1,1,1,2,3}, 0);
        ListNode expected2 = createList(new int[]{2,3}, 0);
        assertThat(solution.deleteDuplicates(input2), equalTo(expected2));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();

        ListNode input = createList(new int[]{1,2,3,3,4,4,5}, 0);
        ListNode expected = createList(new int[]{1,2,5}, 0);
        assertThat(solution.deleteDuplicates2(input), equalTo(expected));

        ListNode input2 = createList(new int[]{1,1,1,2,3}, 0);
        ListNode expected2 = createList(new int[]{2,3}, 0);
        assertThat(solution.deleteDuplicates2(input2), equalTo(expected2));
    }
}
