package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link SwappingNodesInALinkedList}
 */
class SwappingNodesInALinkedListTest {

    @Test
    void shouldReturnExpectedAnswers_approach1() {

        SwappingNodesInALinkedList solution = new SwappingNodesInALinkedList();

        ListNode input =  ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode expectedOutput =  ListNode.createList(new int[]{1,4,3,2,5}, 0);
        assertThat(solution.swapNodes(input, 2), is(expectedOutput));

        ListNode input2 =  ListNode.createList(new int[]{7,9,6,6,7,8,3,0,9,5}, 0);
        ListNode expectedOutput2 =  ListNode.createList(new int[]{7,9,6,6,8,7,3,0,9,5}, 0);
        assertThat(solution.swapNodes(input2, 5), is(expectedOutput2));
    }

    @Test
    void shouldReturnExpectedAnswers_approach2() {

        SwappingNodesInALinkedList solution = new SwappingNodesInALinkedList();

        ListNode input =  ListNode.createList(new int[]{1,2,3,4,5}, 0);
        ListNode expectedOutput =  ListNode.createList(new int[]{1,4,3,2,5}, 0);
        assertThat(solution.swapNodes2(input, 2), is(expectedOutput));

        ListNode input2 =  ListNode.createList(new int[]{7,9,6,6,7,8,3,0,9,5}, 0);
        ListNode expectedOutput2 =  ListNode.createList(new int[]{7,9,6,6,8,7,3,0,9,5}, 0);
        assertThat(solution.swapNodes2(input2, 5), is(expectedOutput2));
    }
}
