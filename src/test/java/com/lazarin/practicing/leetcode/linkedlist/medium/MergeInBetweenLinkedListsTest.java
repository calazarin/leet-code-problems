package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MergeInBetweenLinkedLists}
 */
class MergeInBetweenLinkedListsTest {

    @Test
    void shouldReturnExpectedAnswers_approach1() {
        MergeInBetweenLinkedLists solution = new MergeInBetweenLinkedLists();

        ListNode input1 = ListNode.createList(new int[]{10,1,13,6,9,5}, 0);
        ListNode input1List2 = ListNode.createList(new int[]{1000000,1000001,1000002}, 0);
        ListNode expectedOutput1 =  ListNode.createList(new int[]{10,1,13,1000000,1000001,1000002,5}, 0);

        assertThat(solution.mergeInBetween(input1,3,4,input1List2), is(expectedOutput1));

        ListNode input2 = ListNode.createList(new int[]{0,1,2,3,4,5,6}, 0);
        ListNode input2List2 = ListNode.createList(new int[]{1000000,1000001,1000002,1000003,1000004}, 0);
        ListNode expectedOutput2 =  ListNode.createList(new int[]{0,1,1000000,1000001,1000002,1000003,1000004,6}, 0);

        assertThat(solution.mergeInBetween(input2, 2, 5, input2List2), is(expectedOutput2));
    }
}
