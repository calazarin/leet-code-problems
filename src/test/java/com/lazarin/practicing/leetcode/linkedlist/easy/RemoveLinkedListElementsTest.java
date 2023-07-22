package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

/**
 * {@link RemoveLinkedListElements}
 */
public class RemoveLinkedListElementsTest {

    @Test
    public void shouldReturnExpectedAnswers_test_approach1() {

        RemoveLinkedListElements solution = new RemoveLinkedListElements();

        ListNode input1 = ListNode.createList(new int[]{1,2,6,3,4,5,6}, 0);
        ListNode expectedOutput1 = ListNode.createList(new int[]{1,2,3,4,5}, 0);

        assertThat(solution.removeElements(input1, 6), is(expectedOutput1));

        assertThat(solution.removeElements(new ListNode(), 1), is(new ListNode()));

        ListNode input3 = ListNode.createList(new int[]{7,7,7,7}, 0);
        assertThat(solution.removeElements(input3, 7), is(nullValue()));

    }
}
