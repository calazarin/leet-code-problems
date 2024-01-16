package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MiddleOfLinkedListTest {

    @Test
    public void shouldReturnExpectedAnswersApproach1_testCase1() {
        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        ListNode input = ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode answer = solution.middleNode(input);
        assertThat(answer, is(ListNode.createList(new int[]{3,4,5}, 0)));
    }

    @Test
    public void shouldReturnExpectedAnswersApproach1_testCase2() {
        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        ListNode input = ListNode.createList(new int[]{1,2,3,4,5,6}, 0);
        ListNode answer = solution.middleNode(input);
        assertThat(answer, is(ListNode.createList(new int[]{4,5,6}, 0)));
    }

}
