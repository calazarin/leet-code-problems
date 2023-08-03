package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaxTwinSumOfLinkedList}
 */
public class MaxTwinSumOfLinkedListTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        MaxTwinSumOfLinkedList solution = new MaxTwinSumOfLinkedList();

        ListNode input = ListNode.createList(new int[]{5,4,2,1}, 0);
        assertThat(solution.pairSum(input), is(6));

        ListNode input2 = ListNode.createList(new int[]{4,2,2,3}, 0);
        assertThat(solution.pairSum(input2), is(7));

        ListNode input3 = ListNode.createList(new int[]{1,100000}, 0);
        assertThat(solution.pairSum(input3), is(100001));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        MaxTwinSumOfLinkedList solution = new MaxTwinSumOfLinkedList();

        ListNode input = ListNode.createList(new int[]{5,4,2,1}, 0);
        assertThat(solution.pairSum2(input), is(6));

        ListNode input2 = ListNode.createList(new int[]{4,2,2,3}, 0);
        assertThat(solution.pairSum2(input2), is(7));

        ListNode input3 = ListNode.createList(new int[]{1,100000}, 0);
        assertThat(solution.pairSum2(input3), is(100001));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {
        MaxTwinSumOfLinkedList solution = new MaxTwinSumOfLinkedList();

        ListNode input = ListNode.createList(new int[]{5,4,2,1}, 0);
        assertThat(solution.pairSum3(input), is(6));

        ListNode input2 = ListNode.createList(new int[]{4,2,2,3}, 0);
        assertThat(solution.pairSum3(input2), is(7));

        ListNode input3 = ListNode.createList(new int[]{1,100000}, 0);
        assertThat(solution.pairSum3(input3), is(100001));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach4() {
        MaxTwinSumOfLinkedList solution = new MaxTwinSumOfLinkedList();

        ListNode input = ListNode.createList(new int[]{5,4,2,1}, 0);
        assertThat(solution.pairSum4(input), is(6));

        ListNode input2 = ListNode.createList(new int[]{4,2,2,3}, 0);
        assertThat(solution.pairSum4(input2), is(7));

        ListNode input3 = ListNode.createList(new int[]{1,100000}, 0);
        assertThat(solution.pairSum4(input3), is(100001));
    }
}
