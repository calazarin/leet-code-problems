package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MergeNodesInBetweenZeros}
 */
class MergeNodesInBetweenZerosTest {

    @Test
    void shouldReturnExpectedAnswers_approach1() {
        MergeNodesInBetweenZeros solution = new MergeNodesInBetweenZeros();
        ListNode expectedInput1 =  ListNode.createList(new int[]{4,11}, 0);

        ListNode input = ListNode.createList(new int[]{0,3,1,0,4,5,2,0}, 0);
        assertThat(solution.mergeNodes(input), is(expectedInput1));

        ListNode expectedInput2 =  ListNode.createList(new int[]{1,3,4}, 0);
        ListNode input2 = ListNode.createList(new int[]{0,1,0,3,0,2,2,0}, 0);
        assertThat(solution.mergeNodes(input2), is(expectedInput2));
    }
}
