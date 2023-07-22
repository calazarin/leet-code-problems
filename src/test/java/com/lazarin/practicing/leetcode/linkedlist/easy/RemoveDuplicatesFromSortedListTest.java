package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link RemoveDuplicatesFromSortedList}
 */
public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void shouldReturnExpectedAnswers_test_approach1() {

        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

        ListNode input1 = ListNode.createList(new int[]{1,1,2}, 0);
        ListNode expectedOutput1 = ListNode.createList(new int[]{1,2}, 0);

        assertThat(solution.deleteDuplicates(input1), is(expectedOutput1));

        ListNode input2 = ListNode.createList(new int[]{1,1,2,3,3}, 0);
        ListNode expectedOutput2 = ListNode.createList(new int[]{1,2,3}, 0);

        assertThat(solution.deleteDuplicates(input2), is(expectedOutput2));
    }

}
