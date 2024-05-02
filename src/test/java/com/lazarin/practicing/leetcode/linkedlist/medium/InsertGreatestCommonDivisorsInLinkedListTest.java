package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link InsertGreatestCommonDivisorsInLinkedList}
 */
class InsertGreatestCommonDivisorsInLinkedListTest {

    @Test
    void shouldReturnExpectedAnswers_approach1() {

        InsertGreatestCommonDivisorsInLinkedList solution = new InsertGreatestCommonDivisorsInLinkedList();

        ListNode input =  ListNode.createList(new int[]{18,6,10,3}, 0);
        ListNode expectedOutput =  ListNode.createList(new int[]{18,6,6,2,10,1,3}, 0);
        assertThat(solution.insertGreatestCommonDivisors(input), is(expectedOutput));

        ListNode input2 =  ListNode.createList(new int[]{7}, 0);
        ListNode expectedOutput2 =  ListNode.createList(new int[]{7}, 0);
        assertThat(solution.insertGreatestCommonDivisors(input2), is(expectedOutput2));
    }
}
