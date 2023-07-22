package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * {@link ReverseLinkedList}
 */
public class ReverseLinkedListTest {

    @Test
    public void shouldReturnExpectedAnswers_test_approach1() {

        ReverseLinkedList solution = new ReverseLinkedList();

        ListNode input = ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode expectedOutput = ListNode.createList(new int[]{5,4,3,2,1}, 0);
        ListNode output = solution.reverseList(input);
        assertThat(output, is(expectedOutput));
    }

    @Test
    public void shouldReturnExpectedAnswers_test_approach2() {

        ReverseLinkedList solution = new ReverseLinkedList();

        ListNode input = ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode expectedOutput = ListNode.createList(new int[]{5,4,3,2,1}, 0);
        ListNode output = solution.reverseListRecursively(input);
        assertThat(output, is(expectedOutput));

    }
}
