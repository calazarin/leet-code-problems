package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MergeTwoSortedLists}
 */
public class MergeTwoSortedListsTest {

    @Test
    public void shouldReturnExpectedAnswersApproach1() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode input = ListNode.createList(new int[]{1,2,4}, 0);
        ListNode input2 = ListNode.createList(new int[]{1,3,4}, 0);
        ListNode answer = solution.mergeTwoLists(input, input2);
        assertThat(answer, is(ListNode.createList(new int[]{1,1,2,3,4,4}, 0)));
    }

    @Test
    public void shouldReturnExpectedAnswersApproach2() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode input = ListNode.createList(new int[]{1,2,4}, 0);
        ListNode input2 = ListNode.createList(new int[]{1,3,4}, 0);
        ListNode answer = solution.mergeTwoLists2(input, input2);
        assertThat(answer, is(ListNode.createList(new int[]{1,1,2,3,4,4}, 0)));
    }
}