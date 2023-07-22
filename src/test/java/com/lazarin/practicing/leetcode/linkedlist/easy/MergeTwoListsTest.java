package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MergeTwoLists}
 */
public class MergeTwoListsTest {

    @Test
    public void shouldReturnExpectedAnswers_test_approach1() {

        MergeTwoLists solution = new MergeTwoLists();

        ListNode input1 = ListNode.createList(new int[]{1,2,3}, 0);
        ListNode input2 = ListNode.createList(new int[]{1,3,4}, 0);

        ListNode expectedOutput = ListNode.createList(new int[]{1,1,2,3,3,4}, 0);
        ListNode output = solution.mergeTwoLists(input1, input2);

        assertThat(output, is(expectedOutput));
    }
}
